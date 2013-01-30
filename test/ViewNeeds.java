package unitTest;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import entity.Need;

import service.NeedsService;
import junit.framework.TestCase;

public class ViewNeeds extends TestCase {
	private NeedsService ns = new NeedsService();
	private List<Need> list;
	
	@Test
	public void testNeeds(){
		Integer x = new Integer(1);
		list = ns.getNeedsByOrphanage(x);
		assertNotNull(list);
		
		for(Iterator<Need> iter = list.iterator(); iter.hasNext();){
			Need n = (Need) iter.next();
			assertEquals(n.getOrphanageId(), x);
		}
		
	}
}
