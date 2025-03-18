package things.practica5GeneradorDePalabras;
import java.util.ArrayList;

public class NumerosPares {
    private ArrayList<Integer> pares;

    public NumerosPares() {
        pares = new ArrayList<>();
    }

    public void generarPares(int n) {
        for (int i = 0; i < n; i++) {
            pares.add(i * 2);
        }
    }

    public void mostrarPares() {
        System.out.println("Números pares: " + pares);
    }

    public static void main(String[] args) {
        NumerosPares np = new NumerosPares();
        np.generarPares(10);
        np.mostrarPares();
    }
}
