package ud11.ejercicios.iv_ejercicio1;

import java.util.Scanner;

public class Veterinario {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		int opcion;
		
		do {
			System.out.println("1. Número de animales atendidos por el veterinario.\n2. Número de animales incinerados.\n3. Tiempo total de servicio del veterinario.\n4. Tiempo total de servicio de las incineradoras"
					+ "\n5. Tiempo medio de servicio del veterinario.\n6. Tiempo medio de servicio de las incineradoras.\n7. Número de animales esperando a ser atendidos por el veterinario cuando finaliza la simulación."
					+ "\n8. Número de animales esperando a ser incinerados cuando finaliza la simulación.\n9. ¿Cuánto tiempo necesita el veterinario para examinar a todos los animales?\n10. Mostrar la lista completa de animales ordenada por peso de mayor a "
					+ "menor y, en caso de empate, por nombre en orden alfabético.\n11. Mostrar un resumen del número de animales clasificados por tipo y estado de salud (sanos, enfermos contagiosos y enfermos curables)."
					+ "\n12. Guardar en un fichero de texto los resultados finales de la simulación, incluyendo estadísticas, animales atendidos, animales incinerados y el resumen de clasificación sanitaria.\n13. Salir");
			opcion = leer.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.println("\nNúmero de animales atendidos en el veterinario: " + Animal.getNumeroAnimales() + "\n");
				break;
			case 2:
				System.out.println("\nNúmero de animales incinerados: " + Animal.getAnimalesIncinerados() + "\n");
				break;
			}
		} while (opcion != 13);
		
		leer.close();
	}

}
