package model;

public class Persona {
	private String nombre;
	private int telefono;

	public void Persona(){
	}
	public String getNombre() {
	return nombre;
	}
	public void setNombre(String nombre) {
	this.nombre = nombre;
	}
	public int getTelefono() {
	return telefono;
	}
	public void setTelefono(int telefono) {
	this.telefono = telefono;
	}
	public String toString() {
	return this.getNombre() + ", " + this.getTelefono();
	}
}
