package UT5P_OO;

public class PrimerPrograma {

	public static void main(String[] args) {
		
		/*Circulo c1 = new Circulo();
		
		c1.setRadio(2.9);
		
		System.out.println("Los datos del circulo: " + c1.toString());*/
		
		
		// Crear el primer televisor con el constructor por defecto
		Televisor televisor1 = new Televisor();
		
        System.out.println("Estado inicial Televisor 1: Canal = " + televisor1.getCanal() + ", Volumen = " + televisor1.getVolumen());
        System.out.println();
        
     // Modificar el primer televisor
        televisor1.subirCanal();
        televisor1.subirVolumen();
        televisor1.subirVolumen();
        
        
     // Crear el segundo televisor con un canal inicial específico
        Televisor televisor2 = new Televisor(10);
        
        System.out.println();
        System.out.println("Estado inicial Televisor 2: Canal = " + televisor2.getCanal() + ", Volumen = " + televisor2.getVolumen());
        System.out.println();
        
     // Modificar el segundo televisor
        televisor2.bajarCanal();
        televisor2.setVolumen(3);
        
        
     // Crear el tercer televisor con el constructor por defecto
        Televisor televisor3 = new Televisor();
        
        System.out.println();
        System.out.println("Estado inicial Televisor 3: Canal = " + televisor3.getCanal() + ", Volumen = " + televisor3.getVolumen());
        System.out.println();
        
        
     // Modificar el tercer televisor
        televisor3.setCanal(99);
        televisor3.bajarVolumen();
        televisor3.bajarVolumen();
        
        
        // Mostrar estados finales de cada televisor
        System.out.println();
        System.out.println("Estado final Televisor 1: Canal = " + televisor1.getCanal() + ", Volumen = " + televisor1.getVolumen());
        System.out.println("Estado final Televisor 2: Canal = " + televisor2.getCanal() + ", Volumen = " + televisor2.getVolumen());
        System.out.println("Estado final Televisor 3: Canal = " + televisor3.getCanal() + ", Volumen = " + televisor3.getVolumen());
		
	}

}
