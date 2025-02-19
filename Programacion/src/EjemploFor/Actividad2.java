package EjemploFor;

import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int limite;
        
        System.out.println("Introduce un número entero: ");
        System.out.println("");
         limite= sc.nextInt();
        
        System.out.println("Números primos hasta " + limite + ":");
        System.out.println("");
        for (int i = 2; i <= limite; i++) {
            if (esPrimo(i)) {
                System.out.println(i + " ");
            }
        }
        
        sc.close();
    }
    
    // Función para determinar si un número es primo
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false; // 0 y 1 no son primos
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Si es divisible por otro número, no es primo
            }
        }
        
        return true; // Es primo si no fue divisible por ningún número
    }
}