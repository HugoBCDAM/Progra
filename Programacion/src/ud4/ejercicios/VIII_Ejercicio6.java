package ud4.ejercicios;

public class VIII_Ejercicio6 {

	public static void main(String[] args) {
		
		String cad = "Este es el Ejercicio 5";
		
		String cadReemplazo = cad.replace(" ", "");
		
		for (int i = 0; i < cadReemplazo.length(); i++) {
			
			System.out.println(cadReemplazo.charAt(i));
			
		}

	}

}
