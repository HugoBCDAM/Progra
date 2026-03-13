package ud6_7.ejercicios.i_ejercicio1;

public class Principal {

	public static void main(String[] args) {
		
		Punto p1 = new Punto();
		Punto p2 = new Punto();
		Punto p3 = new Punto();
		
		p1.x = 5;
		p1.y = 0;
		
		p2.x = 10;
		p2.y = 10;
		
		p3.x = -3;
		p3.y = 7;
		
		System.out.println("Las coordenadas del punto 1 son: " + p1.x + " (x) y " + p1.y + " (y)");
		System.out.println("Las coordenadas del punto 2 son: " + p2.x + " (x) y " + p2.y + " (y)");
		System.out.println("Las coordenadas del punto 3 son: " + p3.x + " (x) y " + p3.y + " (y)");
		
		p1.x += 2;
		p1.y -= 5;
		
		p2.x *= 3;
		p2.y /= 2;
		
		p3.x++;
		p3.y--;
		
		System.out.println("Las coordenadas del punto 1 son: " + p1.x + " (x) y " + p1.y + " (y)");
		System.out.println("Las coordenadas del punto 2 son: " + p2.x + " (x) y " + p2.y + " (y)");
		System.out.println("Las coordenadas del punto 3 son: " + p3.x + " (x) y " + p3.y + " (y)");

	}

}
