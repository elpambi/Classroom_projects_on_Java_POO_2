package herencia.practica2Animal;

public class Mamifero extends Animal {
	
	
	public Mamifero(String nombre, String especie, boolean estado, boolean estaCansado) {
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
	
	public void comoSeReproduce() {
		switch (getEspecie()) {
		case "Humanos", "Perro": {
			System.out.println("Placentarios: La mayoría (como humanos, leones). Crías desarrolladas dentro del útero con placenta.");
			break;
		}
		case "Canguro": {
			System.out.println("Marsupiales: Crías nacen inmaduras y se desarrollan en el marsupio (como canguros).");
			break;
		}
		case "Omnitorrinco": {
			System.out.println("Monotremas: Ponen huevos pero alimentan a las crías con leche (como el ornitorrinco).");
			break;
		}
		default:
			System.out.println("Especie no encontrada: "+ getEspecie());
			break;
		}
	}
	
	public void comoSeMueve() {
		switch (getEspecie()) {
		case "Humanos", "Perro": {
			System.out.println("Terrestres: Caminan o corren (leones, elefantes).");
			break;
		}
		case "Delfin", "Ballena": {
			System.out.println("Acuáticos: Adaptados para nadar (ballenas, focas).");
			break;
		}
		case "Murcielago": {
			System.out.println("Voladores: Murciélagos, únicos mamíferos que vuelan.");
			break;
		}
		default:
			System.out.println("Especie no encontrada: "+ getEspecie());
			break;
		}
	}
	
	
	
}
