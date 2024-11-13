package tp4.ex01;

public class TestIsLeap {

	public static void main(String[] args) {
		Date date1 = new Date(20, 9, 2000);
		Date date2 = new Date(0,0,2001);
		Date date3 = new Date(0,0,2024);
		Date date4 = new Date(0,0,2004);
		System.out.println(date1.isLeapYear());
		System.out.println(date2.isLeapYear());
		System.out.println(date3.isLeapYear());
		System.out.println(date4.isLeapYear());
	}

}
