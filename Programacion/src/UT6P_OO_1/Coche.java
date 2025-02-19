package UT6P_OO_1;

public abstract class Coche {
	
	protected String marca;
	protected int numero;
	protected float precioCoste;
	protected float precioVenta;
	
	
	
	
	public Coche(String marca, int numero, float precioCoste, float precioVenta) {
		this.marca = marca;
		this.numero = numero;
		this.precioCoste = precioCoste;
		this.precioVenta = precioVenta;
	}




	public abstract void mostrar();
	
	
}