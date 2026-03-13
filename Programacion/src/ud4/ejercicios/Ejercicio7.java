package ud4.ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		int p, q, cont = 0;
		
		System.out.println("Introduzca el valor mínimo");
		p = leer.nextInt();
		
		do {
			
			System.out.println("Introduzca el valor máximo");
			q = leer.nextInt();
			
			if (q < p) {
				
				System.out.println("Error, introduzca un número mayor al mínimo");
				
			}
			
		} while (q < p);
		
		int num [] = new int [(q-p) + 1];
		num [0] = p;
		
		cont = p + 1;
		
		for (int i = 1; i < num.length; i++) {
			
			num [i] = cont;
			cont += 1;
			
		}
		
		System.out.print("Los valores son: ");
		for (int i = 0; i < num.length; i++) {
			
			System.out.print(num [i] + " ");
			
		}
		
		leer.close();
	
	}
}
