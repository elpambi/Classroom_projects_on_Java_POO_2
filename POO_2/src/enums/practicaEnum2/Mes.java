package enums.practicaEnum2;

public enum Mes {
	ENE(1, "Janaury", "Enero"), FEB(2, "February", "Febrero"), MAR(3, "March", "Marzo"), ABR(4, "April", "Abril"), MAY(5, "May", "Mayo"), JUN(6, "June", "Junio"), JUL(7, "July", "Julio"), AGO(8, "August", "Agosto"), SEP(9, "September", "Septiembre"), OCT(10, "October", "Octubre"), NOV(11, "November", "Noviembre"), DIC(12, "December", "Diciembre");
	
	private int numeroMes;
	private String nombreEN;
	private String nombreES;
	
	private Mes(int numeroMes, String nombreEN, String nombreES) {
		this.numeroMes = numeroMes;
		this.nombreEN = nombreEN;
		this.nombreES = nombreES;
	}

	public int getNumeroMes() {
		return numeroMes;
	}

	public String getNombreEN() {
		return nombreEN;
	}

	public String getNombreES() {
		return nombreES;
	}
	
	
	
	
}
