package generics.practicaGenerics2;

public class Box <T> {
	private T contenido;
	
	public Box(T contenido) {
		this.contenido = contenido;
	}

	
	public static <T> Box of (T contenido) {
		
		return new Box<>(contenido);
	}
	
	
	public static void main(String[] args) {
		Box<String> b1 = Box.of("String");
		
	}
	
	//public static Box<T> empty() {
	//}
	
	/*public boolean isPresent() {
		if (Box<T> == null) {
			return false;
		}
		return true;
	}
	*/
	
	
	
}
