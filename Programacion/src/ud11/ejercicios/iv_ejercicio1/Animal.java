package ud11.ejercicios.iv_ejercicio1;

public class Animal implements Comparable<Animal> {
	
	private String nombre, raza, fechaNacimiento;
	private double peso;
	private char sexo;
	private EstadoAnimal estado;
	
	public Animal(String nombre, String raza, double peso, char sexo, String fechaNacimiento) {
		this.nombre = nombre;
		this.raza = raza;
		this.peso = peso;
		this.sexo = sexo;
		this.fechaNacimiento = fechaNacimiento;
		this.estado = EstadoAnimal.SIN_EXAMINAR;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + this.getNombre() + "\nRaza: " + this.getRaza() + "\nPeso: " + this.getPeso() + "\nSexo" + this.getSexo() 
		+ "\nFecha de Nacimiento: " + this.getFechaNacimiento() + "\nEstado: " + this.getEstado();
	}
	
	public EstadoAnimal getEstado() {
		return estado;
	}

	public void setEstado(EstadoAnimal estado) {
		this.estado = estado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	@Override
	public int compareTo(Animal o) {
		if (this.getPeso() > o.getPeso()) {
			return -1;
		} else if (this.getPeso() < o.getPeso()) {
			return 1;
		}
		
		return this.getNombre().compareTo(o.getNombre());
	}
}
