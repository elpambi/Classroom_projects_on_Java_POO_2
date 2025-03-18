package operadoresArimeticos3;

public class OperadoresAr {
	public static void main(String[] args) {
		char c1 = 'E', c2 = '5', c3 = '?';
        
		System.out.println("a) c1 + 1 = " 
				+ (c1 + 1));
		System.out.println("b) c1 - c2 + c3 = " 
				+ (c1 - c2 + c3));
		System.out.println("c) c2 - 2 = " 
				+ (c2 - 2));
		System.out.println("d) c2 - '2' = " 
				+ (c2 - '2'));
		System.out.println("e) c3 + '#' = " 
				+ (c3 + '#'));
		System.out.println("f) c1 % c3 = " 
				+ (c1 % c3));
		System.out.println("g) '2' + '2' = " 
				+ ('2' + '2'));
		System.out.println("(c1 / c2) * c3 = " 
				+ ((c1 / c2) * c3));
		System.out.println("i) 3 * c2 = " 
				+ (3 * c2));
		System.out.println("j) '3' * c2 = " 
				+ ('3' * c2));
	}
}
