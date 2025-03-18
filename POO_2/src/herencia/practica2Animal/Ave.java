package herencia.practica2Animal;

public class Ave extends Animal {

	
	public Ave(String nombre, String especie, boolean estado, boolean estaCansado) {
		super(nombre, especie, estado, estaCansado);
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
	
	public void puedenVolar() {
		switch (getEspecie()) {
		case "Pingüino": {
			System.out.println("No puede volar");
			
		}
		case "Gorrion": {
			System.out.println("Puede volar");
			break;
		}
		case "Paloma": {
			System.out.println("Puede volar");
			break;
		}
		default:
			System.out.println("Especie no encontrada: " + getEspecie());
			break;
		}
		
	}
	
}
