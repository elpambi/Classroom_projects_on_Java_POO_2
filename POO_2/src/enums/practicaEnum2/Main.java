package enums.practicaEnum2;

public class Main {
	private Mes mes;
	private int dia;
	
	public Main(Mes mes, int dia) {
		this.mes = mes;
		this.dia = dia > 31 ? 1 : dia;
	}

	@Override
	public String toString() {
		return "Main [mes=" + mes + ", dia=" + dia + "]";
	}




	public static void main(String[] args) {
		Main m = new Main(Mes.ABR, 24);
		System.out.println(m);
		
	}
}
