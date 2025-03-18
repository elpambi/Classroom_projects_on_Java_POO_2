package mapas.collectionsymaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Test {

	public static ArrayList<String> devulevePalabras() {
		String cadenaSinCaracteres = CuentaCuentos.cuentoLechera().replaceAll("[.,\n]", "");
		ArrayList<String> listaDePalabras = new ArrayList<>();
		String[] palabras = cadenaSinCaracteres.split("\\s+");

		for (String string : palabras) {
			listaDePalabras.add(string);
		}

		return listaDePalabras;
	}

	public static void arrayPalabras() {
		int numerosPalabras = devulevePalabras().size();
		System.out.println("Array de palabras");
		System.out.println("=================");
		System.out.println(devulevePalabras());
		System.out.printf("%nLista en ArrayList tiene %d palabras.%n", numerosPalabras);
	}

	public static void hashSetPalabras() {
		String cadenaSinCaracteres = CuentaCuentos.cuentoLechera().replaceAll("[.,\n]", "");
		HashSet<String> hashSetPalabras = new HashSet<>();
		String[] palabras = cadenaSinCaracteres.split("\\s+");

		for (String string : palabras) {
			hashSetPalabras.add(string);
		}

		int numerosPalabras = hashSetPalabras.size();
		System.out.println("HashSet de palabras");
		System.out.println("===================");
		System.out.println(hashSetPalabras);
		System.out.printf("%nLista en HashSet tiene %d palabras", numerosPalabras);

	}

	public static void treeSetpalabras() {
		String cadenaSinCaracteres = CuentaCuentos.cuentoLechera().replaceAll("[.,\n]", "");
		TreeSet<String> treeSetPalabras = new TreeSet<>();
		String[] palabras = cadenaSinCaracteres.split("\\s+");

		for (String string : palabras) {
			treeSetPalabras.add(string);
		}

		int numerosPalabras = treeSetPalabras.size();
		System.out.println("HashSet de palabras");
		System.out.println("===================");
		System.out.println(treeSetPalabras);
		System.out.printf("%nLista en HashSet tiene %d palabras", numerosPalabras);
	}

	public static void mapConteoPalabras() {
		String cadenaSinCaracteres = CuentaCuentos.cuentoLechera().replaceAll("[.,\n]", "");
		String[] palabras = cadenaSinCaracteres.split("\\s+");
		HashMap<String, Integer> vecesDePalabras = new HashMap<>();

		for (String string : palabras) {
			int contador = vecesDePalabras.getOrDefault(string, 1);
			contador++;
			vecesDePalabras.put(string, contador);
		}

		System.out.println("Conteo de repeticiones de palabras");
		System.out.println("==================================");
		System.out.println(vecesDePalabras);
	}

	public static void main(String[] args) {
		// arrayPalabras();
		// hashSetPalabras();
		// treeSetpalabras();

		mapConteoPalabras();

	}
}
