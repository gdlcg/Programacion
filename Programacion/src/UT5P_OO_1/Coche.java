package UT5P_OO_1;

public class Coche {
	
	protected String matricula;
	protected String marca;
	protected String modelo;
	
	
	public Coche(String matricula, String marca, String modelo) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}


	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
	public void mostrarInformacion() {
		System.out.println("Matricula: " + matricula);
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
	}
	
	
}