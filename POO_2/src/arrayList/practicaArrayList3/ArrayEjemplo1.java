package arrayList.practicaArrayList3;

import java.util.ArrayList;

public class ArrayEjemplo1 {
	
	public static void subrrayado(String texto) {
		System.out.println(texto);
		for (int i = 0; i < texto.length(); i++) {
			System.out.print("-");
		}

		System.out.println();
	}
	public static void main(String[] args) {
		ArrayList<String> colores = new ArrayList<>();
		
		subrrayado("for");
		for (int i = 0; i < 100; i++) {
			colores.add("rojo");
			colores.add("amarillo");
			colores.add("verde");
			colores.add("rojo");
			colores.add("amarillo");
			colores.add("azul");
			colores.add("naranja");
			colores.add("marron");
			colores.add("verde");
		}
		
		System.out.println(colores);
		
		System.out.println();
		
		subrrayado("for-each");
		
		for (String string : colores) {
			colores.add("rojo");
			colores.add("amarillo");
			colores.add("verde");
			colores.add("rojo");
			colores.add("amarillo");
			colores.add("azul");
			colores.add("naranja");
			colores.add("marron");
			colores.add("verde");
		}
		System.out.println(colores);
		
		subrrayado("ArrayList despues de borrado segundo rojo");
		subrrayado("ArrayList despues de borrado todos los amarillos");
		
	}
	
}
