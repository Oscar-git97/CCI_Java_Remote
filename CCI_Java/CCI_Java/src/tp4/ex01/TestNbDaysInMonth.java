package tp4.ex01;

public class TestNbDaysInMonth {

	public static void main(String[] args) {
		Date date1 = new Date(20, 1, 2000);
		Date date2 = new Date(1, 2, 2001);
		Date date3 = new Date(1, 3, 2024);
		Date date4 = new Date(1, 4, 2004);
		Date date5 = new Date(1, 5, 2004);
		Date date6 = new Date(1, 6, 2004);
		Date date7 = new Date(1, 7, 2004);
		Date date8 = new Date(1, 8, 2004);
		Date date9 = new Date(1, 9, 2004);
		Date date10 = new Date(1, 10, 2004);
		Date date11 = new Date(1, 11, 2004);
		Date date12 = new Date(1, 12, 2004);
		Date date13 = new Date(1, 2, 2004);
		System.out.println("Januar: " + date1.nbDaysInMonth());
		System.out.println("Februar: " + date2.nbDaysInMonth());
		System.out.println("März: " + date3.nbDaysInMonth());
		System.out.println("April: " + date4.nbDaysInMonth());
		System.out.println("Mai: " + date5.nbDaysInMonth());
		System.out.println("Juni: " + date6.nbDaysInMonth());
		System.out.println("Juli: " + date7.nbDaysInMonth());
		System.out.println("August: " + date8.nbDaysInMonth());
		System.out.println("September: " + date9.nbDaysInMonth());
		System.out.println("Oktober: " + date10.nbDaysInMonth());
		System.out.println("November: " + date11.nbDaysInMonth());
		System.out.println("Dezember: " + date12.nbDaysInMonth());
		System.out.println("Februar Schaltjahr: " + date13.nbDaysInMonth());
	}

}
