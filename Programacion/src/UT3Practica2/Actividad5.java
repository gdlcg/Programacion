package UT3Practica2;

import java.util.Scanner;

public class Actividad5 {
	
	 public static String alfabetico(String a, int b) {
		 
	        if (b == a.length() - 1) {
	            return "La palabra está ordenada alfabéticamente.";
	        }
	        
	        if (a.charAt(b) > a.charAt(b + 1)) {
	            return "La palabra no está ordenada alfabéticamente.";
	        }
	        
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
	        
	        z = alfabetico (palabra, 0);
	        
	        System.out.println(z);
	        
	        leer.close();
		
	}

}