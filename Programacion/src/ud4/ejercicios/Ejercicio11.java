package ud4.ejercicios;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		int array1[] = new int[100],  array2[] = new int[100];
		
		for(int i = 0; i < array1.length; i++) {
			
			array1[i] = i + 1;
			
		}
		
		for (int i = 0; i < array2.length; i++) {
			
			array2[i] = array1[99-i];
			
		}
		
		System.out.print("Array1: ");
		
		for (int i = 0; i < array1.length; i++) {
			
			System.out.print(array1[i] + " ");
			
		}
		
		System.out.println("");
		
		System.out.println("Array2: ");
		
		for (int i = 0; i < array2.length; i++) {
			
			System.out.print(array2[i] + " ");
			
		}
	}

}
