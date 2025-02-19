package Repaso;

import java.util.Scanner;

public class ReversoNumero {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero positivo:");
        int num = leer.nextInt();
        
        // Variable para almacenar el número invertido
        int reverso = 0;

        // Invertimos el número usando un bucle
        while (num > 0) {
            int digito = num % 10;       // Obtenemos el último dígito
            reverso = reverso * 10 + digito;  // Construimos el número invertido
            num /= 10;                   // Eliminamos el último dígito
        }
        
        System.out.println("El número invertido es: " + reverso);
        
        leer.close();
    }
}