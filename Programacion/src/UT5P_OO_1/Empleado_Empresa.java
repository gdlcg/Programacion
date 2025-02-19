package UT5P_OO_1;

public class Empleado_Empresa {
	
	private String nombre;
	private int numero_horas;
	private double cobro_horas;
	
	
	public Empleado_Empresa(String nombre, int numero_horas, double cobro_horas) {
		this.nombre = nombre;
		this.numero_horas = numero_horas;
		this.cobro_horas = cobro_horas;
	}


	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getNumero_horas() {
		return numero_horas;
	}
	
	public void setNumero_horas(int numero_horas) {
		this.numero_horas = numero_horas;
	}
	
	public double getCobro_hora() {
		return cobro_horas;
	}
	
	public void setCobro_hora(double cobro_horas) {
		this.cobro_horas = cobro_horas;
	}
	
	
	public void sueldo() {
		
		double sueldo;
		int resto;
		
		
		if (numero_horas <= 40) {
			sueldo = numero_horas * cobro_horas;
			
			System.out.println(nombre + " trabajó " + numero_horas + " horas, cobra " + cobro_horas + "€ la hora por lo que le corresponde un sueldo de " + sueldo + "€ ");
			
		}else {
			resto = numero_horas - 40;
			
			sueldo = (40 * cobro_horas) + (resto * (1.5 * cobro_horas));
			
			System.out.println(nombre + " trabajó " + numero_horas + " horas, cobra " + cobro_horas + "€ la hora por lo que le corresponde un sueldo de " + sueldo + "€ ");
			
		}
		
	}
	
}