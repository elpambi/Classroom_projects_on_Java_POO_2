package ifElse;

public class Ejemplo2 {
	public static void main(String[] args) {
		int numeroDePreguntasRespondidas = 0;
		int podium = 1;
		if(podium == 1) {
		    numeroDePreguntasRespondidas++;
		    System.out.println("Es campeón");
		}

		if(podium == 1) {
		    numeroDePreguntasRespondidas++;
		    System.out.println("Es campeón");
		} else {
		    numeroDePreguntasRespondidas++;
		    System.out.println("No es campeón");
		}

		if(podium == 1) {
		    numeroDePreguntasRespondidas++;
		    System.out.println("Es campeón");
		} else if(podium == 2) {
		    numeroDePreguntasRespondidas++;
		    System.out.println("Es subcampeón");
		} else if(podium == 3) {
		    numeroDePreguntasRespondidas++;
		    System.out.println("Es perdedor");
		} else {
		    numeroDePreguntasRespondidas++;
		    System.out.println("No sabemos lo que es");
		}

		System.out.println(numeroDePreguntasRespondidas);
	}
}
