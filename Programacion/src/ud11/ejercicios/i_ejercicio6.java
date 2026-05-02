package ud11.ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class i_ejercicio6 {

	public static void main(String[] args) {
		
		File f = null;
		FileReader fr = null;
		BufferedReader br= null;
		int valor;
		
		f = new File("i_ejercicio6.txt");
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			
			while ((valor = br.read()) != -1) {
				char caracter = (char) valor;
				
				if (caracter != ' ') {
					System.out.print(caracter);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
