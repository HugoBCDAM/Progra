package ud11.ejercicios.iv_ejercicio1;

public class Animal {
	
	private String nombre, raza, fechaNacimiento;
	private double peso;
	private char sexo;
	private static int numeroAnimales, animalesIncinerados;
	private boolean encefalopatia, peste;
	
	public Animal(String nombre, String raza, double peso, char sexo, String fechaNacimiento) {
		this.nombre = nombre;
		this.raza = raza;
		this.peso = peso;
		this.sexo = sexo;
		this.fechaNacimiento = fechaNacimiento;
		this.encefalopatia = false;
		this.peste = false;
		Animal.numeroAnimales++;
	}
	
	public void examinar() {
		int probabilidad = (int) Math.random() * 101;
		if (this instanceof VacaPropia) {
			if (probabilidad >= 0 && probabilidad <= 20) {
				this.setEncefalopatia(true);
			}
		} else if (this instanceof VacaImportacion) {
			if (probabilidad >= 0 && probabilidad <= 30) {
				this.setEncefalopatia(true);
			}
		} else if (this instanceof CerdoPropio) {
			if (probabilidad >= 0 && probabilidad <= 10) {
				this.setPeste(true);
			}
		} else if (this instanceof Cerdo) {
			if (probabilidad >= 0 && probabilidad <= 40) {
				this.setPeste(true);
			}
		}
	}
	
	public void incinerar() {
		if (this.isEncefalopatia() || this.isPeste()) {
			Animal.animalesIncinerados++;
		}
	}
	
	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", raza=" + raza + ", fechaNacimiento=" + fechaNacimiento + ", peso=" + peso
				+ ", sexo=" + sexo + ", encefalopatia=" + encefalopatia + ", peste=" + peste + "]";
	}

	public boolean isEncefalopatia() {
		return encefalopatia;
	}

	public void setEncefalopatia(boolean encefalopatia) {
		this.encefalopatia = encefalopatia;
	}

	public boolean isPeste() {
		return peste;
	}

	public void setPeste(boolean peste) {
		this.peste = peste;
	}

	public static int getAnimalesIncinerados() {
		return animalesIncinerados;
	}

	public static void setAnimalesIncinerados(int animalesIncinerados) {
		Animal.animalesIncinerados = animalesIncinerados;
	}

	public static int getNumeroAnimales() {
		return numeroAnimales;
	}
	
	public static void setNumeroAnimales(int numeroAnimales) {
		Animal.numeroAnimales = numeroAnimales;
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

	
}
