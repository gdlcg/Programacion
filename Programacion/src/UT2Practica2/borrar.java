package UT2Practica2;

import java.util.Scanner;

public class borrar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor, ingresa una letra: ");
        
        char letra = scanner.next().charAt(0);
        
        // Mostrar la letra ingresada
        System.out.println("La letra que ingresaste es: " + letra);
        
        // Cerrar el Scanner
        scanner.close();
    }
}
