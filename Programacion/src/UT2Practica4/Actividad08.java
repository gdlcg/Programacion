package UT2Practica4;

public class Actividad08 {

	public static void main(String[] args) {
		
		System.out.println("En este  programa mostraremos la suma de todos los numeros pares e impares comprendidos entre 1 y 100");
		System.out.println("");
		
		int par = 0;
		int inpar = 0;
		
		for (int i = 0; i<=100; i++) {
			
			if (i%2== 0) {
				par=par+i;
			}else {
				inpar=inpar+i;
			}
			
		}
		System.out.println("La suma de todos los numeros pares es " + par);
		System.out.println("");
		System.out.println("La sumad de todos los numero inpares es " + inpar);
		
		
	}

}