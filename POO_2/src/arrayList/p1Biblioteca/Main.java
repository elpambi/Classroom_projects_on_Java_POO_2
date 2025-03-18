package arrayList.p1Biblioteca;

public class Main {
	public static void main(String[] args) {
		Biblioteca b = new Biblioteca();

        // Crear libros
        Libro l1 = new Libro("El Quijote", "Miguel de Cervantes", 1605);
        Libro l2 = new Libro("1984", "George Orwell", 1949);

        // Añadir libros a la biblioteca
        b.agregarLibro(l1);
        b.agregarLibro(l2);

        // Mostrar contenido de la biblioteca
        System.out.println(b);
	}
}
