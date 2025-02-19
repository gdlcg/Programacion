package Proyecto;

public class Ruedas {
	
	private float tamaño;
	private String condicionR;
	
	public Ruedas(float tamaño, String condicionR) {
		this.tamaño = tamaño;
		this.condicionR = condicionR;
	}
	
	
	
	public float getTamaño() {
		return tamaño;
	}
	
	public void setTamaño(float tamaño) {
		this.tamaño = tamaño;
	}
	
	public String getCondicionR() {
		return condicionR;
	}
	
	public void setCondicionR(String condicionR) {
		this.condicionR = condicionR;
	}
	
}