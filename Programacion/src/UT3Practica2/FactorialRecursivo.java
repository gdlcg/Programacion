package UT3Practica2;

import java.util.Scanner;

public class FactorialRecursivo {

    // Método recursivo para calcular el factorial
    public static int factorial(int n) {
        // Caso base: el factorial de 0 o 1 es 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Caso recursivo: n * factorial(n-1)
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Este programa calcula el factorial de un número.");
        System.out.print("Introduce un número entero no negativo: ");
        int numero = leer.nextInt();

        if (numero < 0) {
            System.out.println("El factorial no está definido para números negativos.");
        } else {
            int resultado = factorial(numero);
            System.out.println("El factorial de " + numero + " es: " + resultado);
        }

        leer.close();
    }
}