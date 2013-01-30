package service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import entity.Need;

public class NeedsService extends GenericService {
	public List<Need> getNeedsByOrphanage(Integer orphId){
		EntityManager em = super.getEntityManager();
		Query q = em.createQuery("select n from Need n where n.orphanageId = ?1");
		q.setParameter(1,orphId);
		@SuppressWarnings("unchecked")
		List<Need> needsList = q.getResultList();
		return needsList;
		
	}
}
