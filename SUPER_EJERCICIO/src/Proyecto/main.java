package Proyecto;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
	
	private static ArrayList <Coche> cocheE = new ArrayList<>();
	private static ArrayList <Coche> cocheD = new ArrayList<>();
	private static ArrayList <Coche> cocheM = new ArrayList<>();
	private static Scanner leer = new Scanner (System.in);
	
	public static void añadirCocheEstandar() {
		
		System.out.print("Marca: ");
		String marca = leer.next();
		System.out.print("Numero: ");
		int numero = leer.nextInt();
		System.out.print("Precio Coste: ");
		float precioCoste = leer.nextFloat();
		System.out.print("Precio Venta: ");
		float precioVenta = leer.nextFloat();
		System.out.print("Puertas: ");
		int puertas = leer.nextInt();
		
		System.out.println();
		
		System.out.print("Color: ");
		String color = leer.next();
		System.out.print("Condicion: ");
		String condicion = leer.next();
		
		System.out.println();
		
		System.out.print("Numero bastidor: ");
		String numeroBastidor = leer.next();
		
		System.out.println();
		
		System.out.print("Tamaño rueda: ");
		float tamaño = leer.nextFloat();
		System.out.print("Condicion rueda: ");
		String condicionR = leer.next();
		
		System.out.println();
		
		Carroceria c = new Carroceria(color, condicion);
		
		Motor m = new Motor(numeroBastidor);
		
		Ruedas r = new Ruedas(tamaño, condicionR);
		
		Coche cocheEstandar = new Estandar(marca, numero, precioCoste, precioVenta, puertas, c, m, r);
		
		cocheE.add(cocheEstandar);
		
		cocheEstandar.mostrar();
		System.out.println();
	}
	
	public static void añadirCocheDeportivo() {
		
		System.out.print("Marca: ");
		String marca = leer.next();
		System.out.print("Numero: ");
		int numero = leer.nextInt();
		System.out.print("Precio Coste: ");
		float precioCoste = leer.nextFloat();
		System.out.print("Precio Venta: ");
		float precioVenta = leer.nextFloat();
		
		System.out.println();
		
		System.out.print("Color: ");
		String color = leer.next();
		System.out.print("Condicion: ");
		String condicion = leer.next();
		
		System.out.println();
		
		System.out.print("Numero bastidor: ");
		String numeroBastidor = leer.next();
		
		System.out.println();
		
		System.out.print("Tamaño rueda: ");
		float tamaño = leer.nextFloat();
		System.out.print("Condicion rueda: ");
		String condicionR = leer.next();
		
		System.out.println();
		
		Carroceria c = new Carroceria(color, condicion);
		
		Motor m = new Motor(numeroBastidor);
		
		Ruedas r = new Ruedas(tamaño, condicionR);
		
		Coche cocheDeportivo = new Deportivo(marca, numero, precioCoste, precioVenta, c, m, r);
		
		cocheD.add(cocheDeportivo);
		
		cocheDeportivo.mostrar();
		System.out.println();
	}
	
	public static void añadirCocheMonovolumen() {
		
		System.out.print("Marca: ");
		String marca = leer.next();
		System.out.print("Numero: ");
		int numero = leer.nextInt();
		System.out.print("Precio Coste: ");
		float precioCoste = leer.nextFloat();
		System.out.print("Precio Venta: ");
		float precioVenta = leer.nextFloat();
		System.out.print("Plazas: ");
		int plazas = leer.nextInt();
		
		System.out.println();
		
		System.out.print("Color: ");
		String color = leer.next();
		System.out.print("Condicion: ");
		String condicion = leer.next();
		
		System.out.println();
		
		System.out.print("Numero bastidor: ");
		String numeroBastidor = leer.next();
		
		System.out.println();
		
		System.out.print("Tamaño rueda: ");
		float tamaño = leer.nextFloat();
		System.out.print("Condicion rueda: ");
		String condicionR = leer.next();
		
		System.out.println();
		
		Carroceria c = new Carroceria(color, condicion);
		
		Motor m = new Motor(numeroBastidor);
		
		Ruedas r = new Ruedas(tamaño, condicionR);
		
		Coche cocheMonovolumen = new Monovolumen(marca, numero, precioCoste, precioVenta, plazas, c, m, r);
		
		cocheM.add(cocheMonovolumen);
		
		cocheMonovolumen.mostrar();
		System.out.println();
	}
	
	public static void mostrarCocheEstandar() {
		
		System.out.println("Lista de coche estandar: ");
		
		for (Coche a : cocheE) {
			//if (a instanceof Estandar) {
	            a.mostrarTotal();
	        //}
		}
		System.out.println();
	}
	
	public static void mostrarCocheDeportivo() {
		
		System.out.println("Lita de coche deportivo: ");
		
		for (Coche b : cocheD) {
			//if (b instanceof Deportivo) {
	            b.mostrarTotal();
	        //}
		}
		System.out.println();
	}
	
	public static void mostrarCocheMonovolumen() {
		
		System.out.println("Lita de coche Monovolumen: ");
		
		for (Coche c : cocheM) {
			//if (c instanceof Monovolumen) {
	            c.mostrarTotal();
	        //}
		}
	}
	

	public static void main(String[] args) {
		
		int opcion;
		
		do {
			System.out.println("MENU");
			System.out.println("1. Añadir coche");
			System.out.println("2. Mostrar coche");
			System.out.println("3. Mostrar beneficio");
			System.out.println("4. Salir del programa");
			System.out.println();
			System.out.print("Indique la opcion: ");
			opcion = leer.nextInt();
			
			switch (opcion) {
			case 1:
				String tipo1;
				
				do {
					System.out.print("Que tipo de coche quieres añadir: Estandar, Deportivo o Monovolumen: ");
					tipo1 = leer.next();
					System.out.println();
					if(tipo1.equalsIgnoreCase("Estandar")) {
						añadirCocheEstandar();
					}else if (tipo1.equalsIgnoreCase("Deportivo")) {
						añadirCocheDeportivo();
					}else if (tipo1.equalsIgnoreCase("Monovolumen")) {
						añadirCocheMonovolumen();
					}else {
						System.out.println("Esta opcion no es valida, vuelva a indicar un tipo de coche");
						System.out.println();
					}break;
				}while (tipo1 != "Estandar" || tipo1 != "Deportivo" || tipo1 != "Monovolumen");
				break;
				
			case 2:
				String tipo2;
				
				do {
					System.out.print("Que tipo de coche quieres mostrar: Estandar, Deportivo o Monovolumen: ");
					tipo2 = leer.next();
					System.out.println();
					if(tipo2.equalsIgnoreCase("Estandar")) {
						mostrarCocheEstandar();
					}else if (tipo2.equalsIgnoreCase("Deportivo")) {
						mostrarCocheDeportivo();
					}else if (tipo2.equalsIgnoreCase("Monovolumen")) {
						mostrarCocheMonovolumen();
					}else {
						System.out.println("Esta opcion no es valida, vuelva a indicar un tipo de coche");
						System.out.println();
					}break;
				}while (!tipo2.equals("Estandar") || tipo2 != "Deportivo" || tipo2 != "Monovolumen");
				break;
				
			case 3:
				
				break;
				
			case 4:
				System.out.println("Saliendo del programa...");
				break;
				default:
					System.out.println("Opcion no valida, vuelva a ingresar una opcion del menu");
					System.out.println();
					break;
			}
			
		}while (opcion != 4);
		
	}
	
}