package generics.practicaGenerics;

public class CajaParaTodo {
	private Object todo;	
	
	public CajaParaTodo(Object todo) {
		this.todo = todo;
	}




	@Override
	public String toString() {
		return "CajaParaTodo [todo=" + todo + "]";
	}

	public Object getTodo() {
		return todo;
	}
	
	
	
	
	
}
