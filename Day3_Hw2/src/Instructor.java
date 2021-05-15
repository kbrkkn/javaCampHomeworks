
public class Instructor extends User {
	private String courseName;

	public Instructor(int userId, String userName, String surName, String email, String courseName) {
		super(userId, userName, surName, email);
		this.courseName = courseName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

}
