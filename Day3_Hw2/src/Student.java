
public class Student extends User {
	private String schoolName;
	private boolean graduateStatus;

	public Student(int userId, String userName, String surName, String email, String schoolName,
			boolean graduateStatus) {
		super(userId, userName, surName, email);
		this.schoolName = schoolName;
		this.graduateStatus = graduateStatus;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public boolean isGraduateStatus() {
		return graduateStatus;
	}

	public void setGraduateStatus(boolean graduateStatus) {
		this.graduateStatus = graduateStatus;
	}

}
