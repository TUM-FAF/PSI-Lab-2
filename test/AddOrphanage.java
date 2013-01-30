package unitTest;


import entity.Orphanage;
import service.OrphanageService;
import junit.framework.TestCase;

public class AddOrphanage extends TestCase {
	OrphanageService os = new OrphanageService();

	public void testAddOrphanage(){
		Orphanage or = new Orphanage();
		or.setName("test Orphanage");
		or.setDetails("JUnit Test");
		or.setLocationId(new Integer(1));
		or.setAddress("Testing Ville");
		os.addOrphanage(or);
		Orphanage testRes = os.getOrphanageByName(or.getName());
		assertEquals(or,testRes);
	}

}
