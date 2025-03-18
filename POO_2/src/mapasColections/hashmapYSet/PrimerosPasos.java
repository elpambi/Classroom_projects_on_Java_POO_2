package mapasColections.hashmapYSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class PrimerosPasos {
	public static void main(String[] args) {
		String frase = "la casa de la pradera es de todos";
		String[] palabras = frase.split(" ");
		ArrayList<String> palabrasAl = new ArrayList<>();
		HashSet<String> palabrasSet = new HashSet<>();
		TreeSet<String> palabraTreeSet = new TreeSet<>(); 

		for (String palabra : palabras) {
			palabrasAl.add(palabra.toLowerCase());
			palabrasSet.add(palabra.toLowerCase());
			palabraTreeSet.add(palabra.toLowerCase());
		}
		System.out.println(palabrasAl);
		System.out.println(palabrasSet);
		System.out.println(palabraTreeSet);
		
		for (String palabra : palabrasAl) {
			System.out.print(palabra + " ");
		}
		System.out.println(".");
		
		HashMap<String, Integer> contadorDePalabras = new HashMap<>();
		
		for (String palabra : palabrasAl) {
			if (contadorDePalabras.get(palabra.toLowerCase()) == null) {
				contadorDePalabras.put(palabra, 1);
			}else {
				contadorDePalabras.put(palabra, contadorDePalabras.get(palabra) + 1);
			}
			
			System.out.println(contadorDePalabras);
			
		}
		
		
		
		
	}
}
