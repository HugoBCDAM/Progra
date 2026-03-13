package ud4.ejercicios;

public class IX_Ejercicio1 {

	public static void main(String[] args) {
		
		String cad = "Esta es la frase que vamos a partir en cuatro";
		String mitad = " ", mitad2 = " ", primeramitad = " ", segundamitad = " ", primeramitad2 = " ", segundamitad2 = " ";
		
		mitad = cad.substring(0, cad.length() / 2);
		mitad2 = cad.substring(cad.length() / 2, cad.length());
		
		primeramitad = mitad.substring(0, mitad.length() / 2);
		segundamitad = mitad.substring(mitad.length() / 2, mitad.length());
		
		primeramitad2 = mitad2.substring(0, mitad2.length() / 2);
		segundamitad2 = mitad2.substring(mitad2.length() / 2, mitad2.length());
		
		System.out.println(primeramitad);
		System.out.println(segundamitad);
		System.out.println(primeramitad2);
		System.out.println(segundamitad2);
		
	}

}
