package eticaret.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eticaret.business.abstracts.UserService;
import eticaret.dataAccess.abstracts.UserDao;
import eticaret.entity.concretes.User;

public class UserManager implements UserService {
	private UserDao userDao;
	private User user;

	public UserManager() {

	}

	public UserManager(UserDao userDao, User user) {
		super();
		this.userDao = userDao;
		this.user = user;

	}

	@Override
	public boolean checkPasswordLength(String password) {
		if (password.length() < 6) {
			System.out.println("Parola en az 6 karakter uzunlu�unda olmal�d�r");

			return false;

		}
		return true;
	}

	@Override
	public boolean validateEmailFormat(String email) {
		String regex = "^(.+)@(.+)(..)(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		if (!matcher.matches()) {
			System.out.println("E-posta alan� e-posta format�nda olmal�d�r");
			return false;
		}

		return true;
	}

	@Override
	public boolean checkIfEmailExists(String email) {
		if (userDao.checkIfEmailExists(email)) {
			System.out.println("E-Posta daha �nce kullan�lmam�� olmal�d�r.");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkNameLength(String name) {
		if (name.length() < 2) {
			System.out.println("Ad ve soyad en az iki karakterden olu�mal�d�r.");
			return false;

		}
		return true;
	}

	@Override
	public void sendValidationEmail() {
		if (checkPasswordLength(user.getPassword()) && validateEmailFormat(user.getEmail())
				&& checkIfEmailExists(user.getEmail()) && checkNameLength(user.getName())
				&& checkNameLength(user.getSurname())) {
			System.out.println("Do�rulama linki g�nderildi");

		} else {
			System.out.println("L�tfen girdi�iniz bilgileri kontrol edip,tekrar deneyiniz");
			return;

		}
	}

	@Override
	public void completeRegistration() {
		if (isClickedValidationLink()) {
			this.userDao.register(user);
		} else {
			System.out.println("Email do�rulanamad�");
		}
	}

	@Override
	public boolean isClickedValidationLink() {
		return false;
	}

}
