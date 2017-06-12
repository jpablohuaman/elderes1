package teamhalcon.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "maestro")
public class Maestro implements Serializable {
	
	private static final long serialVersionUID = -854530626840992392L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_MIEMBRO")
    private Integer id_miembro;
	@Column(name = "ID_MAESTRO")
    private Integer id_maestro;
	public Maestro(Integer id_miembro, Integer id_maestro) {
		super();
		this.id_miembro = id_miembro;
		this.id_maestro = id_maestro;
	}
	public Maestro() {
		super();
	}
	public Integer getId_miembro() {
		return id_miembro;
	}
	public void setId_miembro(Integer id_miembro) {
		this.id_miembro = id_miembro;
	}
	public Integer getId_maestro() {
		return id_maestro;
	}
	public void setId_maestro(Integer id_maestro) {
		this.id_maestro = id_maestro;
	}
	
}
