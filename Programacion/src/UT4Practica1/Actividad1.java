package UT4Practica1;

public class Actividad1 {

	public static void main(String[] args) {
		
		System.out.println("En este programa rotaremos una matriz 90 grados hacia la derecha");
		System.out.println();
		
		int matriz [][] = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		
		//tamaño matriz
		int n = matriz.length;
		
		System.out.println("Esta es la matriz original");
		System.out.println();
		
		
		//mostrar matriz original
		for (int i = 0; i<matriz.length; i++) {
			for (int j = 0; j<matriz[i].length; j++) {
				
				System.out.print(matriz [i][j] + "	");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Esta es la matriz rotada 90 grados");
		System.out.println();
		
		int [][] rotada = new int [n][n];
		
		//rotar matriz
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				rotada [j][n-1-i] = matriz [i][j];
			}
		}
		
		//mostrar matriz rotada

//1º opcion
		
		/*for (int i = 0; i < rotada.length; i++) {
            for (int j = 0; j < rotada[i].length; j++) {
                System.out.print(rotada[i][j] + "	");
            }
            System.out.println();
        }*/

		
//2º opcion con foreach
		
		for (int [] i : rotada) {
			for (int j : i) {
				System.out.print(j +"	");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Rotada para la izquierda 90º");
		System.out.println();
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				rotada [j][n-1-i] = matriz [i][j];
			}
		}
		
		
		for (int [] i : rotada) {
			for (int j : i) {
				System.out.print(j +"	");
			}
			System.out.println();
		}
		
	}

}