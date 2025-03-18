package operadoresLogicos1;

public class OperadoresLogicas {
	public static void main(String[] args) {
		boolean X = true, Y = false, Z = true;
        
		System.out.println("a) (X && Y) || (X && Z) => " 
					+ ((X && Y) || (X && Z)));
		System.out.println("b) (X || !Y)&& (!X || Z) => " 
					+ ( (X || !Y)&& (!X || Z)));
		System.out.println("c) X || Y && Z => " 
					+ (X || Y && Z));
		System.out.println("d) !(X || Y) && Z => " 
					+ (!(X || Y) && Z));
		System.out.println("e) X || Y || X && !Z && !Y => " 
					+ (X || Y || X && !Z && !Y));
		System.out.println("f) !X || !Y || Z && X && !Y => " 
					+ (!X || !Y || Z && X && !Y));
	}
}
