package ud10.ejercicios.v_ejercicio1;

public class Alumno {
	
	String nombre;
	int edad, nota;
	
	public Alumno(String nombre, int edad, int nota) {
		this.nombre = nombre;
		this.edad = edad;
		this.nota = nota;
	}
	
	public void ordenarNombre(Alumno a) {
		
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
	
}
