package eticaret.dataAccess.concretes;

import eticaret.dataAccess.abstracts.UserDao;
import eticaret.entity.concretes.User;

public class UserHibernateDao implements UserDao{

	@Override
	public void register(User userInfo) {
		System.out.println("kaydedildi");
	}

	@Override
	public boolean checkIfEmailExists(String email) {
		return false;
	}


}
