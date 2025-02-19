package Mi_Espacio;

import java.util.Scanner;

public class main {
	
	private static Scanner leer = new Scanner (System.in);

	public static void main(String[] args) {
		
		int opcion;
		
		System.out.println("MENU PRINCIPAL");
		System.out.println("1.- Persona");
		System.out.println("2.- CuentaBancaria");
		System.out.println();
		opcion = leer.nextInt();
		System.out.println();
		
		switch (opcion) {
		case 1:
			metodoPersona();
			break;
		case 2:
			metodoCuentaBancaria();
		}
		
	}
	
	public static void metodoPersona() {
		String nombre, dni;
		int edad;
		
		System.out.print("Introduzca su nombre: ");
		nombre = leer.nextLine();
		System.out.print("Introduzca su edad: ");
		edad = leer.nextInt();
		leer.nextLine();
		System.out.print("Introduza su dni (con letra): ");
		dni = leer.nextLine();
		
		Persona persona = new Persona (nombre, edad, dni);
		
		System.out.println();
		persona.total();
	}
	
	public static void metodoCuentaBancaria() {
		int numeroCuenta, saldo, ingresar, sacar;
		String nombreTitular, opcion, salir;
		
		System.out.print("Introduzca el numero de la cuenta: ");
		numeroCuenta = leer.nextInt();
		System.out.print("Introduzca el saldo actual de la cuenta: ");
		saldo = leer.nextInt();
		leer.nextLine();
		System.out.print("Introduzca el nombre del titular de la cuenta: ");
		nombreTitular = leer.nextLine();
		System.out.println();
		
		CuentaBancaria cuenta = new CuentaBancaria (numeroCuenta, saldo, nombreTitular);
		
		cuenta.mostar();
		
		
		do {
			System.out.print("¿Quieres ingresar o sacar dinero? Indique fin para salir: ");
			opcion = leer.nextLine();
			System.out.println();
			switch (opcion.toLowerCase()) {
			case "ingresar":
				System.out.print("Indique la cantidad que va a ingresar: ");
				ingresar = leer.nextInt();
				cuenta.depositar(ingresar);
				System.out.println();
				System.out.println("El saldo actual de la cuanta es de " + cuenta.getSaldo() + "€");
				System.out.println();
				leer.nextLine();
				break;
			case "sacar":
				System.out.print("Indique la cantidad que va a sacar: ");
				sacar = leer.nextInt();
				cuenta.retirar(sacar);
				System.out.println();
				System.out.println("El saldo actual de la cuenta es de " + cuenta.getSaldo() + "€");
				System.out.println();
				leer.nextLine();
				break;
			case "fin":
				System.out.println("Saliendo....");
				break;
			default:
				System.out.println("Esta opcion no es valida");
			}
		}while(!opcion.equalsIgnoreCase("fin"));
		
	}

}