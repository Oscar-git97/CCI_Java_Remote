package td5.ex01;

public class HolidaysExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date date1 = new Date(15, 7, 2024);
		Date date2 = new Date(22, 7, 2024);
		Date date3 = new Date(20, 12, 2024);
		Date date4 = new Date(5, 1, 2025);
		Date date5 = new Date(10, 8, 2024);
		Date date6 = new Date(17, 8, 2024);
		Date date7 = new Date(24, 8, 2024);
		Date date8 = new Date(31, 8, 2024);
		Date date9 = new Date(1, 9, 2024);
		Date date10 = new Date(7, 9, 2024);

		Holiday holiday1 = new Holiday(date1, date2);
		Holiday holiday2 = new Holiday(date3, date4);
		Holiday holiday3 = new Holiday(date5, date6);
		Holiday holiday4 = new Holiday(date7, date8);
		Holiday holiday5 = new Holiday(date9, date10);
		
		Employee employee1 = new Employee(5845);
		Employee employee2 = new Employee(10312);
		
		employee1.addHoliday(holiday1);
		employee1.addHoliday(holiday2);
		employee2.addHoliday(holiday3);
		employee2.addHoliday(holiday4);
		employee2.addHoliday(holiday5);
	}

}
