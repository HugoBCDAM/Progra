package ud6_7.ejercicios.iv_ejercicio1;

public class Colegio {

	public static void main(String[] args) {
		
		// Se crean dos estudiantes
		
		Estudiante e1 = new Estudiante("Alba", "2D");
		Estudiante e2 = new Estudiante("Carlos" , "1B", 13);
		
		// Se muestra la información de los estudiantes después de haberlos creado
		
		e1.mostrarInformacion();
		e2.mostrarInformacion();
		
		// Se modifican algunos datos
		
		e1.cumplirAnios();
		e1.setCurso("1D");
		
		e2.cumplirAnios();
		e2.setCurso("2B");
		
		// Se vuelven a mostrar los datos
		
		e1.mostrarInformacion();
		e2.mostrarInformacion();
		
		// Se muestra el total de estudiantes registrados
		
		System.out.println("Cantidad de estudiantes en el colegio: " + Estudiante.getCantEstudiantes());
		
	}

}
