package UT5P_OO_2;

import java.sql.Date;

public class main {

	public static void main(String[] args) {
		
		 Date fechaNacimiento = new Date(2006, 2, 28);
		
		Cliente c = new Cliente ("Gonzalo", "De La Carrera", "C/San Sebastian", "Olivares", fechaNacimiento);
		Cuenta p = new Cuenta (123456789, c, 0.02);
		
		
		System.out.println("Nombre completo: " + c.nombreCompleto());
		System.out.println();
		System.out.println("Direccion completa: " + c.direccionCompleta());
		System.out.println();
		System.out.println("Numero de cuenta: " + 123456789);
		System.out.println();
		System.out.println("Saldo inicial: " + p.leerSaldo());
		System.out.println();
		
		System.out.println("Realizar ingreso de 500€ ");
		p.ingreso(500);  //se añade 500€ a sueldo
		System.out.println();
		System.out.println("Saldo tras ingresar: " + p.leerSaldo());
		System.out.println();
		System.out.println("Realizando reintegro de 200€ ");
		p.reintegro(200);    //se retira 200€ de saldo
		System.out.println();
		System.out.println("Saldo tras reintegro: " + p.leerSaldo());
		System.out.println();
		System.out.println("Aplicando interes anual");
		p.ingresoInteresAnual();
		System.out.println();
		System.out.println("Saldo tras aplicar interes: " + p.leerSaldo());
		System.out.println();
		System.out.println("¿Esta la cuenta en numeros rojos?" + (p.enRojos() ? "   Sí" : "   No"));
		System.out.println();
		
		p.salvar();
		
		
		
	}

}