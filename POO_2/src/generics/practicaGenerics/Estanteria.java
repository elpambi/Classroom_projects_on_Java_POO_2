package generics.practicaGenerics;

import java.util.Arrays;

public class Estanteria <T> {
	private T[] estante;

	public Estanteria(T[] estante) {
		this.estante = estante;
	}

	public T[] getContenido() {
		return estante;
	}

	@Override
	public String toString() {
		return "Estanteria [estante=" + Arrays.toString(estante) + "]";
	}
	
	
	
	
}
