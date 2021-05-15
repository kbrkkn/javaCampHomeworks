
public class CourseManager {
	public void listCourses(Course[] courses) {
		for (Course course : courses) {
			System.out.println("Kurs ismi: " + course.getCourseName() + "E�itmen:  " + course.getInstructor()
					+ " Tamamlanma Y�zdesi: " + course.getCompletionRate());
		}
	}

	public Course selectCourse(Course[] courses, int id) {
		for (Course course : courses) {
			if (course.getCourseId() == id) {
				return course;
			}
		}

		return null;
	}

}
