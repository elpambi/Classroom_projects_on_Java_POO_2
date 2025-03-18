package herencia.practica2Animal;

public class Reptil extends Animal {
	
	//Locomocion: Reptantes- no reptantes
	//Oviparos - Ovoviviparos
	
	public Reptil(String nombre, String especie, boolean estado, boolean estaCansado) {
		super(nombre, especie, estado, estaCansado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void comer() {
		if (isEstado()) {
			setEstado(false);
			System.out.println("Ha comido!");
		}
		System.out.println("No tiene hambre");
		
	}

	@Override
	public void dormir() {
		if (isEstaCansado()) {
			setEstaCansado(false);
			System.out.println("Ha descansado!");
		}
		System.out.println("No esta cansado");
		
	}
	
	public void esReptante() {
		switch (getEspecie()) {
		case "Serpiente": {
			System.out.println("Es reptante!");
			break;
		}
		case "Lagartos", "Cocodirlos": {
			System.out.println("No es reptante");
			break;
		}
		default:
			System.out.println("Especie no encontrada: "+ getEspecie());
			break;
		}
	}
	
	public void comoSeReproduceReptiles() {
		switch (getEspecie()) {
		case "Tortuga": {
			System.out.println("Oviparos");
			break;
		}
		case "Serpiente": {
			System.out.println("Ovovivíparos:");
			break;
		}
		default:
			System.out.println("Especie no encontrada: "+ getEspecie());
			break;
		}
	}

	
	
}
