package BORRAR;

public abstract class Vehiculo {
	
	public String nombre = "Coche";
	
	
	 public Vehiculo(String nombre) {
		this.nombre = nombre;
	}
	 
	 
	 public String getNombre() {
		 
		 return nombre;
	 }
	 
	public abstract void mostrarVehiculo();
	
}