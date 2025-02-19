package CarlosClase;

import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa un número entero:");
		        
		int num = scanner.nextInt(); // Leer el número ingresado

		boolean esPar = (num % 2 == 0); // Verificar si es par

		if (esPar) {
			System.out.println("El número " + num + " es par.");
			} else {
				System.out.println("El número " + num + " es impar.");
				}
		        
		        scanner.close(); // Cerrar el scanner

		
	}

}