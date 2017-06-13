package teamhalcon.bo;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import teamhalcon.dao.UserDAO;
import teamhalcon.domain.Maestro;
import teamhalcon.domain.Miembro;
import teamhalcon.domain.MiembroFamiliar;
import teamhalcon.domain.User;
import teamhalcon.domain.ViewCabezas;

@Service
@Transactional
public class UserBO {

	private UserDAO userDAO;

	@Autowired
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public List<User> getUserList() {
		return this.userDAO.getUserList();
	}

	public void createUser(User user) {
		this.userDAO.createUser(user);
	}

	public User getUserByName(String username) {
		return this.userDAO.getUserByName(username);
	}

	public User getUserById(int userId) {
		return this.userDAO.getUserById(userId);
	}

	public List<ViewCabezas> getCabezasFamilias(String usuario, String pass) {
		return this.userDAO.getCabezasFamilias(usuario, pass);
		
	}
	public List<Miembro> getMiembrosSacerdocio(String usuario, String pass){
		return this.userDAO.getMiembrosSacerdocio(usuario, pass);	
	}
	
	public List<MiembroFamiliar> getMiembrosFamiliares(String usuario, String pass){
		return this.userDAO.getMiembrosFamiliares(usuario, pass);	
	}

	public List<Miembro> getMiembroList(){
		return this.userDAO.getMiembroList();
	}
	
	public List<Maestro> getMaestroList() {
		return this.userDAO.getMaestroList();
	}
	
	public List<MiembroFamiliar> getMiembroFamiliarList() {
		return this.userDAO.getMiembroFamiliarList();
	}

}
