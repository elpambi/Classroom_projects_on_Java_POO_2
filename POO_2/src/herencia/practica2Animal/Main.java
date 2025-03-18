package herencia.practica2Animal;

public class Main {
	public static void main(String[] args) {
		Ave a = new Ave("Rodolfo", "Gorrion", false, false);
		Mamifero m = new Mamifero("Jaime", "Canguro", false, false);
		Reptil r = new Reptil("Cecilia", "Serpiente", false, false);
		
		
		 // Array de diferentes animales para demostrar polimorfismo
        Animal[] animales = { a, m, r };

        System.out.println("### Interacción con los animales ###");
        for (Animal animal : animales) {
            System.out.println(animal);
            animal.comer();
            animal.dormir();
        }
		
		
		Ave[] a2 = {
				new Ave("Julian", "Paloma", false, false),
				new Ave("Hugin", "Cuervo", false, false),
				new Ave("Munin", "Pingüino", false, false)
		}; 
		
		for (Ave ave : a2) {
			System.out.println(ave);
			ave.puedenVolar();
		}
		
		
		
		System.out.println(a);
		System.out.println(m);
		System.out.println(r);
		
		
	}
}
