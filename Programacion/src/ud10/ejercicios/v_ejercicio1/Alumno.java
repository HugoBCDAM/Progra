package ud10.ejercicios.v_ejercicio1;

public class Alumno implements Comparable<Alumno>{
	
	String nombre;
	int edad, nota;
	
	public Alumno(String nombre, int edad, int nota) {
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

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	@Override
	public int compareTo(Alumno a) {
		int resultado = a.getNota() - this.nota;
		
		if (resultado == 0 ) {
			return this.nombre.compareTo(a.nombre);
		} else {
			return resultado;
		}
	}
	
}
