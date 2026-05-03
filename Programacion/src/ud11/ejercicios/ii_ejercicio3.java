package ud11.ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ii_ejercicio3 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		String fichero1, fichero2, resultante;
		
		System.out.println("Introduzca el nombre del primer fichero");
		fichero1 = leer.nextLine();
		
		File f1 = new File(fichero1);
		
		System.out.println("Introduzca el nombre del segundo fichero");
		fichero2 = leer.nextLine();
		
		File f2 = new File(fichero2);
		
		System.out.println("Introduzca el nombre del fichero resultante");
		resultante = leer.nextLine();
		
		File f3 = new File(resultante);
		
		try (
			BufferedReader br1 = new BufferedReader(new FileReader(f1));
			BufferedReader br2 = new BufferedReader(new FileReader(f2));
			PrintWriter pw = new PrintWriter(new FileWriter(f3));
			
 		){
			String linea1 = br1.readLine();
			String linea2 = br2.readLine();
			
			
			while (linea1 != null || linea2 != null) {
				if (linea1 != null) {
					pw.println(linea1);
					linea1 = br1.readLine();
				}
				
				if (linea2 != null) {
					pw.println(linea2);
					linea2 = br2.readLine();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		leer.close();

	}

}
