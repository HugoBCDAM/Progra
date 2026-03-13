package ud4.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		double num [] = new double [10];
		
		for (int i = 0; i < num.length; i++) {
			
			System.out.println("Introduzca un número real");
			num [i] = leer.nextDouble();
			
		}
		
		double max = num [0], min = num [0];
		
		for (int i = 0; i < num.length; i++) {
			
			if (num [i] > max) {
				
				max = num[i];
				
			} else if (num [i] < min) {
				
				min = num[i];
				
			}
		}
		
		System.out.println("El número máximo es " + max + " y el mínimo es " + min);

		leer.close();
		
	}

}
