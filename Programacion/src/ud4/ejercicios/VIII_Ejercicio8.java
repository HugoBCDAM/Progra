package ud4.ejercicios;

public class VIII_Ejercicio8 {

	public static void main(String[] args) {
		
		String cad = "Este ejercicio es el primero que cuenta letras";
		cad = cad.toLowerCase();
		
		char c = ' ';
		int cont = 0;
		
		for (int i = 0; i < cad.length(); i++) {
			
			c = cad.charAt(i);
			
			if (c == 'e') {
				
				cont++;
				
			}
			
		}
		
		System.out.println("Aparecen " + cont + " letras 'e'");

	}

}
