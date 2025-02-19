import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AA_TODO {

	public static void main(String[] args) {		
		
		
// ---- 1º Acoplar y ordenar lista		
		
		//creo la lista
		
		ArrayList<String>lista1=new ArrayList<>();
		lista1.add("hola");
		lista1.add("casco");
		lista1.add("casa");
		
		ArrayList <String>lista2=new ArrayList <>();
		lista2.add("ordenador");
		lista2.add("mano");
		lista2.add("raton");
		
		
		//acoplar las dos listas
		
		lista1.addAll(lista2);
		
		Collections.sort(lista1);
		
		System.out.println("La lista acoplada es " + lista1);
		
		//sacar la palabra mas larga
		
		String palabraMasLarga = "";
        for (String palabra : lista1) {
            if (palabra.length() > palabraMasLarga.length()) {
                palabraMasLarga = palabra;
            }
        }
        System.out.println();
        System.out.println("La palabra más larga de la lista es: " + palabraMasLarga);
        
        
        
        
// ----2º Matriz y hacer promedio de cada fila        
        
        
int [][] materias = {{8,6,9,7}, {5,8}, {10,7,9,6,8}};
		
		int suma = 0;
		double promedio=0;
		int mos = 0;
		
		//mostrar matriz
		
		for (int [] mostrar : materias) {
			System.out.println(Arrays.toString(mostrar));
		}
		
		for (int i = 0; i<materias.length; i++) {
			for (int j = 0; j<materias[i].length; j++) {
				suma+=materias[i][j];
			}
			promedio = (double) suma/materias[i].length;     //para dividir
			mos = materias[i].length;
			System.out.println();
			System.out.println(mos + " jewrhfuerhgfiergierguierngiuer");
			System.out.println();
			System.out.printf("Fila %d: %.2f%n", i + 1, promedio);
			
		}
		
		
		
		
// ----3º Rotar Matriz		
		
		System.out.println("En este programa mostraremos una matriz y la rotaremos tanto a la derecha como a la izquierda 90º");
		System.out.println();
		
		int [][] matriz = new int [3][3];
		
		int valor = 1;
		
		//matriz rellenada
		
		for (int i = 0; i<matriz.length;i++) {
			for (int j = 0; j<matriz[i].length;j++) {
				matriz[i][j] = valor++;
			}
		}
		
		System.out.println("Esta seria la matriz original");
		System.out.println();
		
		//mostrar la matriz con foreach
		
		for (int [] mostrar : matriz) {
			System.out.println(Arrays.toString(mostrar));
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Esta seria la matriz rotada 90º  la derecha");
		System.out.println();
		System.out.println();
		
		
		int n;
		
		n = matriz.length;
		
		//crear una nueva matriz
		
		int [][]rotada = new int [n][n];
		
		//matriz rotada 90º a la derecha
		
		for (int i = 0; i<n; i++) {
			for (int j = 0; j<n; j++) {
				rotada[j][n-1-i]=matriz[i][j];
			}
		}
		
		
		//mostrar matriz rotada 90º a la derecha
		
		for (int [] i : rotada) {
			System.out.println(Arrays.toString(i));
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println("Esta seria la matriz rotada 90º  la izquierda");
		System.out.println();
		System.out.println();
		
		//matriz rotada 90º a la izquierda
		
		for (int i = 0; i<n; i++) {
			for (int j = 0; j<n; j++) {
				rotada [n-1-j][i]=matriz[i][j];
			}
		}
		
		//mostrar matriz rotada 90º a la izquierda
		
		for (int [] i : rotada) {
			System.out.println(Arrays.toString(i));
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println("Esta seria la matriz rotada 180º");
		System.out.println();
		System.out.println();
		
		//matriz rotada 180º
		
		for (int i = 0; i<n; i++) {
			for (int j = 0; j<n; j++) {
				rotada [n-1-i][n-1-j]=matriz[i][j];
			}
		}
		
		//mostrar matriz rotada 180º
		
		for (int [] i : rotada) {
			System.out.println(Arrays.toString(i));
		}
		
		
		
// ----4º Rellenar con random
		
int [] edad = new int [15];
		
		
		for (int i = 0; i<edad.length; i++) {
			edad[i] = (int) (Math.random()*43) + 18;
		}
		
		Arrays.sort(edad);
		
		System.out.println(Arrays.toString(edad));
		
		System.out.println();
		System.out.println(edad[0] + " es la edad mas pequeñas");
		System.out.println();
		System.out.println(edad[14] + " es la edad mas mayor");
        
		
	}

}
