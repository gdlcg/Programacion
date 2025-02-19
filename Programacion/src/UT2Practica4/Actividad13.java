package UT2Practica4;

import java.util.Scanner;

public class Actividad13 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		int diaS, horaS, minS;
		int diaF, horaF, minF;
		int minutoSalida, minutoLlegada;
		int diferenciaMinuto;
		int horas, minutos;
		
		System.out.println("En este programa calcularemos el tiempo que tarda un tren en llegar a su destino");
		System.out.println("");
		System.out.println("Ingrese el dia, la hora y los minutos de salida del tren");
		System.out.println("");
		
		diaS = leer.nextInt();
		System.out.println("");
		horaS = leer.nextInt();
		System.out.println("");
		minS = leer.nextInt();
		System.out.println("");
		
		
		System.out.println("Ingrese el dia, la hora y los minutos de llegada del tren");
		System.out.println("");
		
		diaF = leer.nextInt();
		System.out.println("");
		horaF = leer.nextInt();
		System.out.println("");
		minF = leer.nextInt();
		System.out.println("");
		
        if (diaF < diaS || (diaF == diaS && horaF < horaS) || (diaF == diaS && horaF == horaS && minF < minS)) {
            System.out.println("La hora de llegada no puede ser antes que la hora de salida.");
        } else {
            minutoSalida = (diaS - 1) * 1440 + horaS * 60 + minS;
            minutoLlegada = (diaF - 1) * 1440 + horaF * 60 + minF;
            
            diferenciaMinuto = minutoLlegada - minutoSalida;
            
            horas = diferenciaMinuto / 60;
            minutos = diferenciaMinuto % 60;
            
            System.out.println("El tren tardó " + horas + " horas y " + minutos + " minutos en llegar a su destino.");
        }
        
        leer.close();
	}

}