package service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;


import entity.User;


public class UserService extends GenericService {
	
	 public void addUser(User user){
		 EntityManager em = super.getEntityManager();
		 em.getTransaction().begin();
		 em.persist(user);
		 em.getTransaction().commit();
		 //em.close();
	 }
	 
	 public List<User> getUsers(){
		 EntityManager em = super.getEntityManager();
		 
		 Query q = em.createQuery("SELECT u FROM User u");
		 @SuppressWarnings("unchecked")
		List<User> users = q.getResultList();
		 return users;
	 }
	 
	 public User getUserByEmail(String email){
		 EntityManager em = super.getEntityManager();
		 Query q = em.createQuery("select u from User u where u.email = ?1", User.class);
		 q.setParameter(1,email);
		 
		 User u = (User) q.getSingleResult();
		 return u;
	 }

}
