package things.practica4Adivinacion;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Adivinacion {
	public static void main(String[] args) {
		Random r = new Random();
		int numeroaleatorio = r.nextInt(1, 101);
		ArrayList<Integer> historicoDeIntentos = new ArrayList<>();
		int intento = 0;
		Scanner scanner = new Scanner(System.in);
		
		
		while (true) {
			historicoDeIntentos.add(intento);
			System.out.print("Introduce tu intento: ");
			intento = scanner.nextInt();
			System.out.printf("Introducido: %d%n", intento);
			
			if (intento == numeroaleatorio) {
				System.out.println("Has acertado! Era: " + numeroaleatorio);
				System.out.println(historicoDeIntentos);
				break;
			}
			else if(intento < numeroaleatorio) {
				System.out.println("El numero es mayor");
				continue;
			}
			else if(intento > numeroaleatorio) {
				System.out.println("El numero es menor");
				continue;
			}
			
		}
		
		
		
		
		
		
	}
}
