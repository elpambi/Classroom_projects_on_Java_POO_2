package arrayList.p1Biblioteca;

public class Libro {
	private String titulo;
	private String autor;
	private int anioPublicacion;
	
	
	
	public Libro(String titulo, String autor, int anioPublicacion) {
		this.titulo = titulo;
		this.autor = autor;
		this.anioPublicacion = anioPublicacion;
	}

	
	@Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Año: " + anioPublicacion;
    }


	
	
	
	
}
