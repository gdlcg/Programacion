package ZZPOO_CASA;

//import java.util.List;

import java.util.Scanner;

class CuentaBancaria {
	
	//private List <Cuentas> cuentas = new List<>();
	
	private String numeroCuenta;
	private double saldo;
	private String titular;
	
	
	public CuentaBancaria(String numeroCuenta, double saldo, String titular) {
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.titular = titular;
	}
	
	void mostrar() {
		System.out.println("El numero de cuenta es: " + numeroCuenta);
		System.out.println("El saldo actual de la cuenta es de: " + saldo + "€");
		System.out.println("El titular de la cuenta es: " + titular);
	}
	
	
	double depositarDinero(double a) {
		return (saldo+=a);
	}
	
	double retirarDinero(double a) {
		return (saldo-=a);
	}
	
	double saldoActual() {
		return saldo;
	}
	
}

public class main_002 {
	
    public static void main(String[] args) {
    	
    	Scanner leer = new Scanner (System.in);
    	
    	int opcion;
    	
    	System.out.print("Introduzca el numero de cuenta: ");
    	String numeroCuenta = leer.next();
    	
    	System.out.println();
    	System.out.print("Introduzca el saldo actual de la cuenta: ");
    	double saldo = leer.nextDouble();
    	
    	System.out.println();
    	System.out.print("Introduzca el nombre del titular de la cuenta: ");
    	String titular = leer.next();
    	
    	System.out.println();
    	CuentaBancaria c = new CuentaBancaria(numeroCuenta, saldo, titular);
    	
    	c.mostrar();
    	
    	System.out.println();
    	
    	do {
    		System.out.println("MENU");
    		System.out.println("1. Depositar dinero");
    		System.out.println("2. Retirar dinero");
    		System.out.println("3. Mostrar dinero");
    		System.out.println("4. Salir de la aplicacion");
    		System.out.println();
    		
    		System.out.print("Introduzca una opcion: ");
    		opcion = leer.nextInt();
    		
    		switch (opcion) {
    		case 1:
    			System.out.print("Introduzca la cantidad a ingresar: ");
    			double ingresar = leer.nextDouble();
    			c.depositarDinero(ingresar);
    			break;
    		case 2:
    			System.out.print("Introduzca la cantidad a retirar: ");
    			double retirar = leer.nextDouble();
    			c.retirarDinero(retirar);
    			break;
    		case 3:
    			System.out.println("Tu saldo actual es: " + c.saldoActual());
    			break;
    		case 4:
    			System.out.println("Saliendo...");
    			break;
    			default:
    				System.out.println("Esta opcion no es valida, vuelva a ingresar una opcion");
    				break;
    		}
    		
    		System.out.println();
    		
    	}while (opcion != 4);
    	
    }
}