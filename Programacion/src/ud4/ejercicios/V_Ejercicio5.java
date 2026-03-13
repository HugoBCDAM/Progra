package ud4.ejercicios;

import java.util.Scanner;

public class V_Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		int array[] = new int[5];
		boolean esPalindromo = true;
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println("Introduzca los valores del array");
			array[i] = leer.nextInt();
			
		}
		
		for (int i = 0; i < array.length / 2; i++) {
			
			if (array[i] != array[array.length - 1 - i]) {
				
				esPalindromo = false;
				
			}
			
		}
		
		if (esPalindromo) {
			
			System.out.println("El array es palindromo");
			
		} else {
			
			System.out.println("El array no es palindromo");
			
		}
		
		leer.close();
	}

}
