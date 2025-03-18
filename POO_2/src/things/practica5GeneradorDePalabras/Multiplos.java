package things.practica5GeneradorDePalabras;
import java.util.ArrayList;
public class Multiplos {
	    private ArrayList<Integer> multiplos;

	    public Multiplos() {
	        multiplos = new ArrayList<>();
	    }

	    public void generarMultiplos(int n, int m, int p) {
	        int count = 0;
	        int num = p;
	        while (count < n) {
	            if (num % m == 0) {
	                multiplos.add(num);
	                count++;
	            }
	            num++;
	        }
	    }

	    public void mostrarMultiplos() {
	        System.out.println("Múltiplos: " + multiplos);
	    }

	    public static void main(String[] args) {
	        Multiplos m = new Multiplos();
	        m.generarMultiplos(10, 3, 5);
	        m.mostrarMultiplos();
	    }
	}

