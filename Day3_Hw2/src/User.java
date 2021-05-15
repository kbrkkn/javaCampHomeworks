
public class User {
	private int userId;
	private String userName;
	private String surName;
	private String email;

	public User(int userId, String userName, String surName, String email) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.surName = surName;
		this.email = email;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
