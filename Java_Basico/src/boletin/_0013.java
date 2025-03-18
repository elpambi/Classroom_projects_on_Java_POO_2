package boletin;

public class _0013 {
	public static void main(String[] args) {
		int[] otrosElementos = {2, -3, 4, -1, 6};
		for(int i = 0; i < otrosElementos.length; i++){
		    if(otrosElementos[i] < 0) {
		        otrosElementos[i] = 0;
		    }
		}

		for(int e: otrosElementos){
		    System.out.printf("%d ", e);
		}
		System.out.println();
	}
}
