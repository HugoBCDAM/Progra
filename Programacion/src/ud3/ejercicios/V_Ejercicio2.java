package ud3.ejercicios;

import java.util.Scanner;

public class V_Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);

		int num;
		boolean primo = true;
		
		System.out.println("Introduce un número");
		num = leer.nextInt();
		
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				primo = false;
			}
		}
		
		if (primo && num != 0) {
			System.out.println("Es primo");
		} else {
			System.out.println("No es primo");
		}
		leer.close();
	}

}
