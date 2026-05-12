package ud11.ejercicios.vi_ejercicio1;

public class Estudiante implements Comparable<Estudiante>{
	
	private String nombre;
	private int edad;
	private double notaMedia;
	
	public Estudiante(String nombre, int edad, double nota) {
		this.nombre = nombre;
		this.edad = edad;
		this.notaMedia = nota;
	}
	
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", edad=" + edad + ", notaMedia=" + notaMedia + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}
	
	@Override
	public int compareTo(Estudiante o) {
		return this.getNombre().compareTo(o.getNombre());
	}
	
}
