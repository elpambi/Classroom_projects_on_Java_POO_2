package interfaces._practicaIntefaz.interfaces;

public abstract class Animal extends Object implements Desplazable{
	public void respirar() {
		System.out.println(getClass().getSimpleName() +  " Respirando..");
	}
}
