package lambdas.practicaLambda2;

@FunctionalInterface
interface InterfazDeSumaDeArray{
	int a(int[] i);
}


public class Practica1 {
	public static void main(String[] args) {
		int[] ArrayDeEnteros = {3, 4 ,5 ,6};
		
		InterfazDeSumaDeArray sumaDeArrays = i -> {
			int sumatorio = 0;
			for (int j = 0; j < i.length; j++) {
				sumatorio = i[j] + i[j]; 
			}
			return sumatorio;
		};
		
		System.out.println(sumaDeArrays.a(ArrayDeEnteros));
	}
}
