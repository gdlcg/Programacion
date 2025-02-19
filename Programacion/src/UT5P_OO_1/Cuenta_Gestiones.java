package UT5P_OO_1;

public class Cuenta_Gestiones {
	
	private float saldo;

	public Cuenta_Gestiones(float saldo) {
		this.saldo = saldo;
	}
	
	
	public void ingresar(float c) {
		saldo += c;
	}
	
	public void extraer(float c) {
		saldo -= c;
	}
	
	
	public float getSaldo() {
		return saldo;
	}
	
}