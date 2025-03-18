package boletin;

public class _0012 {
	public static void main(String[] args) {
		int[] elementos = {1, 2, 3, 4, 5};

		int suma = 0;

		for(int elemento :elementos){
		    suma += elemento;
		}

		System.out.printf("La suma de los elementos del array es %d%n", suma);
	}
}
