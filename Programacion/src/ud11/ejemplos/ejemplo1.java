package ud11.ejemplos;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ejemplo1 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		PrintWriter salida = null;
		
		try {
			salida = new PrintWriter("C:/Users/Diurno/prueba/prueba.txt");
			String valor;
			
			System.out.println("Introduzca valores. FIN para terminar");
			valor = leer.nextLine();
			
			while (!valor.equalsIgnoreCase("FIN")) {
				salida.println(valor);
				valor = leer.nextLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			salida.close();
		}
		
		leer.close();
	}

}
