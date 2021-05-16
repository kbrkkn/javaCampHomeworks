package eticaret;

import eticaret.business.abstracts.UserService;
import eticaret.business.concretes.UserManager;
import eticaret.core.GoogleManagerAdapter;
import eticaret.dataAccess.concretes.UserHibernateDao;
import eticaret.entity.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserService userService = new UserManager(new UserHibernateDao(),
				new User("Kubra", "Koken", "123456", "aaa@xxx."));
		userService.sendValidationEmail();
		userService.completeRegistration();

		UserService userService2 = new GoogleManagerAdapter(new UserHibernateDao(),
				new User("Fatma", "Koken", "123456", "fatma123@gmail.com"));
		userService2.sendValidationEmail();
		userService2.completeRegistration();
	}

}
