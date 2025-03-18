package arrayList.practicaArrayList2;

import java.util.ArrayList;
import java.util.Random;

public class practica2 {

	public static void subrrayado(String texto) {
		System.out.println(texto);
		for (int i = 0; i < texto.length(); i++) {
			System.out.print("-");
		}

		System.out.println();
	}

	public static void muestraTodolosDatos(ArrayList<Integer> lista) {

		Random random = new Random();

		for (int i = 0; i < 20; i++) {
			lista.add(random.nextInt(100) + 1);
		}

		Integer suma = 0;
		Integer maximo = lista.get(0);
		Integer minimo = lista.get(0);

		for (Integer num : lista) {
			suma += num;
			maximo = num < maximo ? num : maximo;
			minimo = num > minimo ? num : minimo;
		}
		subrrayado("Numeros sumados");
		System.out.println(suma);

		subrrayado("Media");
		System.out.println(suma / lista.size());

		subrrayado("Numeros Maximos");
		System.out.println(maximo);

		subrrayado("Numeros Minimos");
		System.out.println(minimo);

		subrrayado("Menores de 50");
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) < 50) {
				lista.remove(i);
			}
		}
		System.out.println(lista);

		subrrayado("Menores de 50 al reves");
		for (int i = lista.size() - 1; i >= 0; i--) {
			if (lista.get(i) < 50) {
				lista.remove(i);
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();

		subrrayado("Lorem ipsum dolore est");
		System.out.println(al);
		
		muestraTodolosDatos(al);

	}
}
