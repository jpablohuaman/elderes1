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
public class User implements Serializable {

	private static final long serialVersionUID = -854530626840992392L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_MIEMBRO")
	private Integer userId;

	@Column(name = "NOMBRES")
	private String username;


	public User(Integer userId, String username) {
		this.userId = userId;
		this.username = username;
	}

	public User() {
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


}
