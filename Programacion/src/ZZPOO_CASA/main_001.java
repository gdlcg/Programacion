package ZZPOO_CASA;

import java.util.Scanner;

abstract class Figura {
	
	abstract double calcularArea();
	
}

class Circulo extends Figura {
	
	double radio;
	
	
	
	public Circulo(double radio) {
		this.radio = radio;
	}



	double calcularArea() {
		return (Math.PI * Math.pow(radio, 2));
	}
	
}

public class main_001 {
	
    public static void main(String[] args) {
    	
    	Scanner leer = new Scanner (System.in);
    	
    	System.out.print("Introduzca el valor del radio: ");
    	
    	double radio = leer.nextDouble();
    	
    	Circulo c = new Circulo(radio);
    	
    	System.out.println("El area del circulo es: " + c.calcularArea());
    	
    	leer.close();
    	
    }
}