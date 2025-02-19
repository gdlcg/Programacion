package UT5P_OO_1;

import java.util.Scanner;

public class Actividad_15_Cuenta {
	
	private static Scanner leer = new Scanner(System.in);

	public static void main(String[] args) {
		
		Cuenta_Gestiones cuenta = null;
		
		int opcion;
		
		do {
			System.out.println("MENU");
			System.out.println("1. Crear cuenta vacia \n2. Crear cuenta saldo inicial \n3. Ingresar dinero \n4. Sacar dinero \n5. Ver saldo \n6. Salir \n");
			
			System.out.print("Elija una opcion: ");
			opcion = leer.nextInt();
			
			switch (opcion) {
			case 1:
				cuenta = crear();
				break;
			case 2:
				cuenta = saldo();
				break;
			case 3:
				ingresar(cuenta);
				break;
			case 4:
				retirar(cuenta);
				break;
			case 5:
				System.out.println("Esta es la cantidad de sueldo que hay en tu cuenta: " + cuenta.getSaldo());
				break;
			case 6:
				System.out.println("Saliendo...");
				break;
				default:
					System.out.println("Esta opcion no corresponde a ninguna opcion");
					break;
			}
			System.out.println();
		}while (opcion != 6);
		
	}
	
	
	
	public static Cuenta_Gestiones crear() {
        System.out.println("Su cuenta ha sido creada con saldo 0€");
        return new Cuenta_Gestiones(0);
    }
	
	 public static Cuenta_Gestiones saldo() {
	        System.out.print("Indique su saldo inicial: ");
	        float saldo = leer.nextFloat();
	        System.out.println("Cuenta creada con saldo inicial: " + saldo + "€");
	        return new Cuenta_Gestiones(saldo);
	    }
	
	public static void ingresar(Cuenta_Gestiones cuenta) {
		if (cuenta != null) {
            System.out.print("Indique la cantidad a ingresar: ");
            float ingresar = leer.nextFloat();
            cuenta.ingresar(ingresar);
            
            System.out.println("Se le ha ingresado " + ingresar + "€");
            
		}else {
			System.out.println("No hay ninguna cuenta creada, cree una cuenta");
		}
	}
	
	public static void retirar(Cuenta_Gestiones cuenta) {
		if (cuenta != null) {
			System.out.print("Indique la cantidad a retirar: ");
			float retirar = leer.nextFloat();
			cuenta.extraer(retirar);
			
			System.out.println("Se le ha retirado " + retirar + "€");
			
		}else {
			System.out.println("No hay ninguna cuenta creada, cree una cuenta");
		}
	}
	

}