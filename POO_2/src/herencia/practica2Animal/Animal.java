package herencia.practica2Animal;

public abstract class Animal {
	private String nombre;
	private String especie;
	private boolean estado;
	private boolean estaCansado;
	
	
	public abstract void comer();
	public abstract void dormir();
	
	
	public Animal(String nombre, String especie, boolean estado, boolean estaCansado) {
		super();
		this.nombre = nombre;
		this.especie = especie;
		this.estado = estado;
		this.estaCansado = estaCansado;
	}
	
	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", especie=" + especie + ", estado=" + estado + ", estaCansado="
				+ estaCansado + "]";
	}
	
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public boolean isEstaCansado() {
		return estaCansado;
	}
	public void setEstaCansado(boolean estaCansado) {
		this.estaCansado = estaCansado;
	}
	
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	
	
	
	
}
