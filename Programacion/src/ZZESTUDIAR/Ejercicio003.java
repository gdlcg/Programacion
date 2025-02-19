package ZZESTUDIAR;

public class Ejercicio003 {
	
	public static void repetir (int[] array) {
		
		int contador1=0;
		int contador2=0;
		int contador3=0;
		int contador4=0;
		int contador5=0;
		
		for (int i:array) {
			
			if (i==1) {
				contador1++;
			}
			if (i==2) {
				contador2++;
			}
			if (i==3) {
				contador3++;
			}
			if (i==4) {
				contador4++;

			}
			if (i==5) {
				contador5++;
			}
		}
		
		System.out.println(contador1);
		System.out.println(contador2);
		System.out.println(contador3);
		System.out.println(contador4);
		System.out.println(contador5);
			
		}
		
	
	

	public static void main(String[] args) {
		
		int array[]= {3, 1, 1, 2, 4, 1, 1, 2, 3, 4};
		
		System.out.println("En este programa veremos las veces que se repite un mismo numero");
		System.out.println("");
		
		repetir (array);
		
	}

}