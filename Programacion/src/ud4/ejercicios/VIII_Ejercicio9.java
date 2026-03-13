package ud4.ejercicios;

public class VIII_Ejercicio9 {

	public static void main(String[] args) {
		
		String cad = "LoCoMoToRa";
		
		cad = cad.toLowerCase();
		
		String mitad = cad.substring(0, cad.length() / 2);
		
		cad = cad.replace(mitad, mitad.toUpperCase());
		
		System.out.println(cad);
		

	}

}
