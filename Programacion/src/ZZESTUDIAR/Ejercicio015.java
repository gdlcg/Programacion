package ZZESTUDIAR;

import java.util.Scanner;

public class Ejercicio015 {
	
	static int fibonacci1(int n)
	{
	    if (n>1)  return fibonacci1(n-1) + fibonacci1(n-2);  //función recursiva
	    else if (n==1)
	        return 1;
	    else
	        return 0;
	}
	//solución 2
	static int fibonacci2(int n)
	{
	    if (n>1)
	    return fibonacci2(n-1) + fibonacci2(n-2);  //función recursiva
	    else return n;
	}
	//solución 3
	static int fibonacci3(int n)
	{
	    if (n<2)
	    return n;
	    else return fibonacci3(n-1) + fibonacci3(n-2);  //función recursiva
	}

	public static void main(String[] args) {
		
Scanner leer = new Scanner (System.in);
		
		int num, z;
		
		System.out.println("En este programa crearemos la serie de Fibonacci desde 1 hasta el numero que ingrese el usuario");
		System.out.println("");
		System.out.println("Introduzca un numero");
		System.out.println("");
		
		num = leer.nextInt();
		System.out.println("");
		
		z = fibonacci1(num);
		
		System.out.println("Suma es " + z);
		
		leer.close();

	}

}