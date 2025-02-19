package UT2Practica4;

import java.util.Scanner;

public class chat2 {

    // Método para contar los divisores de un número
    public static int contarDivisores(int numero) {
        int divisores = 0;
        if (numero < 2) {
            return 1;  // No cuenta como primo
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                divisores++;
            }
        }
        return divisores;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario un número entre 1 y 100
        System.out.print("Ingrese un número entre 1 y 100: ");
        int n = scanner.nextInt();

        // Verificar que el número esté dentro del rango permitido
        if (n < 1 || n > 100) {
            System.out.println("El número debe estar entre 1 y 100.");
        } else {
            // Contador de números primos
            int contadorPrimos = 0;
            for (int i = 2; i <= n; i++) {
                // Verificar si es primo contando los divisores
                if (contarDivisores(i) == 0) {
                    contadorPrimos++;
                }
            }

            // Mostrar el resultado
            System.out.println("Hay " + contadorPrimos + " números primos entre 1 y " + n + ".");
        }

        scanner.close();
    }
}