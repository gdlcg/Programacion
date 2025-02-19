package UT3Practica1;

import java.util.Scanner;

public class EntradaUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número o un texto:");

        if (scanner.hasNextInt()) {
            // Si la entrada es un número entero
            int numero = scanner.nextInt();
            System.out.println("Has introducido el número: " + numero);
        } else {
            // Si la entrada es texto
            String texto = scanner.next(); // Lee el texto
            System.out.println("Has introducido el texto: " + texto);
        }

        scanner.close();
    }
}