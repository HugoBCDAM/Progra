package ud10.ejercicios.ix_ejercicio1;

public class Arbol extends Planta {
	
	private final int MAX_AGUA = 100;
	
	private int edad;
	private String tipoHoja;
	
	public Arbol(String nombre, String id, double altura, int edad, String tipoHoja) {
		super(nombre, id, altura);
		this.edad = edad;
		this.setTipoHoja(tipoHoja);
	}
	
	@Override
	public void crecer() {
		double crecimientoBase = this.getMAX_AGUA() * 0.05;
		double reduccionEdad = this.getEdad() * 0.2;
		
		double crecimiento = crecimientoBase - reduccionEdad;
		
		if (crecimiento < 0) {
			crecimiento = 0;
		}
		
		this.setEdad(this.getEdad() + 1);
		
		System.out.println("El árbol ha crecido " + crecimiento + " unidades");
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getTipoHoja() {
		return tipoHoja;
	}
	public void setTipoHoja(String tipoHoja) {
		if (tipoHoja.equalsIgnoreCase("caduca") || tipoHoja.equalsIgnoreCase("perenne")) {
			this.tipoHoja = tipoHoja;
		}
	}
	public int getMAX_AGUA() {
		return MAX_AGUA;
	}
	
}
