package tp5.ex01;

import java.util.Scanner;

public class TestEmployeeV1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Holiday holi = new Holiday();
		holi.scanWith(scanner);
		Employee petra = new Employee(111);
		petra.addHoliday(holi);
	}

}
