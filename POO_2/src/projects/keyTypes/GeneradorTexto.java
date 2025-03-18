package projects.keyTypes;

import java.util.Random;

//Clase para generar textos aleatorios
class GeneradorTexto {
 private String[] frases = {
     "El rápido zorro marrón salta sobre el perro perezoso.",
     "Java es un lenguaje de programación versátil y potente.",
     "La mecanografía mejora la velocidad y precisión al escribir."
 };

 public String obtenerTexto() {
     Random random = new Random();
     return frases[random.nextInt(frases.length)];
 }
}