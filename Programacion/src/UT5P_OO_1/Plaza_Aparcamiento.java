package UT5P_OO_1;

import java.util.Scanner;

public class Plaza_Aparcamiento {
    
    private int numeroPlaza;
    private Coche cocheAparcado;
    private boolean disponible;
    private int numeroCoches;
    
    
    public Plaza_Aparcamiento(int numeroPlaza) {
        this.numeroPlaza = numeroPlaza;
        this.cocheAparcado = null;
        this.disponible = true;
        this.numeroCoches = 0;
    }

    // Getters y Setters
    public int getNumeroPlaza() {
        return numeroPlaza;
    }

    public Coche getCocheAparcado() {
        return cocheAparcado;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public int getNumeroCoches() {
        return numeroCoches;
    }
    
    
    public void aparcarCoche() {
        if (disponible != true) {
            System.out.println("Esta plaza ya esta ocupada");
        }else {
        	 Scanner scanner = new Scanner(System.in);
             System.out.print("Introduce la matrícula del coche: ");
             String matricula = scanner.nextLine();
             System.out.print("Introduce la marca del coche: ");
             String marca = scanner.nextLine();
             System.out.print("Introduce el modelo del coche: ");
             String modelo = scanner.nextLine();
             
             
             this.cocheAparcado = new Coche(matricula, marca, modelo);
             this.disponible = false;
             this.numeroCoches++;
             System.out.println("El coche ha sido aparcado");
        }       
    }
    
    
    public void sacarCoche() {
        if (disponible == true) {
            System.out.println("La plaza esta libre, por tanto no se puede sacar ningun coche");
        } else {
            System.out.println("El coche " + cocheAparcado.getMatricula() + " ha salido de su plaza");
            this.cocheAparcado = null;
            this.disponible = true;
        }
    }
    
    
    public void verCocheAparcado() {
        if (disponible == true) {
            System.out.println("La plaza esta libre");
        } else {
            System.out.println("Coche aparcado en la plaza " + numeroPlaza + ":");
            cocheAparcado.mostrarInformacion();
        }
    }
    
    
    public void mostrarEstado() {
        System.out.println("Plaza número: " + numeroPlaza);
        if (disponible == true) {
            System.out.println("Estado: Libre");
        } else {
            System.out.println("Estado: Ocupada");
            cocheAparcado.mostrarInformacion();
        }
        System.out.println("Total de coches que han aparcado en esta plaza: " + numeroCoches);
    }
}
