package Clase;

import java.util.Scanner;

public class Metodo {

	    // Método recursivo para sumar los dígitos de un número

	    public static int sumarDigitos(int numero) {

	        // Caso base: si el número es menor que 10, no hay más dígitos que sumar

	        if (numero < 10) {

	            return numero;

	        }

	        // Caso recursivo: sumar el último dígito al resultado de la recursión sobre el resto

	        return (numero % 10) + sumarDigitos(numero / 10);

	    }



	    public static void main(String[] args) {

	        int numero; 
	        
	        Scanner leer = new Scanner (System.in);
	        
	        System.out.println("Ingrese un numero y se le mostrara la suma de todas las cifras ");
	        System.out.println("");
	        numero = leer.nextInt();
	        System.out.println("");

	        System.out.println("La suma de los dígitos de " + numero + " es: " + sumarDigitos(numero));
	        
	        leer.close(); 

	    }
}