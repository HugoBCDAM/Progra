package ud4.ejercicios;

public class VI_Ejercicio1 {

	public static void main(String[] args) {
		
		int array[][] = new int[5][5], cont = 1;
		
		System.out.println("Los números son:");
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.print("Celda " + i + ": ");
			for(int j = 0; j < array[i].length; j++) {
				
				array[i][j] = cont;
				cont += 1;
				System.out.print(array[i][j] + " ");
				
			}
			
			System.out.println();
			
		}
	}

}
