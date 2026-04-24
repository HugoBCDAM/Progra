package ud10.ejercicios.ix_ejercicio1;

public interface Cuidable {
	
	public static String recomendarRiego(Planta p) {
		String mensaje = "";
		if (p.isNecesitaAgua()) {
			mensaje = "Recomiendo regar la planta";
		} else if (!p.isNecesitaAgua()) {
			mensaje = "No es necesario regar la planta";
		}
		
		return mensaje;
	}
	
	public boolean necesitaRiego();
	
	public void recibirLuz();
	
}
