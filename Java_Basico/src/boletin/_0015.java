package boletin;

public class _0015 {
	public static void main(String[] args) {
		int[] listaNumeros = {3, 5, 7, 2, 8};

		int min = listaNumeros[0];

		for(int num: listaNumeros){
		    if(num < min) {
		        min  = num;
		    }
		}

		System.out.printf("El mínimo del array es el %d.%n", min);
	}
}
