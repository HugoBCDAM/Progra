package ud4.ejercicios;

public class VI_Ejercicio2 {

	public static void main(String[] args) {
		
		int array[][] = new int [10][10];
		
		for(int i = 0; i < array.length; i++) {
			
			System.out.print("La tabla del " + (i + 1) + " es: ");
			
			for(int x = 0; x < array[i].length; x++) {
				
				array[i][x] = (i + 1) * (x + 1);

				System.out.print(array[i][x] + " \t");
				
				
			}
			
			System.out.println();
			
		}

	}

}
