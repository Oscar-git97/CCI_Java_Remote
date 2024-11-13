package tp6.ex01;

import java.util.ArrayList;

public class Team {

	String name;
	ArrayList<TeamMember> members;

	public Team(String name) {
		this.name = name;
		members = new ArrayList<TeamMember>();
	}

	public void addMembers(TeamMember member) {
		members.add(member);
	}

	@Override
	public String toString() {
		String res = "Team: " + name + "\nMembers:\n\n";
		for (TeamMember m : members) {
			res += m.toString() + "\n\n";
		}
		return res;
	}
}
