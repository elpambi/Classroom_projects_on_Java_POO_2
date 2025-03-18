package herencia.vehiculo;

public class Test {
	
	

	public static void main(String[] args) {
		
		Coche c = new Coche(160, 4, 1300, "4657XFD", false);
		c.acelerar();
		System.out.println(c);
		Motocicleta m = new Motocicleta(170, 2, 5000, "5679DPL");
		System.out.println(m);
		Bicicleta b = new Bicicleta(0, 0, 0, null);
		System.out.println(b);
		
	}
}
