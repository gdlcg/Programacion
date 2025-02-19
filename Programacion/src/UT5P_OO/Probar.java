package UT5P_OO;

import java.util.ArrayList;

public class Probar {

	public static void main(String[] args) {
		
		ArrayList<String> listaPaises = new ArrayList<>();
		listaPaises.add("España");
		listaPaises.add("Francia");
		listaPaises.add("Portugal");
		
		System.out.println(listaPaises);
		
		listaPaises.add(1, "Italia");     //add, para añadir un elemento en una posicion en concreto
		
		System.out.println(listaPaises);
		
		System.out.println(listaPaises.get(3));  //get() dependiendo del numero que este dentro de los parentesis, devuelve el elemento que ocupe ese lugar
		
		listaPaises.remove(2);   //remove, para eliminar un elemento de una posicion
		
		System.out.println(listaPaises);
		
		listaPaises.set(1, "Alemania");   //set, para cambiar en una posicion un elemento por otro
		
		System.out.println(listaPaises);
		
		
		int pos = listaPaises.indexOf("España");    //indexOf devuelve la posicion en la que esta el elemento
		if(pos != -1) {
			System.out.println("España encontrado en la posición: " + pos);
		}else {
			System.out.println("España no se ha encontrado");
		}
		
		System.out.println();
		
		for(int i = 0; i < listaPaises.size(); i++) {    //recorrer el arrayList con for
			System.out.println(listaPaises.get(i));
			}
		
		System.out.println();
		
		for (String s : listaPaises) {    //foreach
			System.out.println(s);
			}
		
	}

}