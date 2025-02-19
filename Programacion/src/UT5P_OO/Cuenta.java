package UT5P_OO;

public class Cuenta {
	
	private long numero;
	private Cliente titular;
	private float saldo;
	private float interesAnual;
	
	Cuenta (long numero1, Cliente titular1, float saldo1, float interesAnual1) {
		
		numero = numero1;
		titular = titular1;
		saldo = saldo1;
		interesAnual = interesAnual1;
		
	}
	
	void ingreso(int cantidad) {
		if (cantidad>0) {
			saldo+=cantidad;
		}
	}
	
	void reintegro(int cantidad) {
		if (cantidad>0 && saldo >= cantidad) {
			saldo-=cantidad;
		}
	}
	
	void ingresoInteresMes() {
		saldo += saldo * (interesAnual/12/100);
	}
	
	boolean enRojos() {
		return saldo < 0;
	}
	
	float leerSaldo() {
		return saldo;
	}
	
	Cliente leerTitular() {
		return titular;
	}
	
	void salvar() {
		System.out.println("Cuenta guardada correctamente.");
	}
	
	
	
}