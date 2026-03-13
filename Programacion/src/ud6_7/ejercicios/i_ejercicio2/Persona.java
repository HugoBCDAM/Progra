package ud6_7.ejercicios.i_ejercicio2;

public class Persona {

	private String dni, nombre, apellidos;
	private int edad;

	public Persona() {}
	
	public Persona(String dni, String nombre, String apellidos, int edad) {
		
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		
	}
	
	public void imprime() {
		
		System.out.println("DNI: "+ this.dni);
		System.out.println("NOMBRE: " + this.nombre);
		System.out.println("APELLIDOS: " + this.apellidos);
		System.out.println("EDAD: " + this.edad);
		
	}
	
	public boolean esMayorEdad() {
		
		boolean mayorEdad = false;
		
		if (this.edad >= 18) {
			
			mayorEdad = true;
			
		}
		
		return mayorEdad;
		
	}
	
	public boolean esJubilado() {
		
		return this.edad >= 65;
		
	}
	
	public int diferenciaEdad(Persona p) {
		
		return Math.abs(this.edad - p.edad);	
		
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
