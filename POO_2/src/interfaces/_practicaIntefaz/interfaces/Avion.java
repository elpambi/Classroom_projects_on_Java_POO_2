package interfaces._practicaIntefaz.interfaces;

public class Avion extends Vehiculo implements Volador {

	@Override
	public void planear() {
		System.out.println("Estoy volando con motores");
	}


}
