package ud4.ejercicios;

import java.util.Scanner;

public class V_Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		int array[] = new int[10], valor;
		
		boolean esta = false;
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println("Escriba un valor");
			array[i] = leer.nextInt();
			if (array[i] == 0) {
				
				i--;
				
			}
			
		}
		
		System.out.println("Escriba un valor para comprobar si se encuentra en el array");
		valor = leer.nextInt();
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i]  == valor) {
				
				array[i] = 0;
				esta = true;
				
			}
			
		}
		
		if (esta == false) {
			
			System.out.println("Valor no encontrado");
			
		}
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println(array[i] + "\t");
			
		}
		
		leer.close();
	}

}
