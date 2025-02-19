package UT6P_OO_1;

public class Estandar extends Coche {
	
	private int puertas;
	
	
	public Estandar(String marca, int numero, float precioCoste, float precioVenta, int puertas) {
		super(marca, numero, precioCoste, precioVenta);
		this.puertas = puertas;
	}
	
	
	
	public void mostrar() {
		System.out.println("Marca: " + marca);
		System.out.println("Numero: " + numero);
		System.out.println("Precio Coste: " + precioCoste);
		System.out.println("Precio Venta: " + precioVenta);
	}
	
	public void mostrarTodo() {
		mostrar();
		System.out.println("Numero de puertas: " + puertas);
		
	}
	
}