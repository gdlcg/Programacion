package UT5P_OO_2;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

public class menu {
	
	private static Scanner leer = new Scanner (System.in);
	private static ArrayList<Cliente>cliente = new ArrayList<>();
	
	public static void mantenimientoClientes() {
		int opcion;
		
		do {
			System.out.println("1.- Altas");
			System.out.println("2.- Bajas");
			System.out.println("3.- Modificaciones");
			System.out.println("4.- Listado");
			System.out.println("0.- Volver");
			System.out.println();
			opcion = leer.nextInt();
			leer.nextLine();
			System.out.println();
			
			switch (opcion) {
			case 1:
				altaCliente();
				break;
			case 2:
				bajaCliente();
				break;
			case 3:
				modificarCliente();
				break;
			case 4:
				listadoCliente();
				break;
			case 0:
				System.out.println("Volviendo al menu principal");
				System.out.println();
				break;
			default:
				System.out.println("Opcion no valida");
				System.out.println();
			}
		}while (opcion != 0);
	}
	
	
	
	public static void altaCliente () {
		
		String nombre, apellidos, direccion, localidad, fecha;
		
		System.out.print("Introduzca el nombre del cliente: ");
		nombre = leer.nextLine();
		System.out.print("Introduzca los apellidos del cliente: ");
		apellidos = leer.nextLine();
		System.out.print("Introduzca la direccion del cliente: ");
		direccion = leer.nextLine();
		System.out.print("Introduzca la localidad del cliente: ");
		localidad = leer.nextLine();
		System.out.print("Introduzca la fecha de nacimiento del cliente (aaaa-mm-dd): ");
		fecha = leer.nextLine();
		Date fNacimiento = Date.valueOf(fecha);
		
		Cliente c = new Cliente (nombre, apellidos, direccion, localidad, fNacimiento);
		
		cliente.add(c);
		
		System.out.println();
		System.out.println("Cliente dado de alta");
		System.out.println();
		
	}
	
	
	
	public static void bajaCliente () {
		
		String nombre;
		boolean encontrado = false;
		
		System.out.print("Introduzca el nombre completo del cliente a dar de baja: ");
		nombre = leer.nextLine();
		System.out.println();
		
		for (Cliente a : new ArrayList<>(cliente)) {
			if (nombre.equalsIgnoreCase(a.nombreCompleto())) {
				cliente.remove(a);
				encontrado = true;
				break;
			}
		}
		
		 System.out.println("Cliente " + nombre + " eliminado correctamente.");
		
		if (!encontrado) {
			System.out.println("No se ha encontrado ningun cliente con el nombre indicado");
			System.out.println();
		}
	}
	
	
	
	public static void modificarCliente () {
		
		String completo, nombre, apellidos, direccion, localidad, fecha;
		boolean encontrado = false;
		
		System.out.print("Introduzca el nombre completo del cliente: ");
		completo = leer.nextLine();
		System.out.println();
		
		for (Cliente a : new ArrayList<>(cliente)) {
			if (completo.equalsIgnoreCase(a.nombreCompleto())) {
				
				encontrado = true;
				
				System.out.print("Introduzca el nuevo nombre del cliente: ");
				nombre = leer.nextLine();
				System.out.print("Introduzca los apeliidos del cliente: ");
				apellidos = leer.nextLine();
				System.out.print("Introduzca la direccion del cliente: ");
				direccion = leer.nextLine();
				System.out.print("Introduzca la localidad del cliente: ");
				localidad = leer.nextLine();
				System.out.print("Introduzca la fecha de nacimiento del cliente (aaaa-mm-dd): ");
				fecha = leer.nextLine();
				Date fNacimiento = Date.valueOf(fecha);
				
				Cliente c = new Cliente (nombre, apellidos, direccion, localidad, fNacimiento);
				
				cliente.add(c);
				
				System.out.println();
				System.out.println("Se ha modificado al cliente correctamente");
				System.out.println();
			}
		}
		
		if (!encontrado) {
			System.out.println("No se ha encontrado el nombre del cliente");
			System.out.println();
		}
		
	}
	
	
	
	public static void listadoCliente () {
		
		if (cliente.isEmpty()) {
			System.out.println("No hay cliente que mostrar");
			System.out.println();
		}else {
			System.out.println("Lista de los clientes: ");
			for (Cliente a : cliente) {
				System.out.println(a.nombreCompleto() + " " + a.direccionCompleta());
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		int opcion;
		
		do {
			System.out.println("Menu Principal");
			System.out.println();
			System.out.println("1.- Mantenimiento de Clientes (Altas, Bajas, Modificaciones, Listar)");
			System.out.println("2.- Mantenimiento de Cuentas");
			System.out.println("0.- Salir");
			System.out.println();
			opcion = leer.nextInt();
			leer.nextLine();
			System.out.println();
			
			switch (opcion) {
			case 1:
				mantenimientoClientes();
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			default:
				System.out.println("Opcion no valida");
			}
		} while (opcion != 0);
		
	}

}