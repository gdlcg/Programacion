package Proyecto;

public class Monovolumen extends Coche {
	private int plazas;

	public Monovolumen(String marca, int numero, float precioCoste, float precioVenta, int plazas, Carroceria carroceria, Motor motor, Ruedas ruedas) {
		super(marca, numero, precioCoste, precioVenta, carroceria, motor, ruedas);
		this.plazas = plazas;
	}
	
	public float beneficio() {
		return (precioVenta - precioCoste);
	}
	
	public void mostrar() {
		System.out.println("Se ha añadido coche estandar " + marca + " con numero " + numero);
	}
	
	public void mostrarTotal() {
		System.out.println("Marca: " + marca);
		System.out.println("Numero: " + numero);
		System.out.println("Precio de coste: " + precioCoste);
		System.out.println("Precio de venta: " + precioVenta);
		System.out.println("Plazas: " + plazas);
		System.out.println("Color: " + carroceria.getColor());
		System.out.println("Condicion: " + carroceria.getCondicion());
		System.out.println("Numero de Bastidor: " + motor.getNumeroBastidor());
		System.out.println("Tamaño de la rueda: " + ruedas.getTamaño());
		System.out.println("Condicion de las ruedas: " + ruedas.getCondicionR());
		System.out.println();
	}
	
}