package ud10.ejercicios.ix_ejercicio1;

public class Flor extends Planta {
	
	private final int MAX_AGUA = 50;
	
	private String color;
	
	public Flor(String nombre, String id, double altura, String color) {
		super(nombre, id, altura);
		this.color = color;
	}
	
	@Override
	public void crecer() {
		double crecimiento = this.getMAX_AGUA() * 0.1;
		
		this.setAltura(this.getAltura() + crecimiento);
		this.setNecesitaAgua(true);
		System.out.println("La flor ha crecido " + crecimiento + " unidades");
	}
	
	@Override
	public void regar(int cantidadAgua) throws RiegoExcesivoException {
		if (!this.isNecesitaAgua()) {
			throw new RiegoExcesivoException("La planta no necesita agua en este momento");
		} else {
			if (this.getMAX_AGUA() < cantidadAgua) {
				throw new RiegoExcesivoException("Cantidad de agua excesiva para esta planta");
			} else {
				this.setNecesitaAgua(false);
				System.out.println("Se aplicó " + cantidadAgua + " cantidad de agua");
			}
		}
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMAX_AGUA() {
		return MAX_AGUA;
	}
	
}
