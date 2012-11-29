package feature2;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;



public class EmailSend {

	public String SendEmail (String email, String Sum) throws Exception, Throwable
	{

		Properties props = new Properties();
		InputStream in = null;
		try {		
		     in = this.getClass().getResourceAsStream("mail.properties");		    		
		     props.load(in);
		} finally {
		     if (null != in) {
		         try {
		             in.close();
		         } catch (IOException ex) {}
		     }
		}
		
		final String username = props.getProperty("mail.login.user");
        final String password = props.getProperty("mail.login.password");
        
		Session session = Session.getInstance(props,
				new Authenticator(){
		      protected PasswordAuthentication getPasswordAuthentication()
		      {
		        return new PasswordAuthentication(username, password);
		      }}
		);						
		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("administrator"));
			message.setRecipients(Message.RecipientType.TO,
			InternetAddress.parse(email));
			message.setSubject("You've been amendet ");
			message.setText("The sum is: "+Sum);			
			Transport.send(message);
	        
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		
		
		}
		return "Message send";	
	}
		
	    public static void main(String[] args) throws Exception, Throwable {
		//EmailSend emailSend= new EmailSend();
		//String result=emailSend.SendEmail ("costea.bostan@gmail.com","123");
		//System.out.println(result);
	}
	
}
