package projects.mybooks;

public class Libro extends Publicacion {
	private String autor;


	public Libro(String titulo, String autor, int numPags, int pagInicial, boolean formatoDigital, double precio) {
		super(titulo, numPags, pagInicial, formatoDigital, precio);
		this.autor = autor;
	}


	@Override
	public void show() {
		System.out.println(getMensajeCabecera());
		System.out.println("Titulo: " + getTitulo());
		System.out.printf("Autor: %s%n", autor);
		System.out.println("Id: " + getID());
		System.out.println("Paginas: " + getNumPags());
		System.out.println("Pagina inicial: " + getPagInicial());
		System.out.println("Pagina actual: " + getPagActual());
		System.out.println("Precio: " + getPrecio());
		System.out.println("Formato digital: " + isFormatoDigital());
		System.out.println("Leido: " + isLeido());
		
	}
	
	public static void showStatic(Libro libro) {
		libro.show();
	}
	
	// En Libro.java
		public static String getMensajeCabecera() {
		    return "\nDATOS LIBRO\n=============\n";
		}


		@Override
		public void leePagina(boolean silenciosamente) {
		    if (getPagActual() < getNumPags()) {  
		        int paginas = getPagActual();
		        setPagActual(++paginas); // Incrementa antes de asignar

		        if (!silenciosamente) {
		            System.out.println("Página " + paginas + " leída del libro titulado " + getTitulo() + " del autor " + autor);
		        }
		    } else {
		        System.out.println("Ya estás en la última página.");
		    }
			
		}


	
	

	

}
