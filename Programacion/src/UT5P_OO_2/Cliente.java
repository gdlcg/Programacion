package UT5P_OO_2;

import java.sql.Date;

public class Cliente {
	
	String nombre;
	String apellidos;
	String direccion;
	String localidad;
	Date fNacimiento;
	
	
	public Cliente(String nombre, String apellidos, String direccion, String localidad, Date fNacimiento) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.localidad = localidad;
		this.fNacimiento = fNacimiento;
	}
	
	
	String nombreCompleto () { 
		return nombre + " " + apellidos;
	}
	
	String direccionCompleta () { 
		return direccion + ", " + localidad;
	}
	
}