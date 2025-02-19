package Reto_Viernes;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		
		ArrayList<Curso> listaCurso = new ArrayList<>();
		
		Profesor prf = new Profesor ("Antonio", listaCurso);
		
		prf.ponerCurso();      // generar un curso y se añade a prf
		
		prf.listar();
		
		prf.eliminarCurso();
		
		
		
		
		
		
		
	}

}
