package tp4.ex01;

public class TestIsBefore {

	public static void main(String[] args) {
		Date date1 = new Date(20, 9, 2000);
		Date date2 = new Date(1,1,2001);
		Date date3 = new Date(1,1,2024);
		Date date4 = new Date(1,1,2004);
		Date date5 = new Date(1,2,2004);
		Date date6 = new Date(2,2,2004);
		System.out.println(date1.isBefore(date4));
		System.out.println(date2.isBefore(date4));
		System.out.println(date3.isBefore(date4));
		System.out.println(date4.isBefore(date4));
		System.out.println(date4.isBefore(date5));
		System.out.println(date5.isBefore(date6));
		
	}

}