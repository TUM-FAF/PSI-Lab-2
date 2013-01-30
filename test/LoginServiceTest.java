package unitTest;

import entity.User;
import entity.UserDaoInt;
import service.LoginServiceImp;
import junit.framework.TestCase;
import static org.easymock.EasyMock.createStrictMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;

public class LoginServiceTest extends TestCase {
	private LoginServiceImp service;
	private UserDaoInt mockDao;
	
	@Override
	public void setUp(){
		service = new LoginServiceImp();
		mockDao = createStrictMock(UserDaoInt.class);
		service.setUserDao(mockDao);
	}
	
	public void testLogin(){
		User result = new User();
		String user = "testUser";
		String pass = "testPass";
		expect(mockDao.loadByUserAndPass(user, pass)).andReturn(result);
		replay(mockDao);
		assertTrue(service.login(user, pass));
		verify(mockDao);
	}

}
