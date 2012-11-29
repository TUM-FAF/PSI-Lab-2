import static org.junit.Assert.*;

import org.junit.Test;

import feature1.connectToDB;
import feature3.Client;


public class Test3 {

	@Test
	public void testRun() {
		Client tester3 = new Client();
	    assertEquals("Result", "Connection successful", tester3.run("A simple message to server"));	
	}
}
