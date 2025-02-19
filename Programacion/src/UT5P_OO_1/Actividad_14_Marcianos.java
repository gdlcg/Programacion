package UT5P_OO_1;

public class Actividad_14_Marcianos {

    public static void main(String[] args) {
        
        Marciano et1 = new Marciano("Gonzalo");
        System.out.println("Hay " + Marciano.cuentaMarcianos() + " marciano vivo");
        System.out.println();
        Marciano et2 = new Marciano("Elena");
        System.out.println("Hay " + Marciano.cuentaMarcianos() + " marcianos vivos");
        System.out.println();
        Marciano et3 = new Marciano("Paula");
        System.out.println("Hay " + Marciano.cuentaMarcianos() + " marcianos vivos");
        System.out.println();
        et2.muere();
        System.out.println();
        Marciano et4 = new Marciano("Pedro");
        System.out.println("Hay " + Marciano.cuentaMarcianos() + " marcianos vivos");
        
        
        System.out.println();
        System.out.println("Estado de los marcianos:");
        et1.estaVivo();
        et2.estaVivo();
        et3.estaVivo();
        et4.estaVivo();
    }
}
