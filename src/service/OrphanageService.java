package service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entity.Orphanage;

public class OrphanageService extends GenericService {
	
	public static void main(String[] args){
		System.out.println("in getter");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
		EntityManager em = emf.createEntityManager();
		
		Query q = em.createQuery("SELECT orp FROM Orphanage orp", Orphanage.class);
		//Orphanage q = em.find(Orphanage.class);
		@SuppressWarnings("unchecked")
		List<Orphanage> orphanages = new ArrayList<Orphanage>(q.getResultList());
		for (Orphanage or:orphanages){
			System.out.println(or.getName());
		}
		if(orphanages.isEmpty()){System.out.println("list empty");}
		em.close();
		
	}
	
	public Orphanage getOrphanageById(Integer id){
		EntityManager em = super.getEntityManager();
		Orphanage or = em.find(Orphanage.class, id);
		return or;
	}
	
	public Orphanage getOrphanageByName(String name){
		EntityManager em = super.getEntityManager();
		//Orphanage or = em.find(Orphanage.class, name);
		
		Query q = em.createQuery("select orph from Orphanage orph where orph.name = ?1",Orphanage.class);
		q.setParameter(1,name);
		Orphanage or = (Orphanage) q.getSingleResult();
		return or;
	}
	
	public List<Orphanage> getOrphByLoc(Integer x){
		EntityManager em = super.getEntityManager();
		Query q = em.createQuery("select orph from Orphanage orph where orph.locationId = ?1",Orphanage.class);
		q.setParameter(1,x);
		@SuppressWarnings("unchecked")
		List<Orphanage> orphLoc = q.getResultList();
		return orphLoc;
	}
	
	public void addOrphanage(Orphanage orphanage){
		EntityManager em = super.getEntityManager();
		em.getTransaction().begin();
		em.persist(orphanage);
		em.getTransaction().commit();
		//em.flush();
		//em.close();
		//return new Orphanage
	}

	public void updateOrphanage(Orphanage orphanage){
		EntityManager em = super.getEntityManager();
		
		em.getTransaction().begin();
		em.persist(orphanage);
		em.getTransaction().commit();
		em.flush();
		em.close();
	}
		
	public List<Orphanage> getOrphanages(){
		System.out.println("in getter");
		EntityManager em = super.getEntityManager();
		
		Query q = em.createQuery("SELECT orp FROM Orphanage orp", Orphanage.class);
		//Orphanage q = em.find(Orphanage.class);
		@SuppressWarnings("unchecked")
		List<Orphanage> orphanages = new ArrayList<Orphanage>(q.getResultList());
		if(orphanages.isEmpty()){System.out.println("list empty");}
		//em.flush();
		//em.close();
		return orphanages;
	}
	
	public void deleteOrphanage(Orphanage orphanage){
		EntityManager em = super.getEntityManager();
		em.getTransaction().begin();
		em.remove(orphanage);
		em.getTransaction().commit();
		em.flush();
		em.close();
	}
	
}
