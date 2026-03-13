package ud5.ejercicios;

import java.util.Scanner;

public class II_Ejercicio4 {

	public static int contarPalabras(String cadena) {
		
		String palabras[] = cadena.split(" ");
			
		return palabras.length;
		
	}
	
	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduzca una cadena");
		String cadena = leer.nextLine();
		
		System.out.println("La cadena tiene un total de " + contarPalabras(cadena) + " palabras");
		
		leer.close();
		
	}
	
}
