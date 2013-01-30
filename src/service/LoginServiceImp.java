package service;

import entity.User;
import entity.UserDaoInt;

public class LoginServiceImp implements LoginServiceInt {
	private UserDaoInt userDao;
	
	public void setUserDao(UserDaoInt uD){
		this.userDao = uD;
	}
	
		public boolean login(String user, String pass){
			boolean valid = false;
			try {
				User result = userDao.loadByUserAndPass(user, pass);
				if (result != null) {
					valid = true;
				}
			} catch(Exception e){}		
			return valid;
		}

}
