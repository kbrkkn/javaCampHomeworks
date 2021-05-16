package eticaret.business.abstracts;

public interface UserService {
public boolean checkPasswordLength(String password);
public boolean validateEmailFormat(String email);
public boolean checkIfEmailExists(String email);
public boolean checkNameLength(String name);
public void sendValidationEmail();
public void completeRegistration();
public boolean isClickedValidationLink();
}
