package model;

public class Persona {
	private String nombre;
	private String apellido;
	private String calle;
	private String ciudad;
	private String fechanacimiento;
	private int codigopostal;
	private int telefono;

	public Persona(String nombre, String apellido, String calle, String ciudad, String fechanacimiento,
			int codigopostal, int telefono) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.calle = calle;
		this.ciudad = ciudad;
		this.fechanacimiento = fechanacimiento;
		this.codigopostal = codigopostal;
		this.telefono = telefono;
	}
	public Persona() {

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
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getFechanacimiento() {
		return fechanacimiento;
	}
	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}
	public int getCodigopostal() {
		return codigopostal;
	}
	public void setCodigopostal(int codigopostal) {
		this.codigopostal = codigopostal;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", calle=" + calle + ", ciudad=" + ciudad
				+ ", fechanacimiento=" + fechanacimiento + ", codigopostal=" + codigopostal + ", telefono=" + telefono
				+ "]";
	}
	public void add() {

	}
	public void edit() {

	}
	public void remove() {

	}

}
