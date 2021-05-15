package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
public class Users {

	@Id
	@GeneratedValue
	@Column(name = "UserId")
	private int userId;

	@Column(name = "Email")
	private String email;

	@Column(name = "Password")
	private String password;

	@Column(name = "PasswordRetry")
	private String passwordRetry;

	@Column(name = "EmailValidation")
	private boolean emailValidation;

	public Users() {
		
	}
	public Users(int userId, String email, String password, String passwordRetry, boolean emailValidation) {
		super();
		this.userId = userId;
		this.email = email;
		this.password = password;
		this.passwordRetry = passwordRetry;
		this.emailValidation = emailValidation;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordRetry() {
		return passwordRetry;
	}

	public void setPasswordRetry(String passwordRetry) {
		this.passwordRetry = passwordRetry;
	}

	public boolean isEmailValidation() {
		return emailValidation;
	}

	public void setEmailValidation(boolean emailValidation) {
		this.emailValidation = emailValidation;
	}

}
