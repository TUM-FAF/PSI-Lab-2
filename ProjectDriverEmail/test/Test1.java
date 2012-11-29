import static org.junit.Assert.*;

import org.junit.Test;

import feature1.connectToDB;


public class Test1 {
	@Test
	public void testDB() {
		connectToDB tester = new connectToDB();
	    assertEquals("Result", "costea.bostan@gmail.com", tester.getEmail("CRNM778"));
	    
	    assertEquals("Result", "No record found", tester.getEmail("asdf"));
}
}
