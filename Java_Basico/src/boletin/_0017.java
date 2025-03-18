package boletin;

public class _0017 {
	public static void main(String[] args) {
		int[] arrayOriginal = {1, 3, 5, 7};
		int[] arrayDuplicado = new int[arrayOriginal.length];

		for(int i = 0; i < arrayOriginal.length; i++){
		    arrayDuplicado[i] = arrayOriginal[i] * 2;
		}

		for(int elem: arrayDuplicado){
		    System.out.printf("%d ", elem);
		}
	}
}
