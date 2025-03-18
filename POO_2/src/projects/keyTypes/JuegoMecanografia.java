package projects.keyTypes;

import java.util.Scanner;

// Clase principal que maneja el juego
public class JuegoMecanografia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GeneradorTexto generador = new GeneradorTexto();
        Estadisticas estadisticas = new Estadisticas();

        String texto = generador.obtenerTexto();
        System.out.println("Escribe el siguiente texto lo más rápido posible:");
        System.out.println(texto);

        long inicio = System.nanoTime();
        String entradaUsuario = scanner.nextLine();
        long fin = System.nanoTime();

        double tiempoSegundos = (fin - inicio) / 1_000_000_000.0;
        estadisticas.calcularEstadisticas(texto, entradaUsuario, tiempoSegundos);
        
        scanner.close();
    }
}