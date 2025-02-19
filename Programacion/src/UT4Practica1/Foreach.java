package UT4Practica1;

import java.util.Arrays;

public class Foreach {

	public static void main(String[] args) {
		
		int[][] array3 = {{1,4,5},{6,7,8},{3,8}};
		for(int[] fila : array3) {
			for(int columna : fila) {
				System.out.print(columna);
			}
		}
		
		System.out.println();
		System.out.println();
		
		int[][] array4 = {{3,8,5},{4,1,8,4},{5,2}};
		for(int[] fila : array4) {
			System.out.println(Arrays.toString(fila));
		}
		//dimensiones
		int[][] b = new int[3][];
		b[0] = new int[3];
		b[1] = new int[4];
		b[2] = new int[2];
		
		int valor = 1;
		// rellena la matriz
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = valor++;
			}
		}
		
		System.out.println();
		System.out.println();
		
		//imprime la matriz
		for (int [] i : b) {
			for (int j : i) {
				System.out.print(j + "	");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println("Con foreach  -->");
		System.out.println();
		System.out.println();
		//imprimir la matriz con foreach
		
		for (int [] i : b) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("foreach reducido");
		System.out.println();
		System.out.println();
		
		
		//imprimir la matriz con foreach reducido
		
		for (int [] i : b) {
			System.out.println(Arrays.toString(i));
		}
		
	}

}
