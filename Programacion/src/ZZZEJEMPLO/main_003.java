package ZZZEJEMPLO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Carroceria {
    private String color;
    private String condicion;

    public Carroceria(String color, String condicion) {
        this.color = color;
        this.condicion = condicion;
    }

    @Override
    public String toString() {
        return "Color: " + color + ", Condición: " + condicion;
    }
}

class Motor {
    private String numeroBastidor;

    public Motor(String numeroBastidor) {
        this.numeroBastidor = numeroBastidor;
    }

    @Override
    public String toString() {
        return "Número de bastidor: " + numeroBastidor;
    }
}

class Ruedas {
    private float tamaño;
    private String condicion;

    public Ruedas(float tamaño, String condicion) {
        this.tamaño = tamaño;
        this.condicion = condicion;
    }

    @Override
    public String toString() {
        return "Tamaño: " + tamaño + ", Condición: " + condicion;
    }
}

abstract class Coche {
    protected String marca;
    protected int numero;
    protected float precioCoste;
    protected float precioVenta;
    protected Carroceria carroceria;
    protected Motor motor;
    protected Ruedas ruedas;

    public Coche(String marca, int numero, float precioCoste, float precioVenta, Carroceria carroceria, Motor motor, Ruedas ruedas) {
        this.marca = marca;
        this.numero = numero;
        this.precioCoste = precioCoste;
        this.precioVenta = precioVenta;
        this.carroceria = carroceria;
        this.motor = motor;
        this.ruedas = ruedas;
    }

    public abstract float beneficio();

    @Override
    public String toString() {
        return "Marca: " + marca + ", Número: " + numero + ", Precio Coste: " + precioCoste + "€, Precio Venta: " + precioVenta +
                "€, Beneficio: " + beneficio() + "€, " + carroceria + ", " + motor + ", " + ruedas;
    }
}

class Estandar extends Coche {
    private int puertas;

    public Estandar(String marca, int numero, float precioCoste, float precioVenta, int puertas, Carroceria carroceria, Motor motor, Ruedas ruedas) {
        super(marca, numero, precioCoste, precioVenta, carroceria, motor, ruedas);
        this.puertas = puertas;
    }

    @Override
    public float beneficio() {
        return precioVenta - precioCoste;
    }

    @Override
    public String toString() {
        return "Estandar: " + super.toString() + ", Puertas: " + puertas;
    }
}

class Deportivo extends Coche {
    public Deportivo(String marca, int numero, float precioCoste, float precioVenta, Carroceria carroceria, Motor motor, Ruedas ruedas) {
        super(marca, numero, precioCoste, precioVenta, carroceria, motor, ruedas);
    }

    @Override
    public float beneficio() {
        return precioVenta - precioCoste;
    }

    @Override
    public String toString() {
        return "Deportivo: " + super.toString();
    }
}

class Monovolumen extends Coche {
    private int plazas;

    public Monovolumen(String marca, int numero, float precioCoste, float precioVenta, int plazas, Carroceria carroceria, Motor motor, Ruedas ruedas) {
        super(marca, numero, precioCoste, precioVenta, carroceria, motor, ruedas);
        this.plazas = plazas;
    }

    @Override
    public float beneficio() {
        return precioVenta - precioCoste;
    }

    @Override
    public String toString() {
        return "Monovolumen: " + super.toString() + ", Plazas: " + plazas;
    }
}

public class main_003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Coche> coches = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Agregar coche estándar");
            System.out.println("2. Agregar coche deportivo");
            System.out.println("3. Agregar monovolumen");
            System.out.println("4. Mostrar todos los coches");
            System.out.println("5. Mostrar coches por tipo");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();

            if (opcion == 6) break;

            System.out.print("Marca: ");
            String marca = scanner.next();
            System.out.print("Número: ");
            int numero = scanner.nextInt();
            System.out.print("Precio de coste: ");
            float precioCoste = scanner.nextFloat();
            System.out.print("Precio de venta: ");
            float precioVenta = scanner.nextFloat();

            System.out.print("Color carrocería: ");
            String color = scanner.next();
            System.out.print("Condición carrocería: ");
            String condicionCarroceria = scanner.next();
            Carroceria carroceria = new Carroceria(color, condicionCarroceria);

            System.out.print("Número de bastidor: ");
            String numeroBastidor = scanner.next();
            Motor motor = new Motor(numeroBastidor);

            System.out.print("Tamaño de ruedas: ");
            float tamañoRuedas = scanner.nextFloat();
            System.out.print("Condición de ruedas: ");
            String condicionRuedas = scanner.next();
            Ruedas ruedas = new Ruedas(tamañoRuedas, condicionRuedas);

            switch (opcion) {
                case 1:
                    System.out.print("Número de puertas: ");
                    int puertas = scanner.nextInt();
                    coches.add(new Estandar(marca, numero, precioCoste, precioVenta, puertas, carroceria, motor, ruedas));
                    break;
                case 2:
                    coches.add(new Deportivo(marca, numero, precioCoste, precioVenta, carroceria, motor, ruedas));
                    break;
                case 3:
                    System.out.print("Número de plazas: ");
                    int plazas = scanner.nextInt();
                    coches.add(new Monovolumen(marca, numero, precioCoste, precioVenta, plazas, carroceria, motor, ruedas));
                    break;
                case 4:
                    System.out.println("\nLista de todos los coches:");
                    for (Coche c : coches) {
                        System.out.println(c);
                    }
                    break;
                case 5:
                    System.out.print("¿Qué tipo de coche deseas ver? (Estandar, Deportivo, Monovolumen): ");
                    String tipo = scanner.next();
                    for (Coche c : coches) {
                        if ((tipo.equalsIgnoreCase("Estandar") && c instanceof Estandar) ||
                            (tipo.equalsIgnoreCase("Deportivo") && c instanceof Deportivo) ||
                            (tipo.equalsIgnoreCase("Monovolumen") && c instanceof Monovolumen)) {
                            System.out.println(c);
                        }
                    }
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        scanner.close();
    }
}
