package unitTest;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;

import service.OrphanageService;

import entity.Orphanage;
//import static org.junit.Assert.assertEquals;

public class TestJUnit2 {
	Orphanage orphEntity = new Orphanage();
	OrphanageService orphService = new OrphanageService();
	List<Orphanage> list;
	
	@Test
	public void testAssertNotNull(){
		list = orphService.getOrphanages();
		assertNotNull(list);
	}
	
	
	@Test
	public void testOrphByLoc(){
		Integer x = new Integer(1);
		list = orphService.getOrphByLoc(x);
		assertNotNull(list);
		
		for(Iterator<Orphanage> iter = list.iterator(); iter.hasNext();){
			Orphanage or = (Orphanage) iter.next();
			assertEquals(x, or.getLocationId());
		}
	}
}
