package teamhalcon.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "familiar_hogar")
public class MiembroFamiliar implements Serializable {
	
	private static final long serialVersionUID = -854530626840992392L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_FAMILIAR")
  private Integer id_familiar;
	@Column(name = "NOMBRES")
  private String nombres;
	@Column(name = "FECHA_NACIMIENTO")
  private String fecha_nacimiento;
	@Column(name = "TIPO_FAMILIAR")
  private String tipo_familiar;
	@Column(name = "ES_MIEMBRO")
	  private String es_miembro;
	@Column(name = "ID_FAMILIA")
	  private Integer id_familia;
	@Column(name = "FECHA_EDICION")
	  private String fecha_edicion;
		@Column(name = "USUARIO_EDICION")
	  private String usuario_edicion;
	
	public MiembroFamiliar(Integer id_familiar, String nombres, String fecha_nacimiento, String tipo_familiar,
			String es_miembro, Integer id_familia,
			String fecha_edicion,String usuario_edicion) {
		super();
		this.id_familiar = id_familiar;
		this.nombres = nombres;
		this.fecha_nacimiento = fecha_nacimiento;
		this.tipo_familiar = tipo_familiar;
		this.es_miembro = es_miembro;
		this.id_familia = id_familia;
		this.fecha_edicion = fecha_edicion;
		this.usuario_edicion = usuario_edicion;
	}
	
	
	public MiembroFamiliar() {
		super();
	}


	public Integer getId_familiar() {
		return id_familiar;
	}
	public void setId_familiar(Integer id_familiar) {
		this.id_familiar = id_familiar;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public String getTipo_familiar() {
		return tipo_familiar;
	}
	public void setTipo_familiar(String tipo_familiar) {
		this.tipo_familiar = tipo_familiar;
	}
	public String getEs_miembro() {
		return es_miembro;
	}
	public void setEs_miembro(String es_miembro) {
		this.es_miembro = es_miembro;
	}
	public Integer getId_familia() {
		return id_familia;
	}
	public void setId_familia(Integer id_familia) {
		this.id_familia = id_familia;
	}
	public String getFecha_edicion() {
		return fecha_edicion;
	}


	public void setFecha_edicion(String fecha_edicion) {
		this.fecha_edicion = fecha_edicion;
	}


	public String getUsuario_edicion() {
		return usuario_edicion;
	}


	public void setUsuario_edicion(String usuario_edicion) {
		this.usuario_edicion = usuario_edicion;
	}
	
}
