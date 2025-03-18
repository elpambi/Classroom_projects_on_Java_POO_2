package boletin;

public class _0014 {
	public static void main(String[] args) {
		int[] listaNumeros = {3, 5, 7, 2, 8};

		int max = listaNumeros[0];

		for(int num: listaNumeros){
		    if(num > max) {
		        max = num;
		    }
		}
		System.out.printf("El máximo del array es el %d.%n", max);
	}
}
