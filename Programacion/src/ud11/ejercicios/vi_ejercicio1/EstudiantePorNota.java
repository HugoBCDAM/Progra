package ud11.ejercicios.vi_ejercicio1;

import java.util.Comparator;

public class EstudiantePorNota implements Comparator<Estudiante> {

	@Override
	public int compare(Estudiante o1, Estudiante o2) {
		if (o1.getNotaMedia() > o2.getNotaMedia()) {
			return -1;
		} else if (o1.getNotaMedia() < o2.getNotaMedia()) {
			return 1;
		} else {
			return 0;
		}
	}
	
}
