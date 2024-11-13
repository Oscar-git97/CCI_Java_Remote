package tp5.ex01;

import java.util.Scanner;

public class TestDateV2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Date date = new Date();
		System.out.println("Taper la date (jour mois année) : ");
		date.scanWith(scanner);
		System.out.println("Date saisie : ");
		date.print();
		scanner.close();

	}

}
