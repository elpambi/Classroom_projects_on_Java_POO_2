package arrayList.practica3CuentaAtras;

import java.util.Arrays;

public class Frase {
	private String[] palabras;
	
    public Frase(String frase) {
        	palabras = frase.split(" ");
    }

    public void addPalabra(String palabra) {
        String[] nuevoArray = new String[palabra.length() + 1];
        String[] arrayViejo = palabras;
        for (int i = 0; i < arrayViejo.length; i++) {
			nuevoArray[i] = arrayViejo[i];
		}
        nuevoArray[nuevoArray.length -1] = palabra;
        palabras = nuevoArray;
        
    }
    
    

    @Override
	public String toString() {
    	String resultado = "";
		for (String palabra : palabras) {
			resultado = resultado + palabra + " ";
		}
		return resultado;
		
	}

	public static void main(String[] args) {
      Frase f1 = new Frase("Hola soy yo");
      f1.addPalabra("Pablo");
      System.out.println(f1);
    }
	
	
	

}
