package td6;

import java.util.ArrayList;
import java.util.Iterator;

public class Promotion {

	private String name;
	private ArrayList<Student> students;

	public Promotion(String name) {
		this.name = name;
		students = new ArrayList<Student>();
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	@Override
	public String toString() {

		String result = name+ " [ ";

		for (Student stud : students) {
			result += (" " + stud.toString());
		}
		return result + "]";
	}
}
