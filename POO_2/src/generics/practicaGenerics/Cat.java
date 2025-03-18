package generics.practicaGenerics;

public class Cat {
	private String nombre;

	public Cat(String nombre) {
		this.nombre = nombre;
	}


	
	@Override
	public String toString() {
		return "Cat [nombre=" + nombre + "]";
	}



	public String getNombre() {
		return nombre;
	}
	
	
}
