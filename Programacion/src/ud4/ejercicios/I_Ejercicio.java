package ud4.ejercicios;

public class I_Ejercicio {

	public static void main(String[] args) {

		int array1[] = new int[10], cont1 = 100;
		int array2[] = new int[20], cont2 = 20;
		int array3[] = new int[30], cont3 = 20;

		for (int i = 0; i < array1.length; i++) {

			array1[i] = cont1;

			cont1 += 1;

		}

		for (int i = 0; i < array2.length; i++) {

			array2[i] = cont2;

			cont2 -= 1;

		}

		for (int i = 0; i < 20; i++) {

			array3[i] = array2[i];

		}

		for (int i = 0; i < 10; i++) {

			array3[cont3] = array1[i];

			cont3 += 1;

		}

		for (int i = 0; i < array3.length; i++) {

			if (array3[i] == 5) {

				System.out.println("La posición es la " + i);

			}
		}

		for (int i = 5; i < 9; i++) {

			array2[i] = 99;
		}

		for (int i = 2; i < 8; i++) {

			array1[i] = array2[i - 2];

		}

		System.out.print("Array1: ");

		for (int i = 0; i < array1.length; i++) {

			System.out.print(array1[i] + " ");

		}
		
		System.out.println("");
		
		System.out.print("Array2: ");

		for (int i = 0; i < array2.length; i++) {

			System.out.print(array2[i] + " ");

		}
		
		System.out.println("");
		
		System.out.print("Array3: ");

		for (int i = 0; i < array3.length; i++) {
			
			System.out.print(array3[i] + " ");
			
		}
	}

}
