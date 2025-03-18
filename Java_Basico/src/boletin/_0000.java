package boletin;

public class _0000 {
	public static void main(String[] args) {
		// [0000] Crea un array con 1000 números múltiplos de 5 y luego
//      pasa desde ese array los que sean múltiplos de 10 a 
//      otro array

//5, 10, 15 ... mil elementos

		int numeroDeMultiplosDe5 = 10;

		int[] arrayMultiplosDe5 = new int[numeroDeMultiplosDe5];

		for (int i = 0; i < numeroDeMultiplosDe5; i++) {
			// i=0 -> 5
			// i=1 -> 10
			// ...
			// i -> (i + 1)*5
			arrayMultiplosDe5[i] = (i + 1) * 5;
		}

		for (int num : arrayMultiplosDe5) {
			System.out.printf("%d ", num);
		}
		System.out.println();

		for (int i = 0; i < arrayMultiplosDe5.length; i++) {
			System.out.printf("%d -> %d%n", i, arrayMultiplosDe5[i]);
		}
		System.out.println();

		int cantidadDeMultiplosDe10 = 0;

		for (int num : arrayMultiplosDe5) {
			if (num % 10 == 0) {
				cantidadDeMultiplosDe10++;
			}
		}

		int[] arrayMultiplosDe10 = new int[cantidadDeMultiplosDe10];

		int posArrayDeMultiplosDe10 = 0;
		for (int num : arrayMultiplosDe5) {
			if (num % 10 == 0) {
				arrayMultiplosDe10[posArrayDeMultiplosDe10++] = num;
			}
		}

		for (int num : arrayMultiplosDe10) {
			System.out.printf("%d ", num);
		}
		System.out.println();

		for (int i = 0; i < arrayMultiplosDe10.length; i++) {
			System.out.printf("%d -> %d%n", i, arrayMultiplosDe10[i]);
		}
		System.out.println();
	}
}
