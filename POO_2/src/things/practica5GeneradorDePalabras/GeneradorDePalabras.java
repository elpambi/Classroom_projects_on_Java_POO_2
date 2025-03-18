package things.practica5GeneradorDePalabras;
import java.util.ArrayList;
import java.util.Random;
public class GeneradorDePalabras {
	
	    private ArrayList<String> palabras;
	    private ArrayList<String> filtradas;
	    private static final String ALFABETO = "abcdefghijklmnopqrstuvwxyz";

	    public void GeneradorPalabras() {
	        palabras = new ArrayList<>();
	        filtradas = new ArrayList<>();
	    }

	    public void generarPalabras(int cantidad) {
	        Random rand = new Random();
	            StringBuilder palabra = new StringBuilder();
	            for (int j = 0; j < 4; j++) {
	                palabra.append(ALFABETO.charAt(rand.nextInt(ALFABETO.length())));
	            }
	            palabras.add(palabra.toString());
	        }
	    

	    public void filtrarPalabras() {
	        for (String palabra : palabras) {
	            if (palabra.endsWith("a") || palabra.endsWith("c")) {
	                filtradas.add(palabra);
	            }
	        }
	    }

	    public void mostrarFiltradas() {
	        System.out.println("Palabras filtradas: " + filtradas);
	        System.out.println("Cantidad: " + filtradas.size());
	    }

	    public static void main(String[] args) {
	        
	    }
	}


