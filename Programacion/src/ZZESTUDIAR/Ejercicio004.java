package ZZESTUDIAR;

public class Ejercicio004 {

    public static int contarRepeticiones(int[] array, int numero) {
        int contador = 0;
        for (int valor : array) {
            if (valor == numero) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
    	
        int[] array = {3, 5, 1, 2, 4, 1, 5, 2, 3, 4};

        System.out.println("En este programa veremos las veces que se repite un mismo número.");
        System.out.println("");

        
        System.out.println("1 se repite: " + contarRepeticiones(array, 1) + " veces");
        System.out.println("2 se repite: " + contarRepeticiones(array, 2) + " veces");
        System.out.println("3 se repite: " + contarRepeticiones(array, 3) + " veces");
        System.out.println("4 se repite: " + contarRepeticiones(array, 4) + " veces");
        System.out.println("5 se repite: " + contarRepeticiones(array, 5) + " veces");
    }
}