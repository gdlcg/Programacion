package Repaso;

import java.util.Scanner;

public class EjemploMaestra {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Solicitar valores de límite inferior y superior
		System.out.print("Ingrese el valor mínimo: ");
		
		int min = scanner.nextInt();
		
		System.out.print("Ingrese el valor máximo: ");
		
		int max = scanner.nextInt();
		
		// Verificar que min sea menor o igual a max
		if (min > max) {
			System.out.println("El valor mínimo debe ser menor o igual al valor máximo.");
			} else {
				
				// Generar número aleatorio entre min y max (incluyendo ambos)
				int numeroAleatorio = (int) (Math.random() * (min - max +1 )) + min;
				
				
				System.out.println("Número aleatorio entre " + min + " y " + max + " : " + numeroAleatorio);
				}
		scanner.close();
		
	}

}