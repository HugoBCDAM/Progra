package ud11.ejercicios;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class i_ejercicio1 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		String frase;
		int contador = 0;
		
		try (PrintWriter pw = new PrintWriter(new FileWriter("C:/Users/Diurno/ejercicios/i_ejercicio1.txt"))){
			System.out.println("Introduzca frases. FIN para terminar");
			frase = leer.nextLine();
			
			while (!frase.equalsIgnoreCase("fin")) {
				pw.println(frase);
				contador++;
				
				frase = leer.nextLine();
			}
			
			System.out.println("Se han introducido " + contador + " frases");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		leer.close();
	}

}
