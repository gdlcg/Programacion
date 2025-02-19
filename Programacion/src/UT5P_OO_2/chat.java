package UT5P_OO_2;

import java.util.Scanner;
import java.sql.Date;
import java.util.LinkedList;

public class chat {

    private static LinkedList<Cliente> clientes = new LinkedList<>();
    private static LinkedList<Cuenta> cuentas = new LinkedList<>();
    private static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("MENÚ PRINCIPAL");
            System.out.println("1.- Mantenimiento de Clientes (Altas, Bajas, Modificaciones)");
            System.out.println("2.- Mantenimiento de Cuentas");
            System.out.println("0.- Salir");
            System.out.print("Selecciona una opción: ");
            opcion = leer.nextInt();
            leer.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    mantenimientoClientes();
                    break;
                case 2:
                    mantenimientoCuentas();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 0);
    }

    public static void mantenimientoClientes() {
        int opcionCliente;
        do {
            System.out.println("\nCLIENTES");
            System.out.println("1.- Altas");
            System.out.println("2.- Bajas");
            System.out.println("3.- Modificaciones");
            System.out.println("4.- Listado");
            System.out.println("0.- Volver");
            System.out.print("Selecciona una opción: ");
            opcionCliente = leer.nextInt();
            leer.nextLine(); // Limpiar buffer

            switch (opcionCliente) {
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
                    listadoClientes();
                    break;
                case 5:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcionCliente != 0);
    }

    public static void altaCliente() {
        System.out.print("Introduce el nombre del cliente: ");
        String nombre = leer.nextLine();
        System.out.print("Introduce los apellidos del cliente: ");
        String apellidos = leer.nextLine();
        System.out.print("Introduce la dirección del cliente: ");
        String direccion = leer.nextLine();
        System.out.print("Introduce la localidad del cliente: ");
        String localidad = leer.nextLine();
        System.out.print("Introduce la fecha de nacimiento (yyyy-mm-dd): ");
        String fecha = leer.nextLine();
        Date fNacimiento = Date.valueOf(fecha);

        Cliente nuevoCliente = new Cliente(nombre, apellidos, direccion, localidad, fNacimiento);
        clientes.add(nuevoCliente); // añadir cliente al array
        System.out.println("Cliente dado de alta.");
    }

    public static void bajaCliente() {
        System.out.print("Introduce el nombre del cliente a dar de baja: ");
        String nombre = leer.nextLine();

        Cliente clienteAEliminar = null;
        for (Cliente cliente : clientes) {
            if (cliente.nombreCompleto().equals(nombre)) {
                clienteAEliminar = cliente;
                break;
            }
        }

        if (clienteAEliminar != null) {
            clientes.remove(clienteAEliminar);
            System.out.println("Cliente dado de baja.");
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }

    public static void modificarCliente() {
        System.out.print("Introduce el nombre del cliente a modificar: ");
        String nombre = leer.nextLine();

        Cliente clienteAModificar = null;
        for (Cliente cliente : clientes) {
            if (cliente.nombreCompleto().equals(nombre)) {
                clienteAModificar = cliente;
                break;
            }
        }

        if (clienteAModificar != null) {
            System.out.print("Introduce el nuevo nombre: ");
            clienteAModificar.nombre = leer.nextLine();
            System.out.print("Introduce los nuevos apellidos: ");
            clienteAModificar.apellidos = leer.nextLine();
            System.out.print("Introduce la nueva dirección: ");
            clienteAModificar.direccion = leer.nextLine();
            System.out.print("Introduce la nueva localidad: ");
            clienteAModificar.localidad = leer.nextLine();
            System.out.print("Introduce la nueva fecha de nacimiento (yyyy-mm-dd): ");
            String fecha = leer.nextLine();
            clienteAModificar.fNacimiento = Date.valueOf(fecha);
            System.out.println("Cliente modificado.");
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }

    public static void listadoClientes() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            System.out.println("\nListado de clientes:");
            for (Cliente cliente : clientes) {
                System.out.println(cliente.nombreCompleto() + " - " + cliente.direccionCompleta());
            }
        }
    }

    public static void mantenimientoCuentas() {
        // Aquí puedes implementar las opciones para manejar cuentas
        // Por ejemplo, alta de cuentas, movimientos, etc.
    }
}
