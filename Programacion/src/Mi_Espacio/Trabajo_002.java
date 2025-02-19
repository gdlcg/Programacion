package Mi_Espacio;

import java.util.Scanner;

public class Trabajo_002 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		int h, q, m, k, j, x;
		
		System.out.println("En este programa calcularemos el en que dia de la semana naciste");
		System.out.println();
		
		System.out.println("En que dia naciste");
		System.out.println();
		q = leer.nextInt();
		System.out.println();
		
		System.out.println("En que mes nacistes");
		System.out.println();
		System.out.println("Marzo = 3 || Abril = 4 ...... || Enero = 13 || Febrero = 14");
		System.out.println();
		m = leer.nextInt();
		System.out.println();
		
		System.out.println("Las dos ultimas cifras del año de tu nacimiento");
		System.out.println();
		k = leer.nextInt();
		System.out.println();
		
		System.out.println("Las dos primeras cifras del año de tu nacimiento");
		System.out.println();
		j = leer.nextInt();
		System.out.println();
		
		x = (q + ((13*(m+1))/5) + k + (k/4) + (j/4) - (2*j));
		
		h = x%7;
		
		System.out.println(h-1);
		System.out.println();
		
		
		switch (h-1) {
		case 0:
			System.out.println("El dia es sabado" );
			break;
			
		case 1:
			System.out.println("El dia es domingo");
			break;
			
		case 2:
			System.out.println("El dia es lunes");
			break;
			
		case 3:
			System.out.println("El dia es martes");
			break;
			
		case 4:
			System.out.println("El dia es miercoles");
			break;
			
		case 5:
			System.out.println("El dia es jueves");
			break;
			
		case 6:
			System.out.println("El dia es viernes");
			break;
		}
		
		leer.close();
		
	}

}
