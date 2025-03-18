package projects.projGeo;

import java.util.*;


public class Examen {
    private ArrayList<String> paises = new ArrayList<>();
    private ArrayList<String> capitales = new ArrayList<>();
    private HashSet<Integer> preguntasRealizadas = new HashSet<>();
    private Random r = new Random();
    private Scanner input = new Scanner(System.in);
    private int putuacion = 0;
    

    public Examen() {
        // Añadir algunos ejemplos
        paises.add("España"); capitales.add("Madrid");
        paises.add("Francia"); capitales.add("París");
        paises.add("Italia"); capitales.add("Roma");
        paises.add("Alemania"); capitales.add("Berlín");
    }

    public void escogerPreguntas() {
        if (preguntasRealizadas.size() == paises.size()) {
            System.out.println("¡Has respondido todas las preguntas!");
            return;
        }

        int index;
        do {
            index = r.nextInt(paises.size()); // Seleccionar un índice aleatorio
        } while (preguntasRealizadas.contains(index));

        preguntasRealizadas.add(index); // Registrar la pregunta realizada

        int eleccionAleatoria = r.nextInt(1, 3);
        if (eleccionAleatoria == 1) {
            hacerPreguntaCapital(index);
        } else {
            hacerPreguntaPais(index);
        }
    }

    public void hacerPreguntaPais(int index) {
        System.out.println("¿Cuál es la capital de " + paises.get(index) + "?");
        String respuestaUsuario = input.nextLine();

        if (respuestaUsuario.equalsIgnoreCase(capitales.get(index))) {
            System.out.println("¡Correcto!");
            putuacion++;
        } else {
            System.out.println("Incorrecto. La respuesta correcta es: " + capitales.get(index));
        }
    }

    public void hacerPreguntaCapital(int index) {
        System.out.println("¿A qué país pertenece la capital " + capitales.get(index) + "?");
        String respuestaUsuario = input.nextLine();

        if (respuestaUsuario.equalsIgnoreCase(paises.get(index))) {
            System.out.println("¡Correcto!");
            putuacion++;
        } else {
            System.out.println("Incorrecto. La respuesta correcta es: " + paises.get(index));
        }
    }
    
    public void mostrarPuntuacion() {
        System.out.println("Tu puntuación final es: " + putuacion);
        if (putuacion == 4) {
			System.out.println("Maxima puntuacion!");
		}
    }

	
	public static void main(String[] args) {
		Examen e1 = new Examen();
		System.out.println("EXAMEN DE GEOGRAFIA AUTOMATICO");
		System.out.println("==============================");
		
		Examen examen = new Examen();
        for (int i = 0; i < 5; i++) { // Realiza 5 preguntas
            examen.escogerPreguntas();
        }
        examen.mostrarPuntuacion();
		
		
	}
	
	
}
