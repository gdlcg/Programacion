package Clase;

public class LetraNumeroInt {

	public static void main(String[] args) {
		
        String texto = "123";  // Cadena que representa un número entero
        
        //Convertir String a int
        int numero = Integer.parseInt(texto);
        
        System.out.println("El número entero es: " + numero);
        
        int hola = numero +3;
        
        System.out.println(hola);
		
	}

}