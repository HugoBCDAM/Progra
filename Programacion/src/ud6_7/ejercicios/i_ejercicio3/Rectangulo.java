package ud6_7.ejercicios.i_ejercicio3;

public class Rectangulo {

	int x1;
	int y1;
	int x2;
	int y2;
	
	public void imprimeCoordenadas() {
		
		System.out.print("(" + x1 + "," + y1 + ") y (" + x2 + "," + y2 + ")" );
		
	}
	
	public int devuelvePerimetro() {
		
		int altura = 0, anchura = 0;
		
		if (y1 > y2) {
			
			altura = y1 - y2;
			
		} else if (y2 > y1) {
			
			altura = y2 - y1;
			
		}
		
		if (x1 > x2) {
			
			anchura = x1 - x2;
			
		} else if (x2 > x1) {
			
			anchura = x2 - x1;
			
		}
		
		int perimetro = (altura * 2) + (anchura * 2);
		
		return perimetro;
		
	}
	
	public int devuelveArea() {
		
		int altura = 0, anchura = 0;
		
		if (y1 > y2) {
			
			altura = y1 - y2;
			
		} else if (y2 > y1) {
			
			altura = y2 - y1;
			
		}
		
		if (x1 > x2) {
			
			anchura = x1 - x2;
			
		} else if (x2 > x1) {
			
			anchura = x2 - x1;
			
		}
		
		int area = altura * anchura;
		
		return area;
		
	}
	
}
