package ud4.ejercicios;

public class IV_Ejercicio4 {

	public static void main(String[] args) {
		
		int array1[] = new int[] {2, 3, 4, 7, 8, 10, 11};
		int array2[] = new int[13], j = 0;
		
		array2[0] = array1[0];
		
		for (int i = 0; i < array2.length; i++) {
			
			for (int x = 0; x < array1.length; x++) {
				
				array2[j + 2] = array1[x];
				j += 1;
				System.out.println(array2[i]);
				
			}

		}

	}
}	
