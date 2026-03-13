package ud4.ejercicios;

public class IX_Ejercicio2 {

	public static void main(String[] args) {
		
		String cad = "Esta es la frase donde vamos a poner almohadillas";
		String cad2 = "";
		
		for (int i = 0; i < cad.length(); i++) {
			
			if (i % 3 == 0) {
				
				cad2 += '#';
				
			} else {
				
				cad2 += cad.charAt(i);
				
			}
			
		}
		
		System.out.println(cad2);
		
	}

}
