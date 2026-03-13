package ud3.ejercicios;

import java.util.Scanner;

public class VI_Ejercicio1 {
	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		int n, num, primo = 0, sumPerfectos = 0, numPerfectos = 0, prim = 1, segun = 2, resul = 0, fibo = 0;
		boolean esPrimo = true;
		
		System.out.println("Introduzca cuantos números introducirás");
		n = leer.nextInt();
		
		System.out.println("Introduzca los números");
		
		for (int i = 0; i < n; i++) {
			
			num = leer.nextInt();
			
			for (int x = 2; x < num; x++) {
				
				if (num % x == 0) {
					
					esPrimo = false;
					
				}
				
				if (esPrimo && num != 0) {
					
					primo++;
					
				}
				
			}
			
			for (int x = 1; x < num; x++) {
				
				if (num % x == 0) {
					
					sumPerfectos += x;
					
				}
				
			}
			
			if (sumPerfectos == num) {
				
				numPerfectos++;
				
			}
			
			if (n == prim || n == segun) {
				
				fibo++;
				
			} else {
				
				resul = prim + segun;
				prim = segun;
				segun = resul;
				
			}
			
		}
		
		System.out.println("Hay " + primo + " números primos");
		System.out.println("Hay " + numPerfectos + " números perfectos");
		System.out.println("Hay " + fibo + " números que pertenecen a la serie de fibonacci");
		
		leer.close();
	}
}
