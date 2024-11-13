package tp5.ex01;

import java.util.Scanner;

public class Holiday {
	Date start;
	Date end;
	
	public Holiday(Date start, Date end) {
		this.start = start;
		this.end = end;
	}
	
	public Holiday() {
		this.start = null;
		this.end = null;
	}
	
	public void print() {
		System.out.println("Du " + start.toString() + " au " + end.toString());
	}

	public void scanWith(Scanner scanner) {
		System.out.println("Saisie d ' une période");
		System.out.println("Taper la date de début (jour mois année) :");
		start = new Date();
		start.scanWith(scanner);
		System.out.println("Taper la date de fin (jour mois année) :");
		end = new Date();
		end.scanWith(scanner);
		
	}
}
