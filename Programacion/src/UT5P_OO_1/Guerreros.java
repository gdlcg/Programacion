package UT5P_OO_1;

public class Guerreros extends Personajes {
	
	private String arma;

    public Guerreros(String nombre, int nivelEnergia, String arma) {
        super(nombre, nivelEnergia);
        this.arma = arma;
    }

    public String combatir(int energiaGastada) {
        if (energiaGastada > nivelEnergia) {
            return nombre + " no tiene suficiente energía para atacar.";
        }else {
        	nivelEnergia -= energiaGastada;
            return "El arma a usar es: " + arma + ",\nEnergía gastada: " + energiaGastada + "\nEnergía restante: " + nivelEnergia;
        }
    }

    public String getArma() {
        return arma;
    }
	
}