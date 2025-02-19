package UT4Practica1;

import java.util.Arrays;

public class ZZ_Repaso_Todo {
	
	public static void matriz1 () {
		int [][] matriz1 = new int [3][3];
		int a=0;
		a=matriz1.length;
		
		int valor = 0;
		
		// rellenamos la matriz
		
		for (int fila = 0; fila<a; fila++) {
			for (int columna = 0; columna<a; columna ++) {
				matriz1 [fila][columna]=valor++;  // valor, es lo que rellena la matriz
			}
		}
		
		// mostramos la matriz
		
		for (int [] i : matriz1) {
			System.out.println(Arrays.toString(i));
		}
	}
	
	public static void matriz2 () {
		int [][] matriz2 = {{3,8,6,7}, {9,4,2,1}, {5,6,9,0}};
		
		//mostramos la matriz
		
		for (int [] i : matriz2) {
			System.out.println(Arrays.toString(i));
		}
		
	}
	
	public static void matriz3 () {
		int [][] matriz3 = new int [4][];
		
		matriz3[0] = new int [5];
		matriz3[1] = new int [2];
		matriz3[2] = new int [7];
		matriz3[3] = new int [3];
		
		int valor = 1;
		
		//rellenamos la matriz
		
		for (int fila = 0; fila<matriz3.length; fila++) {
			for (int columna = 0; columna<matriz3[fila].length; columna++) {
				matriz3[fila][columna]=valor++;
			}
		}
		
		// mostramos la matriz
		
		for (int [] i : matriz3) {
			System.out.println(Arrays.toString(i));
		}
	}
	
	public static void matriz4 () {
		int [][] matriz4 = {{15, 87, 6}, {5, 48, 63, 68, 11,35}, {89, 5}, {543, 48, 14, 86, 91, 864, 67, 00}};
		
		for (int [] i : matriz4) {
			System.out.println(Arrays.toString(i));
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Matriz normal sin dado los numeros");
		System.out.println();
		
		matriz1();
		
		System.out.println();
		System.out.println();
		System.out.println("Matriz normal dado los numeros");
		System.out.println();
		
		matriz2();
		
		System.out.println();
		System.out.println();
		System.out.println("Matriz irregular sin dado los numeros");
		System.out.println();
		
		matriz3();
		
		System.out.println();
		System.out.println();
		System.out.println("Matriz irregular dado los numeros");
		System.out.println();
		
		matriz4();
		
		
		// para incrementar valores en una matriz ponemos
		// ej:    matriz[i][j] += 2;
	}

}