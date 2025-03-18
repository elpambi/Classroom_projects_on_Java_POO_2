package arrayList.practica3CuentaAtras;
import java.util.ArrayList;



public class Frase2 {
	private ArrayList<String> palabras;

	public Frase2(String frase) {
        	palabras = new ArrayList<String>();
        	String[] arrayPalabras = frase.split(" ");
        	for(String palabra : arrayPalabras){
        		palabras.add(palabra);
        	}
    }

	public void addPalabra(String palabra) {
		palabras.add(palabra);

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
