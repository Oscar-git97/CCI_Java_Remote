package tp5.ex01;

import java.util.Scanner;

public class TestDateV1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Taper la date (jour mois année) :");
		Date dateTest = new Date(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
		Date date1 = new Date(20, 9, 1997);
		Date date2 = new Date();
		System . out . println ( "Date saisie :" ) ;
		dateTest.print();
		date1.print();
		date2.print();
		scanner.close();
	}

}
