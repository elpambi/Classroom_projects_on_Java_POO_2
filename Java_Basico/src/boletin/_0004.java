package boletin;

public class _0004 {
	public static void main(String[] args) {
		int numVeces = 3;

		for(int i = 0; i < numVeces; i++){
		    for(char c = '1'; c <= '9'; c++){
		        System.out.printf("%c", c);
		    }
		    if(i < numVeces - 1){
		        System.out.print("-");
		    }
		}
	}
}
