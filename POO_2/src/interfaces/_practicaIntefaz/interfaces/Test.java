package interfaces._practicaIntefaz.interfaces;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		Mosca m = new Mosca();
		
		Animal aM = new Mosca();
		Perro p = new Perro();
		Animal ap = new Perro();
		
		ArrayList<Animal> ArrAni = new ArrayList<>();
		ArrAni.add(ap);
		ArrAni.add(aM);
		ArrAni.add(p);
		ArrAni.add(m);
		
		System.out.println(ArrAni);
		Mosca m1 = new Mosca();
		Avion a1 = new Avion();
		Volador mv1 = new Mosca();
		Volador av1 = new Avion();
		
		Volador[] voladores = {mv1, av1, a1, m1};
		
		mv1.planear();
		m1.respirar();
		for (Volador volador : voladores) {
			if (volador instanceof Animal) {
				((Animal)volador).respirar();
			}
			volador.planear();
		}
		
		
		
	}
}
