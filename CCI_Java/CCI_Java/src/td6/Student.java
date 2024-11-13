package td6;

import java.util.ArrayList;

public class Student {
	private String firstName;
	private String lastName;
	private ArrayList<SubjectResult> results;

	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		results = new ArrayList<SubjectResult>();
	}

	public void addResult(SubjectResult subjectResult) {
		results.add(subjectResult);
	}

	public int getResultCount() {
		return results.size();
	}

	public SubjectResult getResult(int idx) {
		return results.get(idx);
	}

	public double getAverageMark() {
		double sum = 0;
		for (SubjectResult res : results) {
			sum += res.getMark();
		}
		return sum / results.size();
	}

	@Override
	public String toString() {
		String result = "Name: " + firstName + " " + lastName;
		for (SubjectResult res : results) {
			result += " [" + res.toString() + "]";
		}

		return result + " [avg: " + getAverageMark() + "]";
	}
}
