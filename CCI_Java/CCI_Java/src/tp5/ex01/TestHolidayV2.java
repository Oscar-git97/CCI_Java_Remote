package tp5.ex01;

import java.util.Scanner;

public class TestHolidayV2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Holiday holiday = new Holiday();
		holiday.scanWith(scanner);
		System.out.println("Période saisie : ");
		holiday.print();
		scanner.close();

	}

}
