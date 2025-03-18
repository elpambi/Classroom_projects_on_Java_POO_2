package boletin;

public class _0018 {
	public static void main(String[] args) {
		int[] arrayOriginal = {1, 2, 3, 4, 5, 4};

		int[] arrayRevertido = new int[arrayOriginal.length];

		for(int i = 0; i < arrayOriginal.length; i++){
		    arrayRevertido[arrayRevertido.length - i -1] = arrayOriginal[i];
		}

		for(int num : arrayRevertido){
		    System.out.printf("%d ", num);
		   
		}
		System.out.println();
	}
}
