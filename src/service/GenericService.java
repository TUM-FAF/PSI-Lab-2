package service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GenericService {
	protected EntityManager em;
	public EntityManager getEntityManager(){
		if(em == null || !em.isOpen()){
			System.out.println("generic service");
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
			em = emf.createEntityManager();
		}
		return em;
	}
}
