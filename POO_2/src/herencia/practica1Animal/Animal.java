package herencia.practica1Animal;

public abstract class Animal {
	private String nombre;
	
	
	public Animal(String nombre) {
		this.nombre = nombre;
	}

	public abstract void hacerSonido();
	
	public void mostrarInfo() {
		
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + "]";
	}
	
	
	
}
