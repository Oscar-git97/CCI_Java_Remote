package tp6.ex01;

public class TestTeam {

	public static void main(String[] args) {
		
		Team best = new Team("The best Team");
		
		TeamMember sophie = new TeamMember("Sophie", "Dupuis");
		Contribution contributionA = new Contribution("Project Phoenix", 350.6);
		Contribution contributionB = new Contribution("Project Horizon", 1025.4);

		sophie.addContribution(contributionA);
		sophie.addContribution(contributionB);
		
		TeamMember lucas = new TeamMember("Lucas", "Moreau");
		Contribution contributionC = new Contribution("Project Apollo", 420.3);
		Contribution contributionD = new Contribution("Project Zenith", 45.4);
		Contribution contributionE = new Contribution("Project Horizon", 1203.1);
		
		lucas.addContribution(contributionC);
		lucas.addContribution(contributionD);
		lucas.addContribution(contributionE);
		
		best.addMembers(sophie);
		best.addMembers(lucas);
		
		System.out.println(best);
	}
}
