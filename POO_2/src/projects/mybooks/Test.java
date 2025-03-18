package projects.mybooks;

public class Test {
	public static void main(String[] args) {
		Libro l1 = new Libro("Meditaciones", "Marco Aurelio", 167, 1, false, 20.99);
		
		l1.show();
		Libro l2 = new Libro("Sobre la Ira", "Seneca", 120, 1, false, 15.99);
		l2.show();
		
		Revista r1 = new Revista("Lorem", 30, 1, false, 1.99);
		r1.show();
		
		Libro.showStatic(l1);
		l1.leePagina(true);
		
		
	}
}
