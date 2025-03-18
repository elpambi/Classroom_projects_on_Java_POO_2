package operadoresArimeticos2;

public class OperadoresAr {
	public static void main(String[] args) {
		double x = 88, y = 3.5, z = -5.2;

		System.out.println("a) x + y + z = " + (x + y + z));
		System.out.println("b) 2 * y + 3 * (x - z) = " 
				+ (2 * y + 3 * (x - z)));
		System.out.println("c) x / y = " + (x / y));
		System.out.println("d) x % y = " + (x % y));
		System.out.println("e) x / (y + z) = " + (x / (y + z)));
		System.out.println("f) (x / y) + z = " + ((x / y) + z));
		System.out.println("g) 2 * x / 3 * y = " + (2 * x / 3 * y));
		System.out.println("h) 2 * x / (3 * y) = " + (2 * x / (3 * y)));
		System.out.println("i) x * y % z = " + (x * y % z));
		System.out.println("j) x * (y % z) = " + (x * (y % z)));
		System.out.println("k) 3 * x - z - 2 * x = "
				+ (3 * x - z - 2 * x));
		System.out.println("l) 2 * x / 5 % y) = " 
				+ (2 * x / 5 % y));
		System.out.println("m) x - 100 % y % z = " 
				+ (x - 100 % y % z));
		System.out.println("n) x - y - z * 2 = " + (x - y - z * 2));
	}
}
