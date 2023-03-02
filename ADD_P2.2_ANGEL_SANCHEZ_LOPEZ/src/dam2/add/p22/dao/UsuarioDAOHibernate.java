package dam2.add.p22.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import dam2.add.p22.hibernate.HibernateManager;
import dam2.add.p22.interfaces.iUsuarioDAO;
import dam2.add.p22.model.Usuario;

public class UsuarioDAOHibernate implements iUsuarioDAO{
	public int crearUsuario(Usuario obj) {
		Session session = HibernateManager.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Integer id = (Integer)session.save(obj);
		tx.commit();
		session.close();
		return id;
	}

	public void modificarUsuario(int id,Usuario obj) {
		Session session = HibernateManager.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.update(obj);
		tx.commit();
		session.close();
	}

	public Usuario obtener(int id) {
		Session session = HibernateManager.getSessionFactory().openSession();
		Usuario obj = (Usuario)session.get(Usuario.class, id);
		session.close();
		return obj;
	}
	
	public void eliminar(int id) {
		Session session = HibernateManager.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Usuario obj = obtener(id);
		session.delete(obj);
		tx.commit();
		session.close();
	}

	public ArrayList<Usuario> obtenerTodos(String query) {
		if(query.equals("")) {
			query = "FROM Usuario";
		}
		Session session = HibernateManager.getSessionFactory().openSession();
		ArrayList<Usuario> objs = null;
		try {
			objs = (ArrayList<Usuario>)session.createQuery(query).list();
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		return objs;
	}

	public ArrayList<Usuario> obtenerTodosSinAdmin(String query) {
		if(query.equals("")) {
			query = "FROM Usuario WHERE rol_admin = 0";
		}
		Session session = HibernateManager.getSessionFactory().openSession();
		ArrayList<Usuario> objs = null;
		try {
			objs = (ArrayList<Usuario>)session.createQuery(query).list();
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		return objs;
	}

}
