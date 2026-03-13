package ud4.ejercicios;

public class IV_Ejercicio1 {

	public static void main(String[] args) {
		
		int array1[] = new int[] {1, 3, 5, 7, 8}; 
		int array2[] = new int[] {1, 2, 3, 4, 5}; 
		int resultado[] = new int[5];
		
		for (int i = 0; i < resultado.length; i++) {
			
			resultado[i] = array1[i] +  array2[i];
			System.out.print(resultado[i] + " ");
			
		}
	}

}
