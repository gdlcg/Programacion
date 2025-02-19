package UT5P_OO_1;

public class Actividad_10_Casa_Conde {

	public static void main(String[] args) {
		
		Casa_Conde restaurante = new Casa_Conde(10, 5);

        // Mostrar ingredientes actuales
        restaurante.showPatatas();
        restaurante.showChocos();
        
        System.out.println();

        // Calcular y mostrar el número de clientes que se pueden atender
        System.out.println("Clientes que se pueden atender: " + restaurante.getComensales());
        System.out.println();

        // Agregar más ingredientes
        restaurante.addPatatas(5);
        restaurante.addChocos(3);
        
        // Mostrar ingredientes actualizados
        restaurante.showPatatas();
        restaurante.showChocos();
        
        System.out.println();

        // Volver a calcular clientes que se pueden atender
        System.out.println("Clientes que se pueden atender después de reabastecer: " + restaurante.getComensales());
		
	}

}
