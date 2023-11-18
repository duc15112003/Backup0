package Bai1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.eclipse.jdt.internal.compiler.apt.model.Factory;

public class JpaUtils {
	
	static EntityManagerFactory factory;
	
	public static EntityManager getEntityManager() {
		if(factory ==  null || !factory.isOpen()) {
			factory =Persistence.createEntityManagerFactory("PoLyOE");
		}
		return factory.createEntityManager();
	}
	public static void shutdown() {
		if(factory!=null && factory.isOpen()) {
			factory.close();
		}
		factory = null;
	}
}
