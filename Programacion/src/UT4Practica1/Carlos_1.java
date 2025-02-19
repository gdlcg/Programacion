package UT4Practica1;

import java.util.Arrays;

public class Carlos_1 {

	public static void main(String[] args) {
		
		int [] edad = new int [15];
		
		
		for (int i = 0; i<edad.length; i++) {
			edad[i] = (int) (Math.random()*43) + 18;
		}
		
		Arrays.sort(edad);
		
		System.out.println(Arrays.toString(edad));
		
		System.out.println();
		System.out.println(edad[0] + " es la edad mas pequeñas");
		System.out.println();
		System.out.println(edad[14] + " es la edad mas mayor");
	}

}