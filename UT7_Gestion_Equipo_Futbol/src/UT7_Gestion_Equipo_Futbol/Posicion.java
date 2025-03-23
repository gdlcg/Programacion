package UT7_Gestion_Equipo_Futbol;

public enum Posicion {
	
	Portero(2000, 3000),
	Defensa(2500, 3500),
	Centrocampista(3500, 4000),
	Delantero(4000, 5000);
	
	private final int salarioMin;
	private final int salarioMax;
	
	
	private Posicion(int salarioMin, int salarioMax) {
		this.salarioMin = salarioMin;
		this.salarioMax = salarioMax;
	}
	
	public int getSalarioMin() {
        return salarioMin;
    }

    public int getSalarioMax() {
        return salarioMax;
    }
	
}