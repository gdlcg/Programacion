package EjemploFor;

import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar un número entero al usuario
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        // Invertir el número
        int numeroInvertido = invertirNumero(numero);

        // Mostrar el resultado
        System.out.println("El número invertido es: " + numeroInvertido);
        
        scanner.close();
    }

    // Método para invertir un número
    public static int invertirNumero(int numero) {
        int invertido = 0;

        while (numero != 0) {
            int digito = numero % 10; // Obtener el último dígito
            invertido = invertido * 10 + digito; // Añadirlo al número invertido
            numero /= 10; // Eliminar el último dígito
        }

        return invertido;
    }
}
