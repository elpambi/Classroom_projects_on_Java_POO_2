package boletin;

public class _0003 {
	public static void main(String[] args) {
		int[] pares = {2, 4, 6, 8};
		int[] nones = {1, 3, 5, 7};

		int[] producto = new int[pares.length];
		for(int i = 0; i < producto.length; i++){
		    producto[i] = pares[i] * nones[i];
		}

		for(int elem: producto){
		    System.out.printf("%d ", elem);
		}
		System.out.println();
	}
}
