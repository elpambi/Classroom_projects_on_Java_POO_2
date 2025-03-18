package herencia.vehiculo;

public class Coche extends Vehiculo {
	
	private boolean puertasAbiertas;
	private boolean motorArrancado;
	
	
	

	public Coche(int velocidadMaxima, int numeroRuedas, double peso, String matricula, boolean puertasAbiertas) {
		super(velocidadMaxima, numeroRuedas, peso, matricula);
		this.puertasAbiertas = puertasAbiertas;
	}

	public void abrirPuertas() {
		puertasAbiertas = true;
		System.out.println("Puertas Abiertas! :D");
	}
	
	public void cerrarPuertas() {
		puertasAbiertas = false;
		System.out.println("Puertas Cerradas! D:");
	}

	
	public void arrancarMotor() {
		// TODO Auto-generated method stub
		
	}

	
	public void pararMotor() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void frenar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Coche" + super.toString() + " puertasAbiertas=" + puertasAbiertas + ", motorArrancado=" + motorArrancado ;
	}

	
	

	
	
	
	
}
