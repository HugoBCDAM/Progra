package ud8.ejercicios.i_ejercicio1;

public class Persona {

	private String nombre, genero;
	private int edad;

	/* Constructores */

	public Persona() {
	}

	public Persona(String nombre, String genero, int edad) {

		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;

	}

	/* Getters y Setters */

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
