package ud3.ejercicios;

import java.util.Scanner;

public class V_Ejercicio3 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		int num, cont, fallo = 0, mayor;
		
		System.out.println("Dime un número inicial");
		num = leer.nextInt();
		mayor = num;
		cont = 1;
		while (num != 0) {
			
			System.out.println("Dime un número");
			num = leer.nextInt();
			
			if (num >= mayor) {
				mayor = num;
			} else if (num < mayor && num != 0) {
				System.out.println("Fallo es menor");
				fallo  = fallo + 1;
				mayor = num;
			}
			
			cont = cont + 1;
		}
		
		System.out.println("Total de números introducidos: " + (cont - 1));
		System.out.println("Números fallados: " + fallo);

		leer.close();
	}

}
