package EjemploFor;

import java.util.Scanner;

public class Actividad3 {
	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		int num;
		int j=1;
		int x=0;
		int b=0;
		
		System.out.println("En este programa mostraremos la serie de fibonacci hasta el numero que el usuario indique");
		System.out.println("");
		System.out.println("Indique hasta que numero quiere que se muestre la serie");
		System.out.println("");
		
		num = leer.nextInt();
		System.out.println("");
		
		for (int i=0; b<num ; ) {  
//segunda parte del for, significa "hasta que". Se puede no escribir algunas partes del for, y para ello se pone el punto y coma que separe a esa parte y ya esta
			
			x=i+j;
			
			i=j;
			j=x;
			b=x+j;
			
			
			System.out.println(x);
		}
		
		leer.close();
	}
}