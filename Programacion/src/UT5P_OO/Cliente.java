package UT5P_OO;

import java.sql.Date;

public class Cliente {
	
	private String nombre;
	private String apellidos;
	private String direccion;
	private String localidad;
	private Date fNacimiento;
	
	Cliente (String nombre1, String apellidos1, String direccion1, String localidad1, Date fNacimiento1) {
		
		nombre = nombre1;
		apellidos  = apellidos1;
		direccion = direccion1;
		localidad = localidad1;
		fNacimiento = fNacimiento1;
		
	}
	
	String nombreCompleto () {
		return nombre + " " + apellidos;
	}
	
	String direccionCompleta() {
		return direccion + " " + localidad;
	}
	
}
