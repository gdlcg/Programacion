package UT2Practica4;

import java.util.Scanner;

public class Actividad14 {
	
	static int suma (double a, int b, double c, int d, int e) {
		
		int suma1;
		int suma2;
		int suma3;
		int suma4;
		int suma5;
		int suma6;
		
		suma1 =  (int) (b*0.05); // comision
		suma2 = (int) (c); // kilometros, donde la c no lo multiplico por 1, puesto que es el mismo valor que ha introducido el usuario
		suma3 = (int) (d*60); //dieta
		suma4 = (int) (a-(a*0.18)); //IRPF, que se le resta al sueldo fijo del usuario
		suma5 = (int) (suma4 + suma1 + suma2 + suma3); // se suma el sueldo fijo tras restarle el IRPF (18%) + la comision + los kilometros + la dieta
		suma6 = (int) (suma5-e); // a la suma de lo anterior, le restamos la retencion de la seguridad social (-150€)
		
		return suma6;
	}

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		
		double sueldo;
		int venta;
		double km;
		int dieta;
		int retencion = 150;
		
		System.out.println("En este programa calularemos el sueldo liquido del vendedor");
		System.out.println("");
		System.out.println("Indique su sueldo fijo");
		System.out.println("");
		
		sueldo = leer.nextInt();
		System.out.println("");
		System.out.println("Indique la cantidad de ventas");
		System.out.println("");
		
		venta = leer.nextInt();
		System.out.println("");
		System.out.println("Indique la cantidad de kilometros que realiza");
		System.out.println("");
		
		km = leer.nextDouble();
		System.out.println("");
		System.out.println("Indique el numero de veces que se desplaza por dia");
		System.out.println("");
		
		dieta = leer.nextInt();
		System.out.println("");
		
		double z = suma (sueldo, venta, km, dieta, retencion);
		
		System.out.println("Su sueldo liquido es de " + z + "€");
		
		leer.close();
		
	}

}