package ud5.ejercicios;

import java.util.Scanner;

public class II_Ejercicio5 {

	public static boolean esPerfecto(int numero) {
		
		int suma = 0;
		boolean perfecto = false;
		
		for(int i = 1; i < numero; i++) {
			
			if (numero % i == 0) {
				
				suma += i;
				
			}
			
		}
		
		if (suma == numero) {
			
			perfecto = true;
			
		}
		
		return perfecto;
		
	}
	
	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduzca un número");
		int numero = leer.nextInt();
		
		boolean perfecto = esPerfecto(numero);
		
		if (perfecto) {
			
			System.out.println("El numero " + numero + " es un número perfecto");
			
		} else {
			
			System.out.println("El numero " + numero + " no es un número perfecto");
			
		}
		
		leer.close();
		
	}
	
}
