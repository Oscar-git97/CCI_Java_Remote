package td5.ex01;

import java.util.ArrayList;

public class Employee {

	int id;
	ArrayList<Holiday> holidays;
	
	public Employee(int id) {
		this.id = id;
	}
	
	public void addHoliday(Holiday holiday) {
		holidays.add(holiday);
	}
	
}
