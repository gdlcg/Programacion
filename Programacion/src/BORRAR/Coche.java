package BORRAR;

public class Coche extends Vehiculo {
	
	private String modelo;

	public Coche(String nombre, String modelo) {
		super(nombre);
		this.modelo = modelo;
	}
	
	public  void mostrarVehiculo() {
		System.out.println("El tipo de Vehiculo es: " + getNombre() + " y el modelo es: " + modelo);
	}
	
	
}