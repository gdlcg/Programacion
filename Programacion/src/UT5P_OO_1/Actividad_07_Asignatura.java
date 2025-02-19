package UT5P_OO_1;

import java.util.Scanner;

public class Actividad_07_Asignatura {

	public static void main(String[] args) {
		
		 // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario el nombre de la asignatura
        System.out.print("Introduce el nombre de la asignatura: ");
        String nombre = scanner.nextLine();
        
        // Pedir al usuario la nota de la asignatura
        System.out.print("Introduce la nota de la asignatura: ");
        float nota = scanner.nextFloat();
        
        // Crear un objeto Asignatura con los datos introducidos por el usuario
        Asignatura asignatura = new Asignatura(nombre, nota);
        
        System.out.println();
        
        // Imprimir el nombre de la asignatura
        System.out.println("Asignatura: " + asignatura.getNombre());
        
        // Imprimir la calificación (Aprobado o Suspenso)
        System.out.println("Calificación: " + asignatura.calificacion());
        
        // Cerrar el scanner
        scanner.close();
		
	}

}
