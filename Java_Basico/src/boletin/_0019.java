package boletin;

public class _0019 {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};
		int temp = 0;

		for(int i = 0; i < array.length / 2; i++){
		    temp = array[i];
		    array[i] = array[array.length - 1 - i];
		    array[array.length - 1 - i] = temp;
		}

		for(int num: array){
		    System.out.printf("%d ", num);
		}
		System.out.println();
	}
}
