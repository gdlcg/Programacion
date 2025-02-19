package UT5P_OO_1;

public class Vehiculo {
	
	private String modelo;
	private double potencia;
	private boolean cRuedas;
	
	
	
	// Constructor
	
	public Vehiculo(String modelo) {
		this.modelo = modelo;
	}
	
	
	
	//get y set
	
	public double getPotencia() {
		return potencia;
	}


	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}


	public boolean iscRuedas() {
		return cRuedas;
	}


	public void setcRuedas(boolean cRuedas) {
		this.cRuedas = cRuedas;
	}
	
	
	public void imprimir() {
        String traccion = cRuedas ? "Sí" : "No";
        System.out.println("Modelo: " + modelo);
        System.out.println("Potencia: " + potencia + " HP");
        System.out.println("Tracción a las cuatro ruedas: " + traccion);
    }
	
	
	
	public String toString() {
	    String traccion = cRuedas ? "Sí" : "No";
	    return "Modelo: " + modelo + "\n" +
	           "Potencia: " + potencia + " HP\n" +
	           "Tracción a las cuatro ruedas: " + traccion;
	}
	
}