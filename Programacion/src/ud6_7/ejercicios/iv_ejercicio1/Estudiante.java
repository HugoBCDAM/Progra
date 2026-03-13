package ud6_7.ejercicios.iv_ejercicio1;

public class Estudiante {
	
	private String nombre, curso;
	private int edad; 
	private static int contId = 1;
	private String idEstudiante;
	private final int EDAD = 13;
	private static int cantEstudiantes = 0;
	
	public Estudiante(String nombre, String curso) {
		
		this.nombre = nombre;
		this.curso = curso;
		this.idEstudiante = idAleatorio();
		this.edad = EDAD;
		cantEstudiantes();
		
	}
	
	public Estudiante(String nombre, String curso, int edad) {
		
		this.nombre = nombre;
		this.curso = curso;
		this.idEstudiante = idAleatorio();

		if (edad <= 0) {
			
			this.edad = EDAD;
			
		} else {
			
			this.edad = edad;
			
		}
		
		cantEstudiantes();
		
	} 
	
	public void mostrarInformacion() {
		
		System.out.println("----- DATOS DEL ESTUDIANTE -----");
		System.out.println("NOMBRE: " + this.nombre);
		System.out.println("CURSO: " + this.curso);
		System.out.println("EDAD: " + this.edad);
		System.out.println("ID_ESTUDIANTE: " + this.idEstudiante + "\n");
		
	}
	
	public void cumplirAnios() {
		
		if (this.edad > 0) {
			
			System.out.println(this.nombre + " acaba de cumplir años!!\n");
			this.edad++;
			
		}
		
	}
	
	private String idAleatorio() {
		
		String id = "E" + contId;
		contId++;
		
		return id;
		
	}
	
	public static void cantEstudiantes() {
		
		cantEstudiantes++;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getContAlumnos() {
		return contId;
	}

	public String getIdEstudiante() {
		return idEstudiante;
	}

	public static int getCantEstudiantes() {
		return cantEstudiantes;
	}

	public int getEDAD() {
		return EDAD;
	}

}
