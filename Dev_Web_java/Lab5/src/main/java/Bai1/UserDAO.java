package Bai1;

import java.util.List;

import javax.management.RuntimeErrorException;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;



public class UserDAO {
	EntityManager em = JpaUtils.getEntityManager();
	
	public User create(User entity) {
		try {
			em.getTransaction().begin();
			em.persist(entity);
			em.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			em.getTransaction().rollback();
			throw new RuntimeException(e);
		}
		 return entity;
	}
	public User update(User entity) {
		try {
			em.getTransaction().begin();
			em.merge(entity);
			em.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			em.getTransaction().rollback();
			throw new RuntimeException(e);
		}
		 return entity;
	}
	public User delete(String id) {
		User entity = this.FindByID(id);
		try {
			em.getTransaction().begin();
			em.remove(entity);
			em.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			em.getTransaction().rollback();
			throw new RuntimeException(e);
		}
		 return entity;
	}
	public User FindByID(String id) {
		User entity = em.find(User.class, id);
		 return entity;
	}
	public List<User> findAll(){
		String query = "select * from taikhoan";
		TypedQuery<User> qr = em.createQuery(query,User.class);
		List<User> list = qr.getResultList();
		return list;
	}
}
