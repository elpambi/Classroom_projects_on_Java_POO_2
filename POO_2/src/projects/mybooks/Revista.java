package projects.mybooks;

public class Revista extends Publicacion {

	public Revista(String titulo, int numPags, int pagInicial, boolean formatoDigital, double precio) {
		super(titulo, numPags, pagInicial, formatoDigital, precio);
	}

	@Override
	public void show() {
		System.out.println(getMensajeCabecera());
		System.out.println("Titulo: " + getTitulo());
		System.out.println("Id: " + getID());
		System.out.println("Paginas: " + getNumPags());
		System.out.println("Pagina inicial: " + getPagInicial());
		System.out.println("Pagina actual: " + getPagActual());
		System.out.println("Precio: " + getPrecio());
		System.out.println("Formato digital: " + isFormatoDigital());
		System.out.println("Leido: " + isLeido());
	}

	public static String getMensajeCabecera() {
		return "\nDATOS REVISTA\n=============\n";
	}

	@Override
	public void leePagina(boolean silenciosamente) {
		// TODO Auto-generated method stub
		
	}

}
