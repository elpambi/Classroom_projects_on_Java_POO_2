package lambdas.practicaLambda;

interface OpFromIntToInt {
	int calcula(int i);
}

interface OpFromIntToArrayInt{
	int calcula(int[] i);
}

@FunctionalInterface
interface OpEntran4EneterosSaleEntro{
	int dale(int i1, int i2, int i3, int i4);
}

public class Calculos {

	private int[] arrayDeEnteros = {3, 5, 9, 8, 1};
	
	public int cuadradoDeEsteNumero(int num) {
		int numAAlCuadrado = (num) * 2;
		return numAAlCuadrado;

	}

	public static void main(String[] args) {
		OpFromIntToInt cuadrado = s -> s * s;
        OpFromIntToInt doble = s -> s + s;
        OpEntran4EneterosSaleEntro polimonioVariable = (a, b ,c , x) -> a * x * x * x + b * x * x + c;
        
		System.out.println(cuadrado.calcula(10));
		System.out.println(doble.calcula(67));
		System.out.println(polimonioVariable.dale(4, 5, 6, 8));
		
	}

}
