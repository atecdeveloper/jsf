package br.com.caelum.livraria.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("livraria");

	public EntityManager getEntityManager() {
		EntityManager em = null;
		try {
			em = emf.createEntityManager();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return em;
	}

	public void close(EntityManager em) {
		em.close();
	}
}
