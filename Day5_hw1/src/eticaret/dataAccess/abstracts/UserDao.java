package eticaret.dataAccess.abstracts;

import eticaret.entity.concretes.User;

public interface UserDao {
	public void register(User userInfo);
	public boolean checkIfEmailExists(String email);
}
