package tp6.ex01;

import java.util.ArrayList;

public class TeamMember {
	private String firstName;
	private String lastName;
	private ArrayList<Contribution> contributions;

	public TeamMember(String firstName, String lastName) {

		this.firstName = firstName;
		this.lastName = lastName;
		contributions = new ArrayList<Contribution>();
	}
	
	public void addContribution(Contribution con) {
		contributions.add(con);
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public ArrayList<Contribution> getContributions() {
		return contributions;
	}
	
	public Contribution getCont(int idx) {
		return contributions.get(idx);
	}
	
	public double houresWorked() {
		double res = 0;
		
		for(Contribution c : contributions) {
			res += c.getHoursWorked();
		}
		return res;
	}
	
	@Override
	public String toString() {
		String res = "Team Member: " + getFirstName() + " " + getLastName();
		res += "\nContributions:\n";
		for (Contribution c : contributions) 
			res += c.toString()+ "\n";
		return res + "Total Hours Worked: " + houresWorked();
	}
}
