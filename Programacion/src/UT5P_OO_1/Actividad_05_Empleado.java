package UT5P_OO_1;

import java.util.Scanner;

public class Actividad_05_Empleado {

	public static void main(String[] args) {
		
		 // Crear un objeto Scanner para leer datos desde el teclado
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar los datos al usuario para el primer empleado
        System.out.println("Introduzca los datos del primer empleado:");

        System.out.print("NIF: ");
        String nif = scanner.nextLine();
        
        System.out.print("Sueldo Base: ");
        float sueldoBase = scanner.nextFloat();
        
        System.out.print("Pago por Hora Extra: ");
        float pagoHoraExtra = scanner.nextFloat();
        
        System.out.print("Horas Extras: ");
        int horasExtras = scanner.nextInt();
        
        System.out.print("IRPF (%): ");
        int irpf = scanner.nextInt();
        
        System.out.print("¿Está casado? (true/false): ");
        boolean casado = scanner.nextBoolean();
        
        System.out.print("Número de hijos: ");
        int hijos = scanner.nextInt();
        
        // Crear el objeto Empleado con los datos introducidos por el usuario
        Empleado empleado1 = new Empleado(nif, sueldoBase, pagoHoraExtra, horasExtras, irpf, casado, hijos);
        
        // Limpiar el buffer del scanner
        scanner.nextLine();  // Para capturar el salto de línea que queda después de un número

        // Mostrar la información básica del primer empleado
        System.out.println("\nInformación básica del primer empleado:");
        empleado1.println();
        
        // Mostrar toda la información del primer empleado
        System.out.println("\nToda la información del primer empleado:");
        empleado1.printAll();
        
        // Ahora para el segundo empleado, repite el proceso
        System.out.println("\nIntroduzca los datos del segundo empleado:");

        System.out.print("NIF: ");
        nif = scanner.nextLine();
        
        System.out.print("Sueldo Base: ");
        sueldoBase = scanner.nextFloat();
        
        System.out.print("Pago por Hora Extra: ");
        pagoHoraExtra = scanner.nextFloat();
        
        System.out.print("Horas Extras: ");
        horasExtras = scanner.nextInt();
        
        System.out.print("IRPF (%): ");
        irpf = scanner.nextInt();
        
        System.out.print("¿Está casado? (true/false): ");
        casado = scanner.nextBoolean();
        
        System.out.print("Número de hijos: ");
        hijos = scanner.nextInt();
        
        // Limpiar el buffer del scanner
        scanner.nextLine();  // Para capturar el salto de línea

        // Crear el segundo objeto Empleado con los datos introducidos por el usuario
        Empleado empleado2 = new Empleado(nif, sueldoBase, pagoHoraExtra, horasExtras, irpf, casado, hijos);
        
        // Mostrar la información básica del segundo empleado
        System.out.println("\nInformación básica del segundo empleado:");
        empleado2.println();
        
        // Mostrar toda la información del segundo empleado
        System.out.println("\nToda la información del segundo empleado:");
        empleado2.printAll();

        // Cerrar el scanner
        scanner.close();
		
	}

}
