package ud4.ejercicios;

public class Ejercicio14 {

	public static void main(String[] args) {

		int array[] = new int[55], cont = 0;

		for (int i = 0; i <= 10; i++) {

			for (int x = 0; x < i; x++) {
				
					array[cont] = i;
					cont += 1;
					
			}
			
		}
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.print(array[i] + " ");
			
		}

	}

}
