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
			System.out.println("Parola en az 6 karakter uzunluðunda olmalýdýr");

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
			System.out.println("E-posta alaný e-posta formatýnda olmalýdýr");
			return false;
		}

		return true;
	}

	@Override
	public boolean checkIfEmailExists(String email) {
		if (userDao.checkIfEmailExists(email)) {
			System.out.println("E-Posta daha önce kullanýlmamýþ olmalýdýr.");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkNameLength(String name) {
		if (name.length() < 2) {
			System.out.println("Ad ve soyad en az iki karakterden oluþmalýdýr.");
			return false;

		}
		return true;
	}

	@Override
	public void sendValidationEmail() {
		if (checkPasswordLength(user.getPassword()) && validateEmailFormat(user.getEmail())
				&& checkIfEmailExists(user.getEmail()) && checkNameLength(user.getName())
				&& checkNameLength(user.getSurname())) {
			System.out.println("Doðrulama linki gönderildi");

		} else {
			System.out.println("Lütfen girdiðiniz bilgileri kontrol edip,tekrar deneyiniz");
			return;

		}
	}

	@Override
	public void completeRegistration() {
		if (isClickedValidationLink()) {
			this.userDao.register(user);
		} else {
			System.out.println("Email doðrulanamadý");
		}
	}

	@Override
	public boolean isClickedValidationLink() {
		return false;
	}

}
