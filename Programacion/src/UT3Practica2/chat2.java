package UT3Practica2;

public class chat2 {

	 public static int sumaRecursiva(int n) {
        // Caso base: si N es 1, la suma es 1
        if (n == 1) {
            System.out.print("1"); // Imprime el primer número de la suma
            return 1;
        }
        // Llama al método recursivo para los números menores y acumula la suma
        int sumaParcial = sumaRecursiva(n - 1);
        System.out.print(" + " + n); // Imprime el número actual
        return sumaParcial + n;
    }

    public static void main(String[] args) {
        int n = 4; // Puedes cambiar este valor para probar con otros números

        if (n <= 0) {
            System.out.println("El número debe ser mayor que cero.");
        } else {
            System.out.print("( ");
            int resultado = sumaRecursiva(n);
            System.out.println(" = " + resultado + " )");
        }
    }
}