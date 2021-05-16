package eticaret.core;

import jGoogle.GoogleManager;
import eticaret.dataAccess.abstracts.UserDao;
import eticaret.entity.concretes.User;

public class GoogleManagerAdapter implements GoogleService {

	private UserDao userDao;
	private User user;
	GoogleManager googleService = new GoogleManager();

	public GoogleManagerAdapter() {

	}

	public GoogleManagerAdapter(UserDao userDao, User user) {
		super();
		this.userDao = userDao;
		this.user = user;

	}

	@Override
	public boolean checkPasswordLength(String password) {
		return googleService.checkPasswordLength(password);
	}

	@Override
	public boolean validateEmailFormat(String email) {
		return googleService.validateEmailFormat(email);
	}

	@Override
	public boolean checkIfEmailExists(String email) {
		return googleService.checkIfEmailExists(email);

	}

	@Override
	public boolean checkNameLength(String name) {
		return googleService.checkNameLength(name);

	}

	@Override
	public void sendValidationEmail() {
		googleService.sendValidationEmail();

	}

	@Override
	public void completeRegistration() {
		googleService.completeRegistration();

	}

	@Override
	public boolean isClickedValidationLink() {
		return googleService.isClickedValidationLink();
	}

}
