package herencia.vehiculo;

public abstract class Vehiculo {
	private int velocidadMaxima;
	private int numeroRuedas;
	private double peso;
	private String matricula; // Solo si es necesario
	private int velocidad;
	
	//Metodo abstracto
	public abstract void arrancarMotor();
	public abstract void pararMotor();
	
	public void acelerar() {
		velocidad+=10;
	}
	public abstract void frenar();
	
	
	
	
	
	public Vehiculo(int velocidadMaxima, int numeroRuedas, double peso, String matricula) {
		this.velocidadMaxima = velocidadMaxima;
		this.numeroRuedas = numeroRuedas;
		this.peso = peso;
		this.matricula = matricula;
	}
	
	@Override
	public String toString() {
		return " velocidadMaxima=" + velocidadMaxima + ", numeroRuedas=" + numeroRuedas + ", peso=" + peso
				+ ", matricula=" + matricula + ", velocidad=" + velocidad ;
	}
	
	
	
	
}
