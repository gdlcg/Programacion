package UT5P_OO_1;

public class Cafetera {
	
	private int capacidadMaxima;
	private int cantidadActual;
	
	
	public Cafetera() {
		this.capacidadMaxima = 1000;
		this.cantidadActual = 0;
	}
	
	
	public Cafetera(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = capacidadMaxima;
    }


	public Cafetera(int capacidadMaxima, int cantidadActual) {
		this.capacidadMaxima = capacidadMaxima;
		this.cantidadActual = Math.min(cantidadActual, capacidadMaxima);
	}


	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public int getCantidadActual() {
		return cantidadActual;
	}

	public void setCantidadActual(int cantidadActual) {
		this.cantidadActual = Math.min(cantidadActual, capacidadMaxima);
	}
	
	
	public void llenarCafetera() {
		 this.cantidadActual = capacidadMaxima;
	}
	
	
	public void servirTazas(int cantidad) {
		
		if (cantidadActual >= cantidad) {
			cantidadActual -= cantidad;
			System.out.println("Se sirvio una taza de cafe de " + cantidad + " de cafe");
		}else {
			System.out.println("No hay suficiente cafe. Se sirvio " + cantidadActual + " de cafe");
			cantidadActual=0;
		}
	}
	
	public void vaciarCafetera() {
		this.cantidadActual = 0;
	}
	
	public void agregarCafe(int cantidad) {
		if (cantidad > 0) {
			this.cantidadActual = Math.min(cantidadActual + cantidad, capacidadMaxima);
		}
	}
	
	
	public void mostrarEstado() {
		System.out.println("Capacidad maxima: " + capacidadMaxima);
		System.out.println("Cantidad actual: " + cantidadActual);
	}
	
	
	
}