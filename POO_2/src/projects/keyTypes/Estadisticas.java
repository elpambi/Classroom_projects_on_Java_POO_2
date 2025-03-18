package projects.keyTypes;

//Clase para calcular estadísticas
class Estadisticas {
 public void calcularEstadisticas(String original, String entrada, double tiempo) {
     int caracteresCorrectos = 0;
     int longitudMinima = Math.min(original.length(), entrada.length());
     
     for (int i = 0; i < longitudMinima; i++) {
         if (original.charAt(i) == entrada.charAt(i)) {
             caracteresCorrectos++;
         }
     }
     
     double precision = (double) caracteresCorrectos / original.length() * 100;
     double wpm = ((double) caracteresCorrectos / 5) / (tiempo / 60);

     System.out.printf("Precisión: %.2f%%\n", precision);
     System.out.printf("Velocidad: %.2f palabras por minuto (WPM)\n", wpm);
 }
}