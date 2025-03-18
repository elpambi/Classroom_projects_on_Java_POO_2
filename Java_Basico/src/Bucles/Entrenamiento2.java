package Bucles;

public class Entrenamiento2 {
	public static void main(String[] args) {
		// a 
		int r1 = 0;
		int ini = 50;
		int fin = 2500;
		int divisor = 13;
		for(int i = ini; i <= fin; i++) if (i % divisor == 0) r1++; 
		System.out.printf("a) Entre %d y %d hay %d números múltiplos de %d.%n", ini, fin, r1, divisor);

		// b
		String r2 = "   ";
		ini = 1935;
		fin = 1812;
		int step = 7;

		System.out.printf("b) La cuenta atrás de %d en %d desde %d a %d es:%n", step, step, ini, fin);
		for(int i = ini; i >= fin; i-=step) r2 = r2 + i + " "; 
		System.out.println(r2);

		// c
		ini = 10;
		fin = 20;
		long producto = 1; // por si el número se hace muy grande 

		if (ini % 2 == 0) ini++;
		for(int i = ini; i <= fin; i+=2) producto *= i; 

		System.out.printf("c) El producto de los números impares entre %d y %d es %d.%n", ini, fin, producto);


		// d
		ini = 70;
		fin = 800;
		int sum = 0;

		for(int i = ini; i <= fin; i++) sum += i; 

		System.out.printf("d) La suma de los números entre %d y %d es %d.%n", ini, fin, sum);        


		// e
		ini = 1;
		fin = 25;
		String letra = "A";
		sum = 0;
		int n = 25;
		String result = "";

		for(int i = ini; i <= fin; i++) result += letra; 
		System.out.printf("e) Esta es la cadena de texto %s%n", result);        
		System.out.printf("   y ha sido obtenida concatenando %d veces la %s.%n", n, letra);


		// f
		ini = 1;
		fin = 25;
		sum = 0;

		if (ini % 2 != 0) ini++;
		for(int i = ini; i <= fin; i++) sum += i * i; 
		System.out.printf("f) La suma de los cuadrados de los numeros pares entre %d y %d es %d.%n", ini, fin, sum); 


		// g
		ini = -10;
		fin = 20;
		sum = 0;

		if (ini % 2 != 0) ini++;
		for(int i = ini; i <= fin; i++) sum += i * i * i; 
		System.out.printf("g) La suma de los cubos de los numeros impares entre %d y %d es %d.%n", ini, fin, sum); 

		// h
		ini = (int)'a';
		fin = (int)'z';

		System.out.print("h) El abecedario inglés de letras minúsculas es:\n   ");         
		for(int i = ini; i <= fin; i++) System.out.print((char)i); 
		System.out.println();


		// i
		ini = (int)'A';
		fin = (int)'Z';

		System.out.print("i) El abecedario inglés de letras mayúsculas es:\n   ");         
		for(int i = ini; i <= fin; i++) System.out.print((char)i);  
		System.out.println();

		// j
		ini = (int)'a';
		fin = (int)'z';
		step = 3;

		System.out.printf("j) El abecedario inglés de letras minúsculas de %d en %d letras es:%n   ", step, step);         
		for(int i = ini; i <= fin; i+=step) System.out.print((char)i); 
		System.out.println();

		// k
		ini = (int)'z';
		fin = (int)'a';

		System.out.print("k) El abecedario inglés de letras minúsculas alrevés es:\n   ");         
		for(int i = ini; i >= fin; i--) System.out.print((char)i); 
		System.out.println();        

		// l
		ini = (int)'A';
		fin = (int)'Z';
		boolean esMayuscula = true;

		System.out.print("l) El abecedario inglés alternando mayúsculas y minúsculas es:\n   ");         
		for(int i = ini; i <= fin; i++){
		    if(esMayuscula)  
		        System.out.print((char)i);
		    else 
		        System.out.print((char)(i+32));
		    esMayuscula = !esMayuscula;
		}
		System.out.println();
	}
}
