package UT5P_OO_1;

public class Actividad_13_Alimento {

	public static void main(String[] args) {
		
		Alimento alimento1 = new Alimento("Manzana");
        Alimento alimento2 = new Alimento("Platano", 10, 50, 5, false, "C", "A");
        Alimento alimento3 = new Alimento("Pera", 25, 30, 15, true, "B", "C");

        // Mostrar información de cada alimento
        System.out.println("ALIMENTO 1:");
        alimento1.muestraAlimento();
        //System.out.println("¿Es dietético?: " + alimento1.esDietetico());
        System.out.println();

        System.out.println("ALIMENTO 2:");
        alimento2.muestraAlimento();
        System.out.println("¿Es dietético?: " + alimento2.esDietetico());
        System.out.println();

        System.out.println("ALIMENTO 3:");
        alimento3.muestraAlimento();
        System.out.println("¿Es dietético?: " + alimento3.esDietetico());
		
	}

}