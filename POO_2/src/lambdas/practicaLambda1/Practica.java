package lambdas.practicaLambda1;

@FunctionalInterface
interface MiInterfaceFuncional{
	boolean m(String s1, String s2);
}

@FunctionalInterface
interface InterfaceContieneParametro{
	boolean a(String s1, String s2);
}

@FunctionalInterface
interface InterfaceMenorde3{
	boolean a(String s1);
}

@FunctionalInterface
interface InterfaceEmpiezaPorA{
	boolean a(String s1);
}

@FunctionalInterface
interface InterfaceTerminaEnPunto{
	boolean a (String s1);
}

@FunctionalInterface
interface InterfaceEmpiezaPorCaracter{
	boolean a(String s1, char c1);
}


public class Practica {
	public static void main(String ... args){
		MiInterfaceFuncional cadenasIguales = (s1, s2) -> s1.equals(s2);
		cadenasIguales.m("hola", "Hola"); // Devuelve false
		
		InterfaceContieneParametro contieneParametro = (s1, s2) -> {
			if (s1.contains(s2)) {
				return true;
			}
			return false;
		};
		InterfaceMenorde3 menorDe3 = s1 -> {
			if (s1.length() == 3) {
				return true;
			}
			return false;
		};
		InterfaceEmpiezaPorA empiezaPorA = s1 -> {
			if (s1.contains("A") && s1.startsWith("A")) {
				return true;
			}
			return false;
		};
		InterfaceTerminaEnPunto terminaPorPunto = s1 -> {
			if (s1.endsWith(".")) {
				return true;
			}
			return false;
		};
		InterfaceEmpiezaPorCaracter empiezaPorCaracter = (s1, c1) -> {
			if (s1.charAt(0) == c1) {
				return true;
			}
			return false;
		};
		
		System.out.println(contieneParametro.a("Lorem ipsum dolore est", "est"));
		System.out.println(menorDe3.a("Lor"));
		System.out.println(empiezaPorA.a("Alto"));
		System.out.println(terminaPorPunto.a("Lorem"));
		System.out.println(empiezaPorCaracter.a("Ipsum", 'I'));
		
		
	}
}

