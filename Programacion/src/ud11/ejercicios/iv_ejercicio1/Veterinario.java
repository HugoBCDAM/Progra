package ud11.ejercicios.iv_ejercicio1;

public class Veterinario {
	
	private static final int TIEMPO_REVISION_MINUTOS = 12;
	private int tiempo;
	private static int animalesAtendidos;
	private static int animalesIncinerar;
	public Veterinario() {
		this.tiempo = 0;
		Veterinario.animalesAtendidos = 0;
		Veterinario.animalesIncinerar = 0;
	}
	
	public void examinar(Animal a) {
		int probabilidad = (int) (Math.random() * 101);
		if (a instanceof VacaPropia) {
			if (probabilidad >= 0 && probabilidad <= 20) {
				a.setEstado(EstadoAnimal.ENCEFALOPATIA_ESPONJIFORME);
				Veterinario.animalesIncinerar++;
			} else if (probabilidad > 20 && probabilidad <= 80) {
				a.setEstado(EstadoAnimal.SANO);
			} else {
				a.setEstado(EstadoAnimal.CURABLE);
			}
			
			this.tiempo += Veterinario.TIEMPO_REVISION_MINUTOS;
			Veterinario.animalesAtendidos++;
		} else if (a instanceof VacaImportacion) {
			if (probabilidad >= 0 && probabilidad <= 30) {
				a.setEstado(EstadoAnimal.ENCEFALOPATIA_ESPONJIFORME);
				Veterinario.animalesIncinerar++;
			} else if (probabilidad > 30 && probabilidad <= 80) {
				a.setEstado(EstadoAnimal.SANO);
			} else {
				a.setEstado(EstadoAnimal.CURABLE);
			}
			
			this.tiempo += Veterinario.TIEMPO_REVISION_MINUTOS;
			Veterinario.animalesAtendidos++;
		} else if (a instanceof CerdoPropio) {
			if (probabilidad >= 0 && probabilidad <= 10) {
				a.setEstado(EstadoAnimal.PESTE);
				Veterinario.animalesIncinerar++;
			} else if (probabilidad > 10 && probabilidad <= 80) {
				a.setEstado(EstadoAnimal.SANO);
			} else {
				a.setEstado(EstadoAnimal.CURABLE);
			}
			
			this.tiempo += Veterinario.TIEMPO_REVISION_MINUTOS;
			Veterinario.animalesAtendidos++;
		} else if (a instanceof Cerdo) {
			if (probabilidad >= 0 && probabilidad <= 40) {
				a.setEstado(EstadoAnimal.PESTE);
				Veterinario.animalesIncinerar++;
			} else if (probabilidad > 40 && probabilidad <= 80) {
				a.setEstado(EstadoAnimal.SANO);
			} else {
				a.setEstado(EstadoAnimal.CURABLE);
			}
			
			this.tiempo += Veterinario.TIEMPO_REVISION_MINUTOS;
			Veterinario.animalesAtendidos++;
		}
	}
	
	public static int getAnimalesIncinerar() {
		return animalesIncinerar;
	}

	public static void setAnimalesIncinerar(int animalesIncinerar) {
		Veterinario.animalesIncinerar = animalesIncinerar;
	}

	public static int getAnimalesAtendidos() {
		return animalesAtendidos;
	}

	public static void setAnimalesAtendidos(int animalesAtendidos) {
		Veterinario.animalesAtendidos = animalesAtendidos;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public static int getTiempoRevisionMinutos() {
		return TIEMPO_REVISION_MINUTOS;
	}
	
}
