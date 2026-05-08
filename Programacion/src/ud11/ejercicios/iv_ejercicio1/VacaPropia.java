package ud11.ejercicios.iv_ejercicio1;

public class VacaPropia extends Vaca {
	
	private String nombrePadre, nombreMadre;
	
	public VacaPropia(String nombre, String raza, double peso, char sexo, String fechaNacimiento, boolean lechera, String nombrePadre, String nombreMadre) {
		super(nombre, raza, peso, sexo, fechaNacimiento, lechera);
		this.nombrePadre = nombrePadre;
		this.nombreMadre = nombreMadre;
	}

	public String getNombrePadre() {
		return nombrePadre;
	}

	public void setNombrePadre(String nombrePadre) {
		this.nombrePadre = nombrePadre;
	}

	public String getNombreMadre() {
		return nombreMadre;
	}

	public void setNombreMadre(String nombreMadre) {
		this.nombreMadre = nombreMadre;
	}

	@Override
	public String toString() {
		return super.toString() + "\nNombre del padre: " + this.getNombrePadre() + "\nNombre de la madre: " + this.getNombreMadre();
	}
	
}
