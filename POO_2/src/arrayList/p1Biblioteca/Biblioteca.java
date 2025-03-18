package arrayList.p1Biblioteca;

import java.util.ArrayList;

public class Biblioteca {
	ArrayList<Libro> catalogo;
	
	public Biblioteca() {
        catalogo = new ArrayList<>();
    }
	
	public void agregarLibro(Libro libro) {
		catalogo.add(libro);
	}
	
	public void eliminarLibro() {
		catalogo.remove(1);
	}
	
	public void listarLibro() {
		for (Libro libro : catalogo) {
			System.out.println(libro);
		}
	}
	
	 @Override
	    public String toString() {
	        StringBuilder resultado = new StringBuilder("Biblioteca:\n");
	        for (Libro libro : catalogo) {
	            resultado.append(libro.toString()).append("\n");
	        }
	        return resultado.toString();
	    }
	
}
