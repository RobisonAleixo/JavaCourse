package application;

import java.util.Locale;
import Employee.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Student student = new Student();

		student.AddStudent();
		student.TotalGrade();

	}

}
