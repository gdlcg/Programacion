package ZZESTUDIAR;

public class MatrizDiagonal {
	
	// Método para crear una matriz de tamaño n x n
    static int[][] crearMatriz(int n) {
        int matriz [][]  = new int[n][n];
        
        for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				
                matriz[i][j] = 0; // Inicializar con ceros
            }
        }
        return matriz;
    }

    // Método para imprimir una matriz
    static void imprimirMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == 1) {
                    System.out.print("X	");
                } else {
                    System.out.print("-	");
                }
            }
            System.out.println();
        }
    }

    // Método para marcar la diagonal principal con "X"
    static void marcarDiagonalPrincipal(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            m[i][i] = 1; // Marcar con 1 la diagonal principal
        }
    }

    public static void main(String[] args) {
        int n = 4; // Tamaño de la matriz

        // Crear matriz
        int[][] matriz = crearMatriz(n);

        // Marcar la diagonal principal
        marcarDiagonalPrincipal(matriz);

        // Imprimir matriz
        System.out.println("Matriz con diagonal principal:");
        imprimirMatriz(matriz);
    }
	
}