package ud3.ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		int num = 0;
		
		System.out.println("Dime un número");
		num = leer.nextInt();
		
		if (num%2 == 0) {
			System.out.println("El número "+ num + " es par");
		} else {
			System.out.println("El número "+ num + " es impar");
		}
		
		leer.close();
	}
}
