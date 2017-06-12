package teamhalcon.domain;


public class ViewCabezas {

  private Integer edad;
  private String nombres;
  private String telefono;
  private String direccion;
  private String fecha_nacimiento;
  private String distrito;
  private String user;
  private String password;
  private String disponibilidad;
  private String correo;
  private int id_familia;
  private String tipo_familiar;
public ViewCabezas(Integer edad, String nombres, String telefono, String direccion, String fecha_nacimiento,
		String distrito, String user, String password, String disponibilidad, String correo, int id_familia,
		String tipo_familiar) {
	super();
	this.edad = edad;
	this.nombres = nombres;
	this.telefono = telefono;
	this.direccion = direccion;
	this.fecha_nacimiento = fecha_nacimiento;
	this.distrito = distrito;
	this.user = user;
	this.password = password;
	this.disponibilidad = disponibilidad;
	this.correo = correo;
	this.id_familia = id_familia;
	this.tipo_familiar = tipo_familiar;
}

public Integer getEdad() {
	return edad;
}
public void setEdad(Integer edad) {
	this.edad = edad;
}
public String getNombres() {
	return nombres;
}
public void setNombres(String nombres) {
	this.nombres = nombres;
}
public String getTelefono() {
	return telefono;
}
public void setTelefono(String telefono) {
	this.telefono = telefono;
}
public String getDireccion() {
	return direccion;
}
public void setDireccion(String direccion) {
	this.direccion = direccion;
}
public String getFecha_nacimiento() {
	return fecha_nacimiento;
}
public void setFecha_nacimiento(String fecha_nacimiento) {
	this.fecha_nacimiento = fecha_nacimiento;
}
public String getDistrito() {
	return distrito;
}
public void setDistrito(String distrito) {
	this.distrito = distrito;
}
public String getUser() {
	return user;
}
public void setUser(String user) {
	this.user = user;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getDisponibilidad() {
	return disponibilidad;
}
public void setDisponibilidad(String disponibilidad) {
	this.disponibilidad = disponibilidad;
}
public String getCorreo() {
	return correo;
}
public void setCorreo(String correo) {
	this.correo = correo;
}
public int getId_familia() {
	return id_familia;
}
public void setId_familia(int id_familia) {
	this.id_familia = id_familia;
}
public String getTipo_familiar() {
	return tipo_familiar;
}
public void setTipo_familiar(String tipo_familiar) {
	this.tipo_familiar = tipo_familiar;
}
  
  
}
