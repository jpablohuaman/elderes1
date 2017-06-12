package teamhalcon.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import teamhalcon.domain.Miembro;
import teamhalcon.domain.MiembroFamiliar;
import teamhalcon.domain.User;
import teamhalcon.domain.ViewCabezas;

@Repository
@Transactional(readOnly = true)
public class UserDAO {

	private SessionFactory sessionFactory;

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public SessionFactory getSessionFactory() {
		return this.sessionFactory;
	}

	public List<User> getUserList() {
		//query by object type User
		Criteria criteria = this.getSessionFactory().getCurrentSession()
				.createCriteria(User.class);
		@SuppressWarnings("unchecked")
		List<User> userList = criteria.list();
		return userList;
	}

	@Transactional(readOnly = false)
	public void createUser(User user) {
		this.sessionFactory.getCurrentSession().save(user);
	}

	public User getUserByName(String username) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(
				User.class);
		//search by field username
		criteria.add(Restrictions.eq("username", username));
		//return unique result
		User user = (User) criteria.uniqueResult();
		return user;
	}

	public User getUserById(int userId) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(
				User.class);
		criteria.add(Restrictions.eq("userId", userId));
		User user = (User) criteria.uniqueResult();
		return user;
	}
	
	public List<ViewCabezas> getCabezasFamilias(String usuario, String pass) {
		String hql = "SELECT new teamhalcon.domain.ViewCabezas(floor(DATEDIFF(now(),m.fecha_nacimiento)/365),m.nombres,m.telefono,m.direccion,m.fecha_nacimiento,m.distrito,m.user,m.password,m.disponibilidad,m.correo,m.id_familia,m.tipo_familiar) FROM Miembro m,Maestro ma "
				+"WHERE floor(DATEDIFF(now(),m.fecha_nacimiento)/365) IN (SELECT MAX(floor(DATEDIFF(now(),mi.fecha_nacimiento)/365)) FROM Miembro mi,Maestro ma "
+"where ma.id_miembro=mi.id_miembro and ma.id_maestro=(select id_miembro from Miembro mie where mie.user='"+usuario+"' "
+"and mie.password='"+pass+"') "
+"GROUP BY id_familia) and m.id_miembro=ma.id_miembro and ma.id_maestro=(select id_miembro from Miembro mie where mie.user='"+usuario+"' "
+"and mie.password='"+pass+"') "
+"GROUP BY id_familia";  		
		
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		List<ViewCabezas> listVenta = (List<ViewCabezas>) query.list();
		
		if (listVenta != null && !listVenta .isEmpty()) {
			return listVenta;
		}
		return null;
	}
	
	public List<Miembro> getMiembrosSacerdocio(String usuario, String pass){
		String hql = "SELECT m2 from Miembro m1,Miembro m2 where m1.id_miembro=(SELECT mie.id_miembro from Miembro mie where mie.user='"+usuario+"' and mie.password='"+pass+"') and m2.id_familia=m1.id_familia"; 		
		
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		List<Miembro> listVenta = (List<Miembro>) query.list();
		
		if (listVenta != null && !listVenta .isEmpty()) {
			return listVenta;
		}
		return null;
	}

	public List<MiembroFamiliar> getMiembrosFamiliares(String usuario, String pass){
		String hql = "SELECT m2 from Miembro m1,MiembroFamiliar m2 where m1.id_miembro=(SELECT mie.id_miembro from Miembro mie where mie.user='"+usuario+"' and mie.password='"+pass+"') and m2.id_familia=m1.id_familia"; 		
		
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		List<MiembroFamiliar> listVenta = (List<MiembroFamiliar>) query.list();
		
		if (listVenta != null && !listVenta .isEmpty()) {
			return listVenta;
		}
		return null;
	}
}
