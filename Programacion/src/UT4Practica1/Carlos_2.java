package UT4Practica1;

import java.util.ArrayList;

import java.util.Collections;

public class Carlos_2 {

	public static void main(String[] args) {
		
		ArrayList<String>lista = new ArrayList<>();
		
		lista.add("Hola");
		lista.add("Python");
		lista.add("C++");
		lista.add("Ruby");
		lista.add("eclipse");
		lista.add("studio code");
		
		ArrayList<String>nueva = new ArrayList <>();
		
        for (String palabra : lista) {
            if (palabra.length() > 4) {
                nueva.add(palabra);
            }
        }
        
        Collections.sort(nueva);
        
        System.out.println(nueva);
		
	}

}
