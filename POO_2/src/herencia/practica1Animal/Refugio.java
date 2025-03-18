package herencia.practica1Animal;

public class Refugio {
	public static void main(String[] args) {
		Animal[] a = { new Perro("Manchas"), 
				new Gato("Link"), 
				new Pajaro("Julian")
		};
		
		for (Animal animal : a) {
			animal.hacerSonido();
			System.out.println(animal);
		}
	}
}
