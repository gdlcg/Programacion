package UT5P_OO_2;

import java.sql.Date;

public class Movimiento {
	
	Date fecha;
	char tipo;
	float importe;
	float saldo;
	
	
	
	public Movimiento(Date fecha, char tipo, float importe, float saldo) {
		this.fecha = fecha;
		this.tipo = tipo;
		this.importe = importe;
		this.saldo = saldo;
	}
	
	
	
}