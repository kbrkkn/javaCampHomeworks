public class Course {
	public int courseId;
	public String courseName;
	public String instructor;
	public double completionRate;
	public Course(int courseId, String courseName, String instructor, double completionRate) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.instructor = instructor;
		this.completionRate = completionRate;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	public double getCompletionRate() {
		return completionRate;
	}

	public void setCompletionRate(double completionRate) {
		this.completionRate = completionRate;
	}

}
