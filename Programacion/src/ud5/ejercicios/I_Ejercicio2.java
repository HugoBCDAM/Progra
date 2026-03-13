package ud5.ejercicios;

import java.util.Scanner;

public class I_Ejercicio2 {
	
	public static void numEnteros(int a, int b) {
		
		System.out.println("Los números comprendidos entre " + a + " y " + b + " son: ");
		for (int i = a; i <= b; i++) {
			
			System.out.println(i);
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		int num1, num2;
		System.out.println("Introduzca el primer número");
		num1 = leer.nextInt();
		System.out.println("Introduzca el segundo número");
		num2 = leer.nextInt();
		
		numEnteros(num1, num2);
		
		leer.close();
		
	}
}
