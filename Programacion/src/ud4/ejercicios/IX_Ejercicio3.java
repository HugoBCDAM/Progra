package ud4.ejercicios;

public class IX_Ejercicio3 {

	public static void main(String[] args) {
		
		String cad = "Esta es una frase con unas cuantas aes";
		
		int cont = 0;
		int posicion = -1;
		
		for (int i = 0; i < cad.length(); i++) {
			
			cad.toLowerCase();
			
			if (cad.charAt(i) == 'a') {
				
				cont++;
				
				if (cont == 4) {
					
					posicion = i;
					
				}
				
			}
			
		}
		
		if (posicion != -1) {
			
			System.out.println("La cuarta 'a' está en la posición " + posicion);
			
		} else {
			
			System.out.println("La frase tiene menos de 4 aes");
			
		}

	}

}
