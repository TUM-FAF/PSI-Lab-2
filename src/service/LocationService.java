package service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import entity.Location;



public class LocationService extends GenericService{
	
	public EntityManager em;
		
	public List<Location> getLocations(){
		EntityManager em = super.getEntityManager();
		
		Query q = em.createQuery("SELECT lc FROM Location lc");
		List<Location> locations = new ArrayList<Location>(q.getResultList());
		return locations;
	}
	
}
