package tp5.ex01;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {

	int id;
	ArrayList<Holiday> holidays;

	public Employee(int id) {
		this.id = id;
		this.holidays = new ArrayList<Holiday>();
		
	}

	public void addHoliday(Holiday holiday) {
		holidays.add(holiday);
		System.out.println("Période ajoutée");
	}

	public void addHoliday(Scanner scanner) {
		System.out.println("à partir de : ");
//		System.out.println("le jour : ");
		int dayStart = scanner.nextInt();
//		System.out.println("le mois : ");
		int monthStart = scanner.nextInt();
//		System.out.println("l'année : ");
		int yearStart = scanner.nextInt();

		Date tempDate1 = new Date(dayStart, monthStart, yearStart);

		System.out.println("jusque à : ");
//		System.out.println("le jour : ");
		int dayEnd = scanner.nextInt();
//		System.out.println("le mois : ");
		int monthEnd = scanner.nextInt();
//		System.out.println("l'année : ");
		int yearEnd = scanner.nextInt();

		Date tempDate2 = new Date(dayEnd, monthEnd, yearEnd);

		holidays.add(new Holiday(tempDate1, tempDate2));

	}
	
	void scanAndAddHolidayWith(Scanner scanner){
		Holiday holi = new Holiday();
		holi.scanWith(scanner);
		addHoliday(holi);
	}

//	public void displayHolidays() {
//
//		for (int idx = 0; idx < holidays.size(); idx++) {
//			System.out.println("Holidays " + idx + " :");
//			System.out.print("start : ");
//			holidays.get(idx).start.print();
//			System.out.print("fin : ");
//			holidays.get(idx).end.print();
//		}
//	}

	public void checkIfOnHoliday(Scanner scanner) {
		System.out.println("Taper une date pour v é rifier si l ' employ é est en vacances ( jour mois ann é e ) : ");
		int day = scanner.nextInt();
		int month = scanner.nextInt();
		int year = scanner.nextInt();

		Date tempDate = new Date(day, month, year);
		boolean holidayFlag = false;
		for (int idx = 0; idx < holidays.size(); idx++) {
			if (tempDate.isBefore(holidays.get(idx).end) && holidays.get(idx).start.isBefore(tempDate)) {
				holidayFlag = true;
			}
		}
		if(holidayFlag)
			System.out.println("L'employ é est en vacances à cette date .");
		else
			System.out.println("L'employé n'est pas en vacances à cette date.");
	}
	
	void print() {
		System.out.println("ID : " + id);
		System.out.println("Holidays :");
		for (int idx = 0; idx < holidays.size(); idx++) {
			int nb = idx +1;
			System.out.println("Holiday " + nb + " :");
			System.out.print("start : ");
			holidays.get(idx).start.print();
			System.out.print("fin : ");
			holidays.get(idx).end.print();
		}
	}

}
