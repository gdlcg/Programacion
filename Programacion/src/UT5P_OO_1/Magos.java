package UT5P_OO_1;

public class Magos extends Personajes {
	
	private String poder;

    public Magos(String nombre, String poder) {
        super(nombre, 100);
        this.poder = poder;
    }

    public String encantar() {
        if (nivelEnergia < 2) {
            return nombre + " no tiene suficiente energía para encantar.";
        }
        nivelEnergia -= 2;
        return "El poder del mago es: " + poder + "\nEnergía restante: " + nivelEnergia;
    }

    public String getPoder() {
        return poder;
    }
	
}