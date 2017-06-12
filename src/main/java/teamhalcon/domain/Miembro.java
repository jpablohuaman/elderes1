package teamhalcon.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "miembro")
public class Miembro implements Serializable {
	
	private static final long serialVersionUID = -854530626840992392L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_MIEMBRO")
  private Integer id_miembro;
	@Column(name = "NOMBRES")
  private String nombres;
	@Column(name = "TELEFONO")
  private String telefono;
	@Column(name = "DIRECCION")
  private String direccion;
	@Column(name = "FECHA_NACIMIENTO")
  private String fecha_nacimiento;
	@Column(name = "DISTRITO")
  private String distrito;
	@Column(name = "USER")
  private String user;
	@Column(name = "PASSWORD")
  private String password;
	@Column(name = "DISPONIBILIDAD")
  private String disponibilidad;
	@Column(name = "CORREO")
  private String correo;
	@Column(name = "ID_FAMILIA")
  private Integer id_familia;
	@Column(name = "TIPO_FAMILIAR")
  private String tipo_familiar;
  
  
public Miembro(Integer id_miembro, String nombres, String telefono, String direccion, String fecha_nacimiento,
		String distrito, String user, String password, String disponibilidad, String correo, Integer id_familia,
		String tipo_familiar) {
	super();
	this.id_miembro = id_miembro;
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


public Miembro() {
	super();
}


public Integer getId_miembro() {
	return id_miembro;
}
public void setId_miembro(Integer id_miembro) {
	this.id_miembro = id_miembro;
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
public Integer getId_familia() {
	return id_familia;
}
public void setId_familia(Integer id_familia) {
	this.id_familia = id_familia;
}
public String getTipo_familiar() {
	return tipo_familiar;
}
public void setTipo_familiar(String tipo_familiar) {
	this.tipo_familiar = tipo_familiar;
}
  
  
}