package UT5P_OO_1;

public class Actividad_16_Personajes {

	public static void main(String[] args) {
		
		Guerreros guerrero1 = new Guerreros("Gonzalo", 50, "Espada");
        Magos mago1 = new Magos("Elena", "Hechizo de fuego");
        
        System.out.println(guerrero1.combatir(10));
        
        System.out.println(mago1.encantar());
        
        guerrero1.alimentarse(20);
        mago1.alimentarse(10);

        System.out.println("Energía de " + guerrero1.getNombre() + " después de alimentarse: " + guerrero1.getNivelEnergia());
        System.out.println("Energía de " + mago1.getNombre() + " después de alimentarse: " + mago1.getNivelEnergia());
		
	}

}