package enums.practicaEnum1;

public enum FinDe {
	VI(5, "Friday", "Viernes"), SA(6, "Saturday", "Sabado"), DO(7, "Sunday", "Domingo"); // Literales

	private int numeroDeDia;
	private String nombreEnIngles;
	private String nombreEnEspañol;

	private FinDe(int numeroDeDia, String nombreEnIngles, String nombreEnEspañol) {
		this.numeroDeDia = numeroDeDia;
		this.nombreEnIngles = nombreEnIngles;
		this.nombreEnEspañol = nombreEnEspañol;
	}

	
	
	public String getNombreEnIngles() {
		return nombreEnIngles;
	}

	public int getNumeroDeDia() {
		return numeroDeDia;
	}

	public String getNombreEnEspañol() {
		return nombreEnEspañol;
	}
	
	public String presentacion() {
		return String.format("El dia del fin de semana es el %s and %s", nombreEnEspañol, nombreEnIngles);
	}

}
