package UT5P_OO_1;

public class Personajes {
	
	protected String nombre;
    protected int nivelEnergia;

    public Personajes(String nombre, int nivelEnergia) {
        this.nombre = nombre;
        this.nivelEnergia = nivelEnergia;
    }

    public void alimentarse(int cantidad) {
        nivelEnergia += cantidad;
    }

    public int getNivelEnergia() {
        return nivelEnergia;
    }

    public String getNombre() {
        return nombre;
    }
	
}