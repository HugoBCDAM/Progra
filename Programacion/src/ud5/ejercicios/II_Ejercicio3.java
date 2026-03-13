package ud5.ejercicios;

import java.util.Scanner;

public class II_Ejercicio3 {

	public static String invertirCadena(String cadena) {
		
		String cadenaInvertida  = "";
		
		for (int i = cadena.length() - 1; i >= 0; i--) {
			
			cadenaInvertida += cadena.charAt(i);
			
		}
		
		return cadenaInvertida;
		
	}
	
	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		String cadena;
		
		System.out.println("Introduzca una cadena");
		cadena = leer.nextLine();
		
		System.out.println("Al invertir la cadena introducida, se queda en: " + invertirCadena(cadena));
		
		leer.close();
		
	}
		
		
		
	
	
}
