package ud11.ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class i_ejercicio5 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		File f = null;
		FileWriter fw = null;
		FileReader fr = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		String opcion, fichero, nombre, apellidos, ciudad, linea;
		
		do {
			System.out.println("a. Crear un fichero de texto\nb. Mostrar el contenido del fichero\nc. Salir");
			opcion = leer.nextLine();
			
			switch (opcion) {
			case "a":
				System.out.println("Dime el nombre del fichero y su extensión");
				fichero = leer.nextLine();
				
				f = new File(fichero);
				try {
					fw = new FileWriter(f);
					pw = new PrintWriter(fw);
					fr = new FileReader(f);
					br = new BufferedReader(fr);
					
					System.out.println("Dime tu nombre");
					nombre = leer.nextLine();
					pw.println(nombre);
					
					System.out.println("Dime tus apellidos");
					apellidos = leer.nextLine();
					pw.println(apellidos);
					
					System.out.println("Dime tu ciudad de nacimiento");
					ciudad = leer.nextLine();
					pw.println(ciudad);
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					pw.close();
				}
				break;
			case "b":
				try {
					while ((linea = br.readLine()) != null) {
						System.out.println(linea);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			}
			
		} while (!opcion.equalsIgnoreCase("c"));
		
		leer.close();
	}

}
