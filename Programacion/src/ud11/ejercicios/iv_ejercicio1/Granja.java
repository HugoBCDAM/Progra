package ud11.ejercicios.iv_ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Granja {

	public static void main(String[] args) {
		
		Incineradora incineradora_vaca = new Incineradora(TipoIncineradora.VACA);
		Incineradora incineradora_cerdo = new Incineradora(TipoIncineradora.CERDO);
		Veterinario v = new Veterinario();
		List<Animal> animales = new ArrayList<>();
		
		Animal a = new VacaImportacion("Luna", "Holstein", 650.00, 'H', "14/03/2022", true, "Paises Bajos");
		Animal a2 = new VacaImportacion("Margarita", "Jersey", 450.00, 'H', "02/09/2021", true, "Reino Unido");
		animales.add(a);
		animales.add(a2);
		
		Animal a3 = new VacaPropia("Estrella", "Pardo Suizo", 600.00, 'H', "18/01/2023", true, "Max", "Bella");
		animales.add(a3);
		
		Animal a4 = new Cerdo("Roco", "Cerdo Suizo", 120.00, 'M', "10/02/2024", TipoJamon.BELLOTA);
		Animal a5 = new Cerdo("Canela", "Duroc", 110.00, 'H', "3/05/2024", TipoJamon.IBERICO);
		Animal a6 = new Cerdo("Trueno", "Large White", 130.00, 'M', "20/01/2024", TipoJamon.NORMAL);
		Animal a7 = new Cerdo("Moka", "Landrace", 115.00, 'H', "8/08/2023", TipoJamon.NORMAL);
		animales.add(a4);
		animales.add(a5);
		animales.add(a6);
		animales.add(a7);
		
		Animal a8 = new CerdoPropio("Sombra" , "Cerdo Ibérico", 125.00, 'H', "12/03/2024", TipoJamon.IBERICO, "Tormenta", "Lunares");
		Animal a9 = new CerdoPropio("Bruno", "Duroc", 118.00, 'M', "27/06/2024", TipoJamon.IBERICO, "Rugido", "Canela");
		Animal a10 = new CerdoPropio("Niebla", "Large White", 112.00, 'H', "05/09/2023", TipoJamon.NORMAL, "Trueno", "Dorada");
		animales.add(a8);
		animales.add(a9);
		animales.add(a10);
		
		for (Animal animal : animales) {
			v.examinar(animal);
		}
		
		System.out.println("NÚMERO DE ANIMALES ATENDIDOS EN EL VETERINARIO: " + Veterinario.getAnimalesAtendidos());
		
		for (Animal animal : animales) {
			if (animal instanceof Cerdo) {
				incineradora_cerdo.incinerar(animal);
			} else if (animal instanceof Vaca) {
				incineradora_vaca.incinerar(animal);
			}
		}
		
		System.out.println("NÚMERO DE ANIMALES INCINERADOS: " + Incineradora.getAnimalesIncinerados());
		System.out.println("TIEMPO TOTAL DEL SERVICIO DEL VETERINARIO: " + v.getTiempo() + " MINUTOS");
		System.out.println("TIEMPO TOTAL DEL SERVICIO DE LAS INCINERADORAS: \n -INCINERADORA DE VACAS - " + incineradora_vaca.getTiempo() + " MINUTOS"
				+ "\n -INCINERADORA DE CERDOS - " + incineradora_cerdo.getTiempo() + " MINUTOS");
		System.out.println("TIEMPO MEDIO DE SERVICIO DEL VETERINARIO: " + v.getTiempo() / animales.size() + " MINUTOS");
		System.out.println("TIEMPO MEDIO DE SERVICIO DE LAS INCINERADORAS: " + (incineradora_cerdo.getTiempo() + incineradora_vaca.getTiempo()) / Incineradora.getAnimalesIncinerados() + " MINUTOS");
		System.out.println("NÚMERO DE ANIMALES ESPERANDO A SER ATENDIDOS: " + (animales.size() - Veterinario.getAnimalesAtendidos()));
		System.out.println("NÚMERO DE ANIMALES ESPERANDO A SER INCINERADOS: " + (Veterinario.getAnimalesIncinerar() - Incineradora.getAnimalesIncinerados()));
		System.out.println("EL VETERINARIO TARDA " + v.getTiempo() + " MINUTOS PARA EXAMINAR A TODOS LOS ANIMALES");
		
		List<Animal> animalesOrdenados = new ArrayList<>();
		animalesOrdenados.addAll(animales);
		Collections.sort(animalesOrdenados);
		
		System.out.println("LISTA DE ANIMALES ORDENADA DE MAYOR A MENOR PESO, Y EN CASO DE HABER EMPATE, EN ORDEN ALFABÉTICO SEGÚN EL NOMBRE:\n");
		for (Animal animal : animalesOrdenados) {
			System.out.println(animal.toString() + "\n");
		}
		
		
	}

}
