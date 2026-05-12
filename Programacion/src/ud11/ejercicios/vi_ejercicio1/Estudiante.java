package ud11.ejercicios.vi_ejercicio1;

public class Estudiante implements Comparable<Estudiante> {
	
	private String nombre;
	private int edad;
	private double nota;
	
	public Estudiante(String nombre, int edad, double nota) {
		this.nombre = nombre;
		this.edad = edad;
		this.nota = nota;
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

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	@Override
	public int compareTo(Estudiante o) {
		return this.nombre.compareTo(o.nombre);
	}
	
}
