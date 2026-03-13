package ud4.ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		int num[] = new int[100], n;
		
		for (int i = 0; i < num.length; i++) {
			
			num[i] = (int) (1 + Math.random() * 10);
			
		}
		
		System.out.println("Introduzca un valor entre 1 y 10");
		n = leer.nextInt();
		
		System.out.print("El valor introducido aparece en las posiciones: ");
		for (int i = 0; i < num.length; i++) {
			
			if (num[i] == n) {
				
				System.out.print(i + " ");
				
			}
		}
		
		leer.close();
	}

}
