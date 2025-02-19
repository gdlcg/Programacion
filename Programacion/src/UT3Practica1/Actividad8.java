package UT3Practica1;

import java.util.Scanner;

public class Actividad8 {
	
	public static String esPalindromo (String a) {

        String invertir = "";
        for (int i = a.length()-1; i >=0; i--) {
            invertir += a.charAt(i);
        }
        return invertir;
	}
		
	
	

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		String palabra;
		String z;
		
		System.out.println("En este programa mostraremos si una palabra es palindroma o no");
		System.out.println("");
		System.out.println("Introduzca una palabra");
		System.out.println("");
		
		palabra = leer.nextLine();
		System.out.println("");
		
		palabra=palabra.toLowerCase();   // para que se convierta la palabra en minuscula
		
		z = esPalindromo (palabra);
		
		if (z.equals(palabra)) {   //utilizar ".equals" para comparar entre dos String, no se puede utilizar ==
			System.out.println("La palabra " + palabra + " es palindroma");
		}else {
			System.out.println("La palabra " + palabra + " no es palindroma");
		}
		
		leer.close();
		
		
	}

}