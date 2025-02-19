package UT6_Herencia_Excepciones;

public class main {

	public static void main(String[] args) {
		
		Punto2D p1 = new Punto2D(0.0, 0.0);
		Punto2D p2 = new Punto2D(1.0, 0.0);
		Punto2D p3 = new Punto2D(0.0, 1.0);
		
		Triangulo punto = new Triangulo(p1, p2, p3);
		
		System.out.println(punto.area());
		
		
		
	}

}