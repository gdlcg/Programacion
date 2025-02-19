package UT5P_OO_2;

import java.sql.Date;

import java.util.LinkedList;

public class Cuenta {
	
	private long numero;
	private Cliente titular;
	private float saldo;
	private double interesAnual;
	private LinkedList movimientos;
	
	
	static private class Movimiento {
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


	public Cuenta(long numero, Cliente titular, double interesAnual) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = 0;
		this.interesAnual = interesAnual;
		this.movimientos = new LinkedList<>();
	}
	
	
	public void ingreso (float cantidad) {
		
		movimientos.add(new Movimiento (new Date(numero), 'I', cantidad, saldo += cantidad));
	}
	
	
	public void reintegro (float cantidad) {
		
		movimientos.add(new Movimiento (new Date(numero), 'R', cantidad, saldo -= cantidad));
	}
	
	
    public void ingresoInteresAnual () {
		
    	double ingreso = (interesAnual * saldo / 1200);
    }
	
	
	public boolean enRojos () {
		
		return saldo < 0;
	}
	
	
	public float leerSaldo () {
		
		return saldo;
	}
	
	
	public Cliente leerTitular() { 
		return titular;
	}
	
	
	public void salvar () {
		
		System.out.println("Guardadno el estado de la cuenta");
	}
	
}