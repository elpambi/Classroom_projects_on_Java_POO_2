package operadoresLogicos3;

public class OperadoresLogicas {
	public static void main(String[] args) {
		System.out.println("Tabla de verdad de and");
		System.out.println("======================");
		System.out.println("true && true => " + (true && true));
		System.out.println("true && false => " + (true && false));
		System.out.println("false && true => " + (false && true));
		System.out.println("false && false => " + (false && false));

		System.out.println("\nTabla de verdad de or");
		System.out.println("=====================");
		System.out.println("true || true => " + (true || true));
		System.out.println("true || false => " + (true || false));
		System.out.println("false || true => " + (false || true));
		System.out.println("false || false => " + (false || false));        

		System.out.println("\nTabla de verdad de not");
		System.out.println("======================");
		System.out.println("!true => " + (!true));
		System.out.println("!false => " + (!false));
	}
}
