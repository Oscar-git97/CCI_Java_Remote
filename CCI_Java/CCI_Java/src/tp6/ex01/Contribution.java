package tp6.ex01;

public class Contribution {

	private String projectName;
	private double hoursWorked;
	
	public Contribution(String projectName, double hoursWorked) {
		this.projectName = projectName;
		this.hoursWorked = hoursWorked;
		
		
	}

	public String getProjectName() {
		return projectName;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return projectName + ", Hours Worked: " + hoursWorked;
	}
}