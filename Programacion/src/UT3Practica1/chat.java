package UT3Practica1;

import java.util.Scanner;

public class chat {
	
	 public static String generarEstrella(int a) {
	        String j = ""; // Inicializamos la cadena vacía

	        for (int i = 0; i < a; i++) {
	            j += "*"; // Agregamos un asterisco en cada iteración
	        }

	        return j; // Retornamos la cadena con los asteriscos
	    }
	
	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);

        int num;

        System.out.println("En este programa mostraremos en cantidad de estrellas el número que indique el usuario.");
        System.out.println("");
        System.out.print("Indique un número: ");

        num = leer.nextInt();
        System.out.println("");

        // Llamamos al método y obtenemos la cadena de estrellas
        String resultado = generarEstrella(num);

        // Mostramos el resultado
        System.out.println("Estrellas generadas: " + resultado);
        
        leer.close();
		
	}

}