package tp5.ex01;

import java.util.Scanner;

public class TestPrintEmployee {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Employee employee = new Employee(320);
		employee.scanAndAddHolidayWith(scanner);
		employee.scanAndAddHolidayWith(scanner);
		employee.print();

	}

}
