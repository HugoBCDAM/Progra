package ud11.ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class i_ejercicio2 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		String fichero;
		String linea;
		
		System.out.println("Dime el nombre del fichero a leer");
		fichero = leer.nextLine();
		
		File f = new File("C:/Users/Diurno/ejercicios/" + fichero + ".txt");
		if (f.exists()) {
			try (BufferedReader br = new BufferedReader(new FileReader(f))) {
				while ((linea = br.readLine()) != null) {
					System.out.println(linea);
				}
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		} else {
			System.out.println("El fichero no existe");
		}
		
		leer.close();
	}

}
