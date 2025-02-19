package Clase;

public class NumeroLetra {

	public static void main(String[] args) {
		
		 int numero = 12345;
	        
	        // Usando Integer.toString() para convertir el número a String
	        String texto = Integer.toString(numero);
	        
	        // Mostrar el resultado
	        System.out.println("El número como String es: " + texto);
	        
	        int cifras = texto.length();
	        
	        System.out.println("El numero tiene " + cifras + " cifras");
		
	}

}