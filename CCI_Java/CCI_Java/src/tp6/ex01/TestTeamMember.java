package tp6.ex01;

public class TestTeamMember {

	public static void main(String[] args) {
		TeamMember sophie = new TeamMember("Sophie", "Dupuis");
		Contribution contributionA = new Contribution("Project Phoenix", 350.6);
		Contribution contributionB = new Contribution("Project Horizon", 1025.4);

		sophie.addContribution(contributionA);
		sophie.addContribution(contributionB);
		
		System.out.println(sophie);

	}

}
