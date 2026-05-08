package ud11.ejercicios.iv_ejercicio1;

public class Incineradora {
	private int tiempo;
	private static int animalesIncinerados;
	private TipoIncineradora tipo;
	
	public Incineradora(TipoIncineradora tipo) {
		this.tiempo = 0;
		Incineradora.animalesIncinerados = 0;
		this.tipo = tipo;
	}
	
	public void incinerar(Animal a) {
		if (a instanceof Cerdo && a.getEstado().equals(EstadoAnimal.PESTE)) {
			this.tiempo += (int) (Math.random() * 21) + 80;
			Incineradora.animalesIncinerados++;
		} else if (a instanceof Vaca && a.getEstado().equals(EstadoAnimal.ENCEFALOPATIA_ESPONJIFORME)) {
			this.tiempo += 160;
			Incineradora.animalesIncinerados++;
		}
	}
	
	public TipoIncineradora getTipo() {
		return tipo;
	}

	public void setTipo(TipoIncineradora tipo) {
		this.tipo = tipo;
	}

	public static int getAnimalesIncinerados() {
		return animalesIncinerados;
	}

	public static void setAnimalesIncinerados(int animalesIncinerados) {
		Incineradora.animalesIncinerados = animalesIncinerados;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
	
}
