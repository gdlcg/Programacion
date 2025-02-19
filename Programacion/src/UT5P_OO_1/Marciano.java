package UT5P_OO_1;

public class Marciano {
	
	private boolean vivo;
	private String nombre;
	private static int numMarcianos = 0;
	
	
	public Marciano(String nombre) {
		this.nombre = nombre;
		this.vivo = true;
		numMarcianos++;
		nace();
	}
	
	public void nace() {
		System.out.println("Hola, he nacido y soy el marciano " + nombre + ": ");
	}
	
	
	public void muere() {
		vivo = false;
		numMarcianos--;
		System.out.println(nombre + " ha muerto");
	}
	
	public void estaVivo() {
		System.out.println(vivo?"Estoy vivo": "No estoy vivo");
	}
	
	
	public static int cuentaMarcianos() {
		return numMarcianos;
	}
}