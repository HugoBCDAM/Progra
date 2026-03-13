package ud4.ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		double num [] = new double [10];
		
		for (int i = 0; i < num.length; i++) {
			
			System.out.println("Introduzca un número real");
			num [i] = leer.nextDouble();
			
		}
		
		for (int i = 0; i < num.length; i++) {
			
			System.out.println(num [i]);
			
		}
		
		leer.close();
	}

}
