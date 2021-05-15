
public class Main {

	public static void main(String[] args) {
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		Student student = new Student(1, "Ayse", "Cekic", "xxx@xxx.com", "Ayyıldız Ortaokulu", false);
		Instructor instructor = new Instructor(2, "Selin", "Kale", "instructor1@xxx.com", "Math");

		instructorManager.login(instructor);
		instructorManager.addCourseVideos(instructor.getCourseName());
		instructorManager.addQuiz(instructor.getCourseName());

		studentManager.login(student);
		studentManager.takeCourse("Math");
		studentManager.giveStarstoCourse("Math", 5);

	}
}
