package tp4.ex01;

public class TestNextDay {

	public static void main(String[] args) {
		Date date1 = new Date(20, 9, 1997);
		Date date2 = new Date(28,2,2001);
		Date date3 = new Date(28,2,2024);
		Date date4 = new Date(31,12,2004);

		Date date5 = new Date(29,2,2024);
		
		date1.print();
		date1.nextDay().print();
		date2.print();
		date2.nextDay().print();
		date3.print();
		date3.nextDay().print();
		date4.print();
		date4.nextDay().print();
		date5.print();
		date5.nextDay().print();
		
	}

}
