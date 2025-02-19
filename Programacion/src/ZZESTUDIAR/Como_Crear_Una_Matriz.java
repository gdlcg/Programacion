package ZZESTUDIAR;

public class Como_Crear_Una_Matriz {
	
	public static int [][] crearMatriz (){
				
		int [][] matriz = new int [3][3];
		
		int valor = 1;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				
				matriz [i][j] = valor ++;
			}
		}
		return matriz;
		
	}
	
	
	public static void mostrarMatriz (int[][] m) {
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + "	");
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		
		
		System.out.println("En este programa se mostrara una matriz y su diagonal principal señalada con X");
		System.out.println("");

		
		int [][] matriz = crearMatriz();
		
		mostrarMatriz (matriz);
		
		
	}
}