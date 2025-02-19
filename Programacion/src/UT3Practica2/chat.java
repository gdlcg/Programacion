package UT3Practica2;

import java.util.Scanner;

public class chat {
    
    public static String alfabetico(String a, int b) {
        // Caso base: si hemos llegado al final de la palabra, la palabra está ordenada
        if (b == a.length() - 1) {
            return "La palabra está ordenada alfabéticamente.";
        }
        
        // Comparar el carácter actual con el siguiente
        if (a.charAt(b) > a.charAt(b + 1)) {
            return "La palabra no está ordenada alfabéticamente.";
        }
        
        // Llamada recursiva con el siguiente índice
        return alfabetico(a, b + 1);
    }

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String palabra, z;
        
        System.out.println("En este programa diremos si una palabra está alfabéticamente ordenada o no.");
        System.out.println("");
        System.out.println("Introduzca una palabra:");
        System.out.println(" ");
        
        palabra = leer.next();
        System.out.println("");
        
        // Llamar al método recursivo con el índice inicial 0
        
        z = alfabetico (palabra, 0);
        
        System.out.println(z);
        
        leer.close();
    }
}