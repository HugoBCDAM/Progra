package ud4.ejercicios;

import java.util.Scanner;

public class IV_Ejercicio7 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		int tamanio;
		
		System.out.println("Dime cuanto tamaño quieres que tenga el array");
		tamanio = leer.nextInt();
		
		int ejemplo[] = new int[tamanio];
		
		for (int i = 0; i < ejemplo.length; i++) {
			
			ejemplo[i] = i;
			System.out.println(ejemplo[i]);
			
		}
		
		leer.close();
	}

}
