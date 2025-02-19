package Mi_Espacio;

public class CuentaBancaria {
	
	private int numeroCuenta;
	private int saldo;
	private String titular;
	
	
	
	public CuentaBancaria(int numeroCuenta, int saldo, String titular) {
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.titular = titular;
	}



	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public void mostar () {
		System.out.println("El numero de la cuenta es " + numeroCuenta + " que esta asociada a " + titular + " que es el titular de la cuenta");
		System.out.println("Este es tu saldo actual " + saldo + "€");
		System.out.println();
	}
	
	
	
	public int depositar (int añadir) {
		saldo = saldo + añadir;
		return saldo;
	}
	
	
	public int retirar (int quitar) {
		saldo = saldo - quitar;
		return saldo;
	}
	
	
	
}