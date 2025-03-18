package interfaces._practicaIntefaz.interfaces;

public class Mosca extends Animal implements Volador {

	@Override
	public void planear() {
		System.out.println("Estoy volando con las alas");
	}

	@Override
	public String moverse(int tiempoSegundos) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
