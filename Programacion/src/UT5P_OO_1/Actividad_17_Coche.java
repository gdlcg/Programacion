package UT5P_OO_1;

import java.util.Scanner;

public class Actividad_17_Coche {
	
	private static Scanner leer = new Scanner (System.in);

	public static void main(String[] args) {
		
		System.out.print("Introduce el número de la plaza de aparcamiento: ");
        int numeroPlaza = leer.nextInt();
        Plaza_Aparcamiento plaza = new Plaza_Aparcamiento(numeroPlaza);
        System.out.println();
        
        int opcion;

        do {
            // Mostrar menú
            System.out.println("PLAZA APARCAMIENTO");
            System.out.println("1. Aparcar coche");
            System.out.println("2. Sacar coche");
            System.out.println("3. Ver coche aparcado");
            System.out.println("4. Salir aplicación");
            System.out.print("OPCIÓN: ");
            
            opcion = leer.nextInt();
            leer.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    plaza.aparcarCoche();
                    break;
                case 2:
                    plaza.sacarCoche();
                    break;
                case 3:
                    plaza.verCocheAparcado();
                    break;
                case 4:
                    System.out.println("Saliendo de la aplicacion...");
                    plaza.mostrarEstado();
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 4);

        leer.close();
		
		
	}

}