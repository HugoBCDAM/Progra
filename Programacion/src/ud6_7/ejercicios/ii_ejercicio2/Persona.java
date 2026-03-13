package ud6_7.ejercicios.ii_ejercicio2;

public class Persona {
	
	private String nombre = "";
	String dni;
	private final char SEXO = 'H';
	private char sexo = SEXO;
	private int edad;
	private double peso, altura;
	final int SOBREPESO = 1, INFRA_PESO = -1, PESO_IDEAL = 0;
	
	public Persona() {
		
		this.dni = generaDNI();
		
	}
	
	public Persona(String nombre, int edad, char sexo) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.comprobarSexo(sexo);
		this.dni = generaDNI();
		
	}
	
	public Persona(String nombre, String dni, int edad, char sexo, double peso, double altura) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.comprobarSexo(sexo);
		this.dni = dni;
		this.peso = peso;
		this.altura = altura;
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int calcularIMC() {
		
		if (this.peso / (this.altura * this.altura) < 20) {
			
			return INFRA_PESO;
			
		} else if (this.peso / (this.altura * this.altura) > 25) {
			
			return SOBREPESO;
			
		} else {
			
			return INFRA_PESO;
			
		}
		
		
	}
	
	public boolean esMayorDeEdad() {
		
		return this.edad >= 18;
		
	}
	
	private void comprobarSexo(char sexo) {
		
		if (sexo != 'M' && sexo != 'H') {
			
			this.sexo = this.SEXO;
			
		} else {
			
			this.sexo = sexo;
			
		}
		
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + ", sexo=" + sexo + ", edad=" + edad + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
	
	public String generaDNI() {
		
		int numero = numeroAleatorio();
	    String dni = numero + letraAleatoria(numero);
	    return dni;
		
	}
	
	public int numeroAleatorio() {
		
		int numero = 0;

	    for (int i = 0; i < 8; i++) {
	    	
	        numero = (int)(Math.random() * 99999999) + 10000000;
	        
	    }

	    return numero;
		
	}
	
	public String letraAleatoria(int numero) {
		
		final String arrayLetras[] = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
		
		return arrayLetras[numero % 23];
		
	}
	
}
