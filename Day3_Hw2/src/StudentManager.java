
public class StudentManager extends UserManager {
	public void takeCourse(String courseName) {

		System.out.println("Ders sepete eklendi " + courseName);

	}

	public void giveStarstoCourse(String courseName, int stars) {

		System.out.println(stars + " y�ld�z " + courseName + " dersine verildi");

	}
}
