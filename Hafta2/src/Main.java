
public class Main {

	public static void main(String[] args) {

		Course javaCourse = new Course(1, "Java", "Engin Demirog", 0.32);
		Course pythonCourse = new Course(1, "Python", "Engin Demirog", 0.0);
		Course[] courses = new Course[2];
		courses[0] = javaCourse;
		courses[1] = pythonCourse;
		CourseManager manager = new CourseManager();
		manager.listCourses(courses);
	}

}
