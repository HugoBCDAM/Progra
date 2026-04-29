package ud11.ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class i_ejercicio4 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		File f;
		FileReader fr = null;
		BufferedReader bf = null;
		String linea;
		String palabra;
		String archivo;
		
		System.out.println("Dime el nombre del archivo");
		archivo = leer.nextLine();
		
		f = new File(archivo);
		
		System.out.println("Dime la palabra a buscar en el archivo");
		palabra = leer.nextLine();
		try {
			if (f.exists()) {
				fr = new FileReader(f);
				bf = new BufferedReader(fr);
				
				while ((linea = bf.readLine()) != null) {
					if (linea.contains(palabra)) {
						System.out.println(linea);
					}
				}
			} else {
				System.out.println("El archivo no existe");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		leer.close();
	}

}
