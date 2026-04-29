package ud11.ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class i_ejercicio3 {

	public static void main(String[] args) {
		
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		PrintWriter pw = null;
		
		String linea;
		
		try {
			fr = new FileReader("C:/Users/Diurno/ejercicios/i_ejercicio3.txt");
			fw = new FileWriter("C:/Users/Diurno/ejercicios/i_ejercicio3_2.txt");
			br = new BufferedReader(fr);
			pw = new PrintWriter(fw);
			
			while ((linea = br.readLine()) != null) {
				pw.println(linea.toUpperCase());
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			pw.close();
		}

	}

}
