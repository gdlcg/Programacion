package Proyecto;

public class Carroceria {
	
	private String color;
	private String condicion;
	
	public Carroceria(String color, String condicion) {
		this.color = color;
		this.condicion = condicion;
	}
	
	

	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getCondicion() {
		return condicion;
	}
	
	public void setCondicion(String condicion) {
		this.condicion = condicion;
	}
	
	public void mostrar() {
		System.out.println("Este es color: " + color);
	}
	
}