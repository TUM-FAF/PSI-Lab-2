package entity;

public interface UserDaoInt {
	User loadByUserAndPass(String user, String pass);
}
