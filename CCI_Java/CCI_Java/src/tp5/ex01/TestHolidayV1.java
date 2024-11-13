package tp5.ex01;

import java.util.Scanner;

public class TestHolidayV1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Saisie d ' une période");
		System.out.println("Taper la date de début (jour mois année) :");
		Date start = new Date();
		start.scanWith(scanner);
		System.out.println("Taper la date de fin (jour mois année) :");
		Date end = new Date();
		end.scanWith(scanner);
		Holiday holiday = new Holiday(start, end);
		System.out.println("Période saisie :");
		holiday.print();
		
	}

}
