package arrayList.practica3CuentaAtras;

import java.util.Arrays;

public class CuentaAtras {
	private int[] valores; 

	public CuentaAtras(int numeroInicial, int numeroFinal) {
		if (numeroInicial >= numeroFinal) { 
			System.out.println("El número inicial debe ser menor que el número final.");
			valores = new int[0];
		} else {
			int tamano = numeroFinal - numeroInicial + 1;
			valores = new int[tamano];
			for (int i = 0; i < tamano; i++) {
				valores[i] = numeroInicial + i;
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder resultado = new StringBuilder("[");
		for (int i = 0; i < valores.length; i++) {
			resultado.append(valores[i]);
			if (i < valores.length - 1) {
				resultado.append(" ...");
			}
		}
		resultado.append("]");
		return resultado.toString();
	}

	public void quitaUno() {
		if (valores.length > 0) {
			valores = Arrays.copyOf(valores, valores.length - 1); 
		} else {
			System.out.println("No quedan elementos en la cuenta atrás.");
		}
	}

	public static void main(String[] args) {
		CuentaAtras c1 = new CuentaAtras(5, 10);
		System.out.println(c1);

	}
}
