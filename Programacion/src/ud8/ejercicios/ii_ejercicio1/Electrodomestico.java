package ud8.ejercicios.ii_ejercicio1;

public class Electrodomestico {
	
	// CONSTANTES
	private static final String COLOR = "blanco";
	private static final char CONSUMO_ENERGETICO = 'F';
	private static final int PRECIO_BASE = 100;
	private static final double PESO = 5;
	private static final String[] COLORES_DISPONIBLES = new String[5];
	private static final char[] LETRAS_CONSUMO = new char[6];
	
	// ATRIBUTOS
	private int precioBase;
	private String color;
	private char consumoEnergetico;
	private double peso;
	
	// CONSTRUCTORES
	public Electrodomestico() {
		this.precioBase = Electrodomestico.PRECIO_BASE;
		this.color = Electrodomestico.COLOR;
		this.consumoEnergetico = Electrodomestico.CONSUMO_ENERGETICO;
		this.peso = Electrodomestico.PESO;
	}
	
	public Electrodomestico(int precio, double peso) {
		this.precioBase = precio;
		this.peso = peso;
		this.color = Electrodomestico.COLOR;
		this.consumoEnergetico = Electrodomestico.CONSUMO_ENERGETICO;
	}
	
	public Electrodomestico(int precio, String color, char consumoEnergetico, double peso) {
		this.precioBase = precio;
		comprobarColor(color);
		comprobarConsumoEnergetico(consumoEnergetico);
		this.peso = peso;
	}
	
	// METODOS
	private void comprobarConsumoEnergetico(char consumoEnergetico) {
		boolean letraCorrecta = false;
		
		for (int i = 0; i < Electrodomestico.LETRAS_CONSUMO.length - 1; i++) {
			if (Electrodomestico.LETRAS_CONSUMO[i] == consumoEnergetico) {
				letraCorrecta = true;
				break;
			}
		}
		
		if (!letraCorrecta) {
			this.consumoEnergetico = Electrodomestico.CONSUMO_ENERGETICO;
		} else {
			this.consumoEnergetico = consumoEnergetico;
		}
	}
	
	private void comprobarColor(String color) {
		boolean colorCorrecto = false;
		
		for (int i = 0; i < Electrodomestico.COLORES_DISPONIBLES.length - 1; i++) {
			if (Electrodomestico.COLORES_DISPONIBLES[i].equalsIgnoreCase(color)) {
				colorCorrecto = true;
				break;
			}
		}
		
		if (!colorCorrecto) {
			this.color = Electrodomestico.COLOR;
		} else {
			this.color = color;
		}
	}
	
	public int precioFinal() {
		int precioFinal = this.precioBase;
		
		switch (this.consumoEnergetico) {
			case 'A':
				precioFinal += 100;
				break;
			case 'B':
				precioFinal += 80;
				break;
			case 'C':
				precioFinal += 60;
				break;
			case 'D':
				precioFinal += 50;
				break;
			case 'E':
				precioFinal += 30;
				break;
			case 'F':
				precioFinal += 10;
				break;
			default:
				break;
		}
		
		if (this.peso >= 0 && this.peso <= 19) {
			precioFinal += 10;
		} else if (this.peso >= 20 && this.peso <= 49) {
			precioFinal += 50;
		} else if (this.peso >= 50 && this.peso <= 79) {
			precioFinal += 80;
		} else if (this.peso >= 80) {
			precioFinal += 100;
		}
		
		return precioFinal;
	}
	
	// GETTERS
	public int getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

}
