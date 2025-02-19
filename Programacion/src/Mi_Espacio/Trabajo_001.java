package Mi_Espacio;

import java.util.Scanner;

import java.util.Random;

public class Trabajo_001 {

	public static void main(String[] args) {
		// Caracteres disponibles para la contraseña
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                          + "abcdefghijklmnopqrstuvwxyz"
                          + "0123456789"
                          + "/%()-_<>?";
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Solicitar al usuario la longitud de la contraseña
        System.out.println("Introduce la longitud de la contraseña: ");
        System.out.println("");
        int longitud = scanner.nextInt();
        System.out.println("");

        // Validar longitud
        if (longitud <= 0) {
            System.out.println("La longitud debe ser mayor a 0.");
            return;
        }

        // Generar contraseña
        StringBuilder contraseña = new StringBuilder();
        for (int i = 0; i < longitud; i++) {
            int index = random.nextInt(caracteres.length());
            contraseña.append(caracteres.charAt(index));
        }

        // Mostrar la contraseña generada
        System.out.println("Tu contraseña generada es: " + contraseña.toString());

        scanner.close();
	}

}
