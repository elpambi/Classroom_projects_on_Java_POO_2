package herencia.vehiculo;

public class Bicicleta extends Vehiculo{

	public Bicicleta(int velocidadMaxima, int numeroRuedas, double peso, String matricula) {
		super(velocidadMaxima, numeroRuedas, peso, matricula);
		// TODO Auto-generated constructor stub
	}

	public void cambiarMarcha() {
		System.out.println("Marcha cambiada! :)");
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
	public void arrancarMotor() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pararMotor() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Bicicleta " + super.toString();
	}

	
	
	
}
