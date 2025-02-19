package UT4Practica1;

import java.util.Arrays;

public class Rotar_Derecha_Izquierda {

	public static void main(String[] args) {
		
		System.out.println("En este programa mostraremos una matriz y la rotaremos tanto a la derecha como a la izquierda 90º");
		System.out.println();
		
		int [][] matriz = new int [3][3];
		
		int valor = 1;
		
		//matriz rellenada
		
		for (int i = 0; i<matriz.length;i++) {
			for (int j = 0; j<matriz[i].length;j++) {
				matriz[i][j] = valor++;
			}
		}
		
		System.out.println("Esta seria la matriz original");
		System.out.println();
		
		//mostrar la matriz con foreach
		
		for (int [] mostrar : matriz) {
			System.out.println(Arrays.toString(mostrar));
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Esta seria la matriz rotada 90º  la derecha");
		System.out.println();
		System.out.println();
		
		
		int n;
		
		n = matriz.length;
		
		//crear una nueva matriz
		
		int [][]rotada = new int [n][n];
		
		//matriz rotada 90º a la derecha
		
		for (int i = 0; i<n; i++) {
			for (int j = 0; j<n; j++) {
				rotada[j][n-1-i]=matriz[i][j];
			}
		}
		
		
		//mostrar matriz rotada 90º a la derecha
		
		for (int [] i : rotada) {
			System.out.println(Arrays.toString(i));
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println("Esta seria la matriz rotada 90º  la izquierda");
		System.out.println();
		System.out.println();
		
		//matriz rotada 90º a la izquierda
		
		for (int i = 0; i<n; i++) {
			for (int j = 0; j<n; j++) {
				rotada [n-1-j][i]=matriz[i][j];
			}
		}
		
		//mostrar matriz rotada 90º a la izquierda
		
		for (int [] i : rotada) {
			System.out.println(Arrays.toString(i));
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println("Esta seria la matriz rotada 180º");
		System.out.println();
		System.out.println();
		
		//matriz rotada 180º
		
		for (int i = 0; i<n; i++) {
			for (int j = 0; j<n; j++) {
				rotada [n-1-i][n-1-j]=matriz[i][j];
			}
		}
		
		//mostrar matriz rotada 180º
		
		for (int [] i : rotada) {
			System.out.println(Arrays.toString(i));
		}
		
	}

}
