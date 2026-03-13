package ud3.ejercicios;

import java.util.Scanner;

public class V_Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		int num;
		int multiplo = 0;
		
		System.out.println("Introduzca un número");
		num = leer.nextInt();
		
		for(int i = 1; i <= num; i++) {
			if (i % 3 == 0) {
				multiplo += 1;
			}
		}
		
		System.out.println("Cantidad de  múltiplos de 3: "+ multiplo);
		leer.close();
	}

}
