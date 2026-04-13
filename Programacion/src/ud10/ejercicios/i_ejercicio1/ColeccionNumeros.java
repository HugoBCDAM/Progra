package ud10.ejercicios.i_ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ColeccionNumeros {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		List <Integer> listaNumeros = new ArrayList<>();
		
		int numero;
		do {
			System.out.println("Introduce un número");
			numero = leer.nextInt();
			if (numero >= 0) {
				listaNumeros.add(numero);
			}
		} while (numero >= 0);
		
		System.out.println("Lista de números original:");
		System.out.println(listaNumeros);
		
		System.out.println("Lista de números pares:");
		for (int i = 0; i < listaNumeros.size(); i++) {
			if (listaNumeros.get(i) % 2 == 0) {
				System.out.print(listaNumeros.get(i) + " ");
			}
		}
		
		for (int i = 0; i < listaNumeros.size(); i++) {
			if (listaNumeros.get(i) % 3 == 0) {
				listaNumeros.remove(i);
			}
		}
		
		System.out.println("\nLista de números final:");
		System.out.println(listaNumeros);
		
		leer.close();
		
	}

}
