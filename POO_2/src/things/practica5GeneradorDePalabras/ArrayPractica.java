package things.practica5GeneradorDePalabras;

import java.util.ArrayList;

public class ArrayPractica {
	public static void main(String[] args) {
		ArrayList<Integer> ArrayPares = new ArrayList<>();
		
		for (int n = 0; n < 100; n++) {
			if (n % 2 == 0) {
				ArrayPares.add(n);		
			}
		}
		System.out.println(ArrayPares);
		
	}
}
