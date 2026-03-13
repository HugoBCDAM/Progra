package ud8.ejercicios.ii_ejercicio1;

public class Lavadora extends Electrodomestico {
	
	// CONSTANTES
	private static final int CARGA_DEFECTO = 5;
	
	// ATRIBUTOS
	private int carga;
	
	// CONSTRUCTORES
	public Lavadora() {
		super();
		this.carga = Lavadora.CARGA_DEFECTO;
	}
	
	public Lavadora (int precio, double peso) {
		super(precio, peso);
	}
	
	public Lavadora (int carga, int precio, String color, char consumoEnergetico, double peso) {
		super(precio, color, consumoEnergetico, peso);
		this.carga = carga;
	}

	// METODOS
	
	
	// GETTERS
	public int getCarga() {
		return carga;
	}

}
