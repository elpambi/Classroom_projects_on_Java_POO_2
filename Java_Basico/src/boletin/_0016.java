package boletin;

public class _0016 {
	public static void main(String[] args) {
		int numInicial = 1;
		int numFinal = 10;
		int cantidadNumeros = 10;

		for(int tablaDel = numInicial; tablaDel <= numFinal; tablaDel++){
		    for(int numeroLinea = 1; numeroLinea <= cantidadNumeros; numeroLinea++){
		        System.out.printf("%d x %d = %d%n", tablaDel, numeroLinea, tablaDel * numeroLinea);
		    }
		    System.out.println();
		}
	}
}
