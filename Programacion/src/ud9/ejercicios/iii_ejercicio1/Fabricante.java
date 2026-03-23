package ud9.ejercicios.iii_ejercicio1;

public class Fabricante {
	
	private String nombre, pais;
	private static int totalFabricantes;
	
	public Fabricante(String nombre) {
		this.nombre = nombre;
		Fabricante.totalFabricantes++;
	}
	
	public Fabricante(String nombre, String pais) {
		this.nombre = nombre;
		this.pais = pais;
		Fabricante.totalFabricantes++;
	}
	
	public static void mostrarNumFabricantes() {
		System.out.println("Total de fabricantes: " + Fabricante.getTotalFabricantes());
	}
	
	@Override
	public String toString() {
		return "Fabricante: " + this.nombre + " - País: " + this.pais;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public static int getTotalFabricantes() {
		return totalFabricantes;
	}

	public static void setTotalFabricantes(int totalFabricantes) {
		Fabricante.totalFabricantes = totalFabricantes;
	}
	
	
	
}
