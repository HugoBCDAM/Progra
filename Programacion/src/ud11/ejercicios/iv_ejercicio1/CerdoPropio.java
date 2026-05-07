package ud11.ejercicios.iv_ejercicio1;

public class CerdoPropio extends Cerdo {
	
	private String nombrePadre, nombreMadre;
	
	public CerdoPropio(String nombre, String raza, double peso, char sexo, String fechaNacimiento, TipoJamon tipoJamon, String nombrePadre, String nombreMadre) {
		super(nombre, raza, peso, sexo, fechaNacimiento, tipoJamon);
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
		return "CerdoPropio [nombrePadre=" + nombrePadre + ", nombreMadre=" + nombreMadre + "]";
	}
	
}
