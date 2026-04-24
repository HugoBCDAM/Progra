package ud10.ejercicios.ix_ejercicio1;

public abstract class Planta implements Cuidable {
	
	private String nombre, id;
	private double altura;
	private boolean necesitaAgua;
	private static int totalPlantas;
	
	public Planta(String nombre, String id, double altura) {
		this.nombre = nombre;
		this.id = id;
		this.altura = altura;
		this.necesitaAgua = true;
		Planta.totalPlantas++;
	}
	public void regar() throws RiegoExcesivoException {
		if (this.necesitaAgua) {
			this.necesitaAgua = false;
		} else {
			throw new RiegoExcesivoException("La planta no necesita agua en este momento");
		}
	}
	
	public void regar(int cantidadAgua) throws RiegoExcesivoException {
		if (!this.necesitaAgua) {
			throw new RiegoExcesivoException("La planta no necesita agua en este momento");
		} else {
			if (this instanceof Arbol) {
				if (((Arbol) this).getMAX_AGUA() < cantidadAgua) {
					throw new RiegoExcesivoException("Cantidad de agua excesiva para esta planta");
				}
			} else if (this instanceof Flor) {
				if (((Flor) this).getMAX_AGUA() < cantidadAgua) {
					throw new RiegoExcesivoException("Cantidad de agua excesiva para esta planta");
				}
			} else {
				this.necesitaAgua = false;
				System.out.println("Se aplicó " + cantidadAgua + " cantidad de agua");
			}
		}
	}
	
	public abstract void crecer();
	
	@Override
	public boolean equals(Object obj) {
		Planta p = (Planta) obj;
		if (this.getNombre().equals(p.getNombre()) && this.isNecesitaAgua() == p.isNecesitaAgua()) {
			return true;
		} else {
			return false;
		}
	}
	
	public int totalPlantas() {
		return Planta.getTotalPlantas();
	}
	
	@Override
	public boolean necesitaRiego() {
		boolean necesitaRiego = false;
		
		if (this.isNecesitaAgua()) {
			necesitaRiego = true;
		}
		
		return necesitaRiego;
	}
	
	@Override
	public void recibirLuz() {
		System.out.println("\nLa planta ha recibido luz");
	}
	
	public String mostrarInformacion() {
		String mensaje = "";
		if (this.necesitaAgua) {
			mensaje = "Si";
		} else {
			mensaje = "No";
		}
		
		return "Planta: " + this.getNombre() + " | Altura: " + this.getAltura() + " | Necesita agua: " + mensaje + " | ID: " + this.getId();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public boolean isNecesitaAgua() {
		return necesitaAgua;
	}
	public void setNecesitaAgua(boolean necesitaAgua) {
		this.necesitaAgua = necesitaAgua;
	}
	public static int getTotalPlantas() {
		return totalPlantas;
	}
	public static void setTotalPlantas(int totalPlantas) {
		Planta.totalPlantas = totalPlantas;
	}
	
}
