package tp5.ex01;

import java.util.Scanner;

public class TestCheckIfOnHoliday {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Employee employee = new Employee(320);
		employee.scanAndAddHolidayWith(scanner);
//		employee.scanAndAddHolidayWith(scanner);
		employee.print();
		employee.checkIfOnHoliday(scanner);

	}

}
