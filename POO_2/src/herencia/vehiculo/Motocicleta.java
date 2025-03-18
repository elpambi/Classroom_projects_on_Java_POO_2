package herencia.vehiculo;

public class Motocicleta extends Vehiculo {
	
	public Motocicleta(int velocidadMaxima, int numeroRuedas, double peso, String matricula) {
		super(velocidadMaxima, numeroRuedas, peso, matricula);
		// TODO Auto-generated constructor stub
	}


	public void hacerCaballito() {
		System.out.println("Haciendo caballito! :O");
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
		return "Motocicleta " + super.toString();
	}
	
	
	
}
