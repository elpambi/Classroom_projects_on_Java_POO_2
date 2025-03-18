package boletin;

public class _0009 {
	public static void main(String[] args) {
		int lado = 5;

		for(int f = 0; f < lado; f++){
		    for(int c = 0; c < lado; c++){
		        if(c == 0 || c == lado - 1 || f == 0 || f == lado -1){
		            System.out.print("*");
		        } else {
		            System.out.print(" ");
		        }
		    }
		    System.out.println();
		}

		System.out.println();

		int base = 10;
		int altura = 5;

		for(int f = 0; f < altura; f++){
		    for(int c = 0; c < base; c++){
		        if(c == 0 || c == base - 1 || f == 0 || f == altura -1){
		            System.out.print("*");
		        } else {
		            System.out.print(" ");
		        }
		    }
		    System.out.println();
		}
	}
}
