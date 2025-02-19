package UT4Practica1;

import java.util.Arrays;

public class Actividad5 {

	public static void main(String[] args) {
		
		int [][] materias = {{8,6,9,7}, {5,8}, {10,7,9,6,8}};
		
		int suma = 0;
		double promedio=0;
		int mos = 0;
		
		//mostrar matriz
		
		for (int [] mostrar : materias) {
			System.out.println(Arrays.toString(mostrar));
		}
		
		for (int i = 0; i<materias.length; i++) {
			for (int j = 0; j<materias[i].length; j++) {
				suma+=materias[i][j];
			}
			promedio = (double) suma/materias[i].length;     //para dividir
			mos = materias[i].length;
			System.out.println();
			System.out.println(mos + " jewrhfuerhgfiergierguierngiuer");
			System.out.println();
			System.out.printf("Fila %d: %.2f%n", i + 1, promedio);
			
		}		
	}

}
