package UT5P_OO;

public class Ejemplo {
	
	public static void entero (int a) {
		
		a = 1;
		
	}
	
	public static void letra (String b) {
		
		b = "Cambia";
		
	}
	
	public static void objeto (Coordenada x) {
		
		x.x = 8;
		
	}

	public static void main(String[] args) {
		
		int numero = 4;
		String palabra = "Normal";
		Coordenada x1 = new Coordenada (5, 8);
		
		
		entero (numero);
		letra (palabra);
		objeto (x1);
		
		
		System.out.println("Numero no cambia " + numero);
		System.out.println("Palabra no cambia " + palabra);
		System.out.println("Coordenadas cambia la posicion x = " + x1.getCoordenada());
		
	}

}