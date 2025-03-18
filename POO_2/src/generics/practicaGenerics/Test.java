package generics.practicaGenerics;

public class Test {
	public static void main(String[] args) {
		CajaParaTodo c1 = new CajaParaTodo(new Cat("Michi"));
		CajaParaTodo c2 = new CajaParaTodo("LoremIpsum");
		System.out.println(c1);
		System.out.println(c2);
		
		
		Caja<String> c10 = new Caja<String>("Lorem");
		System.out.println(c10.getContenido().toUpperCase());
		
		Caja<Cat> c11 = new Caja<>(new Cat("Misifu"));
		System.out.println(c11);
		
		Pareja<String, String> p1 = new Pareja<>("LoQUeSea", "IpsumDolore");
		System.out.println(p1);
		
		p1.getElemento1().toLowerCase();

		
		Estanteria<String> e2 = new Estanteria<String>(new String[]{"1", "22"});
		System.out.println(e2);
		
		
		// Crear arrays específicos para cada estantería
        String[] estante1 = {"Libro A", "Libro B", "Libro C"};
        String[] estante2 = {"Libro D", "Libro E", "Libro F"};
        String[] estante3 = {"Libro G", "Libro H", "Libro I"};

        // Crear las instancias de Estanteria
        Estanteria<String>[] e1 = new Estanteria[3];  // Array de Estanteria genérico
        e1[0] = new Estanteria<>(estante1);
        e1[1] = new Estanteria<>(estante2);
        e1[2] = new Estanteria<>(estante3);

        // Recorrer y mostrar el contenido de las estanterías
        for (Estanteria<String> estanteria : e1) {
            System.out.println(estanteria);
        }
		
	}
}
