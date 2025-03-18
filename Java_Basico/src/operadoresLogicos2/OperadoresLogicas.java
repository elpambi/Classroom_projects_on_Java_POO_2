package operadoresLogicos2;

public class OperadoresLogicas {
	public static void main(String[] args) {
		boolean W = false, X = true, Y = true, Z = false;
        
		System.out.println("a) W || Y && X && W || Z => " 
					+ (W || Y && X && W || Z));
		System.out.println("b) X && !Y && !X || !W && Y => " 
					+ (X && !Y && !X || !W && Y));
		System.out.println("c) !(W || !Y) && X || Z => " 
					+ (!(W || !Y) && X || Z));
		System.out.println("d) X && Y && W || Z || X => " 
					+ (!X && Y && W || Z || X));
		System.out.println("e) Y || !(Y || Z && W) => " 
					+ (Y || !(Y || Z && W)));
		System.out.println("f) !X && Y && (!Z || !X) => " 
					+ (!X && Y && (!Z || !X)));
	}
}
