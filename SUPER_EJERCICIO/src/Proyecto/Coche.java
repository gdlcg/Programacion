package Proyecto;

import java.util.ArrayList;

public abstract class Coche {
	
	protected String marca;
	protected int numero;
	protected float precioCoste;
	protected float precioVenta;
	protected Carroceria carroceria;
	protected Motor motor;
	protected Ruedas ruedas;
	//protected ArrayList <Ruedas> rueda = new ArrayList<>();
	
	
	
	public Coche(String marca, int numero, float precioCoste, float precioVenta, Carroceria carroceria, Motor motor, Ruedas ruedas) {
		this.marca = marca;
		this.numero = numero;
		this.precioCoste = precioCoste;
		this.precioVenta = precioVenta;
		this.carroceria = carroceria;
		this.motor = motor;
		this.ruedas = ruedas;
	}



	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public float getPrecioCoste() {
		return precioCoste;
	}
	
	public void setPrecioCoste(float precioCoste) {
		this.precioCoste = precioCoste;
	}
	
	public float getPrecioVenta() {
		return precioVenta;
	}
	
	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}
	
	
	abstract float beneficio();
	abstract void mostrar();
	abstract void mostrarTotal();
	
}