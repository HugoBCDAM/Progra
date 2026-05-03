package ud11.ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ii_ejercicio1 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		File f = null;
		FileReader fr = null;
		BufferedReader br = null;
		String archivo;
		int valor;
		
		System.out.println("Introduzca el nombre del archivo en .csv");
		archivo = leer.nextLine();
		
		f = new File(archivo);
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			
			System.out.println("Contenido del fichero:");
			while ((valor = br.read()) != -1) {
				char caracter = (char) valor;
				
				if (caracter != ';') {
					System.out.print(caracter);
				} else {
					System.out.print("\t");
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		leer.close();
	}

}
