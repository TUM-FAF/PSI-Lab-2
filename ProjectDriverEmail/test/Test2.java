import static org.junit.Assert.*;

import org.junit.Test;

import feature1.connectToDB;
import feature2.EmailSend;


public class Test2 {

	@Test
	public void testSendEmail() throws Exception, Throwable {
		//fail("Not yet implemented");		
		EmailSend tester2 = new EmailSend();
	    assertEquals("Result", "Message send", tester2.SendEmail("costea.bostan@gmail.com", "432"));
	}
}
