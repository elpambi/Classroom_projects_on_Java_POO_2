package enums.practicaEnum1;

public class Fieston {
	private String lugar;
	private FinDe dia;
	
	
	public Fieston(String lugar, FinDe dia) {
		this.lugar = lugar;
		this.dia = dia;
	}
	
	
	
	@Override
	public String toString() {
		return "Fieston [lugar=" + lugar + ", dia=" + dia + "]";
	}



	public static void main(String[] args) {
		Fieston f1 = new Fieston("Babilonia", FinDe.SA);
		System.out.println(f1);
		
		
		System.out.println(FinDe.SA.getNumeroDeDia());
		System.out.println(FinDe.SA.getNombreEnIngles());
		System.out.println(FinDe.SA.getNombreEnEspañol());
		
		for (FinDe f2 : FinDe.values()) {
			System.out.println(f2.presentacion());
		}
	}
	
}
