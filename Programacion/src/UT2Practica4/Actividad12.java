package UT2Practica4;

import java.util.Scanner;

public class Actividad12 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		int num;
		int contador = 1;
		int suma1=0;
		int suma2=0;
		int suma3=0;
		int suma4=0;
		int suma5=0;
		int suma6=0;
		int porcentaje1=0;
		int porcentaje2=0;
		int porcentaje3=0;
		int porcentaje4=0;
		int porcentaje5=0;
		int porcentaje6=0;
		int aleatorio;
		
		System.out.println("En este programa se le pedira al usuario que indique las veces que se quiere lanzar un dado");
		System.out.println("");
		System.out.println("Indique las veces que se va a lanzar el dado");
		System.out.println("");
		
		num = leer.nextInt();
		System.out.println("");
		
		
		do {
			aleatorio = (int)((Math.random()*6)+1);
//se pone 6 que le rango seria [0,5] y se le suma +1, para que cuando salga el cero se convierta en 1
			
			System.out.println(aleatorio);
			
			
			switch (aleatorio) {
			case 1:
				suma1++;
				break;
			case 2:
				suma2++;
				break;
			case 3:
				suma3++;
				break;
			case 4:
				suma4++;
				break;
			case 5:
				suma5++;
				break;
			case 6:
				suma6++;
				break;
			}
			
			contador++;
		}while (contador<=num);
		
		System.out.println("");
		
		
		porcentaje1=(suma1*100)/num;
		porcentaje2=(suma2*100)/num;
		porcentaje3=(suma3*100)/num;
		porcentaje4=(suma4*100)/num;
		porcentaje5=(suma5*100)/num;
		porcentaje6=(suma6*100)/num;
		
		
		System.out.println("La cantidad de 1 que han salido es de " + porcentaje1 + "%");
		System.out.println("");
		System.out.println("La cantidad de 2 que han salido es de " + porcentaje2 + "%");
		System.out.println("");
		System.out.println("La cantidad de 3 que han salido es de " + porcentaje3 + "%");
		System.out.println("");
		System.out.println("La cantidad de 4 que han salido es de " + porcentaje4 + "%");
		System.out.println("");
		System.out.println("La cantidad de 5 que han salido es de " + porcentaje5 + "%");
		System.out.println("");
		System.out.println("La cantidad de 6 que han salido es de " + porcentaje6 + "%");
		System.out.println("");
		
		leer.close();
		
	}

}