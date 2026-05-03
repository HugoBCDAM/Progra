package ud11.ejercicios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ii_ejercicio2 {

	public static void main(String[] args) {
		
		File f = null;
		FileWriter fp = null;
		PrintWriter pw = null;
		
		f = new File("ii_ejercicio2.csv");
		
		try {
			fp = new FileWriter(f);
			pw = new PrintWriter(fp);
			
			for (int i = 1; i <= 1000; i++) {
				for (int x = 0; x < 10; x++) {
					pw.print(i + ";");
					i++;
				}
				i--;
				pw.println();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			pw.close();
		}
	}

}
