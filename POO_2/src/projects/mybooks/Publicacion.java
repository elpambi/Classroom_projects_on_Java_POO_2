package projects.mybooks;

public abstract class Publicacion implements CanRead {
	private String titulo;
	private int numPags;
	private int pagInicial;
	private boolean formatoDigital;
	private double precio;
	private int ID;
	private int pagActual;
	private boolean leido;
	private static String mensajeCabecera = "\nDATOS LIBROS\n=============";
	private static int nextID = 0;
	
	public Publicacion(String titulo, int numPags, int pagInicial, boolean formatoDigital, double precio) {
		this.titulo = titulo;
		this.numPags = numPags;
		this.pagInicial = pagInicial;
		this.formatoDigital = formatoDigital;
		this.precio = precio;
		this.ID = nextID++;
	}

	@Override
	public String toString() {
		return "Publicacion " + titulo + " con " + numPags + " paginas " + "y precio " + precio + " €";
	}
	
	public void setPagActual(int pagActual) {
		this.pagActual = pagActual;
	}

	public abstract void show();
	
	public static String getMensajeCabecera() {
		return mensajeCabecera;
	}

	

	
	
	public String getTitulo() {
		return titulo;
	}

	public int getNumPags() {
		return numPags;
	}

	public int getPagInicial() {
		return pagInicial;
	}

	public boolean isFormatoDigital() {
		return formatoDigital;
	}

	public double getPrecio() {
		return precio;
	}

	public int getID() {
		return ID;
	}

	public int getPagActual() {
		return pagActual;
	}

	public boolean isLeido() {
		return leido;
	}

	public static int getNextID() {
		return nextID;
	}

	
	
	
	
	
}
