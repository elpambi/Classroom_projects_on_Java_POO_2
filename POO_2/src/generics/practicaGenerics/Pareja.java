package generics.practicaGenerics;

public class Pareja <S, T> {
	private S elemento1;
	private T elemento2;
	
	
	public Pareja(S elemento1, T elemento2) {
		this.elemento1 = elemento1;
		this.elemento2 = elemento2;
	}


	@Override
	public String toString() {
		return "Pareja [" + elemento1 + " ," + elemento2 + "]";
	}


	public S getElemento1() {
		return elemento1;
	}


	public T getElemento2() {
		return elemento2;
	}
	
	
	
	
	
	
}
