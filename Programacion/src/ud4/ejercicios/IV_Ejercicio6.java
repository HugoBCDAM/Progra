package ud4.ejercicios;

import java.util.Scanner;

public class IV_Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		int array[] = new int[10], max, min;
		
		for (int i = 0; i < array.length; i++) {
			
			array[i] = leer.nextInt();
			
		}
		
		max = array[0];
		min = max;
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] > max) {
				
				max = array[i];
				
			} else if (array[i] < min) {
				
				min = array[i];
				
			}
			
		}
		
		System.out.println("El valor máximo es: " + max);
		System.out.println("El valor mínimo es: " + min);
		
		leer.close();
	}

}
