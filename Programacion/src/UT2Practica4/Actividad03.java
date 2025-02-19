package UT2Practica4;

import java.util.Scanner;

public class Actividad03 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int num;

        System.out.println("En este programa mostraremos cuántos números primos hay entre 1 y el número que ingrese el usuario");
        System.out.println("");
        System.out.println("Ingrese el número hasta donde se va a mostrar los números primos");
        System.out.println("");

        num = leer.nextInt();
        System.out.println("");

        if (num < 1 || num > 100) {
            System.out.println("El número debe estar entre 1 y 100.");
        } else {
            int contadorPrimos = 0;

            for (int i = 2; i <= num; i++) {
                boolean esPrimo = true;

                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        esPrimo = false;
                        break;
                    }
                }

                if (esPrimo) {
                    contadorPrimos++;
                }
            }
            
            System.out.println("Hay " + contadorPrimos + " números primos entre 1 y " + num + ".");
        }

        leer.close();
    }
}