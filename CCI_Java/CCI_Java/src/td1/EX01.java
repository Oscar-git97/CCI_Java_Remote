package td1;

import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {
		
		// Ex01
		double x = 10;
		boolean isXInInterval = ((-5) < x && x <= 2) || ((5 <= x) && (x <= 10));
		
		// Ex02
		Scanner scanner = new Scanner(System.in);
		System.out.println("Donnez moi l'annee svp :");
		int year = scanner.nextInt();
		boolean cond1 = year % 4 == 0;
		boolean cond2 = year % 100 != 0;
		boolean cond3 = year % 400 == 0;
		boolean isLeap = (cond1 && cond2) || cond3;
		if (isLeap) {
			System.out.println("C'est bissextile !");
		} 
//		else if (year % 400 == 0) {
//			System.out.println("C'est bissextile !");
//		}
		else {
			System.out.println("Ce n'est pas bissextile !");
		}
		scanner.close();
		// Ex02
		int a = 2;
		int b = 13;
		int c = 3;
		
		boolean frage1 = (a +b) != c;
		// (15) != 3 --> T
		boolean frage2 = !(a == c);
		boolean frage3 = ((b - a) >= c) && (a <= (c - b));
		// (11 >= 3) && (2 <= -10) --> t  && f --> f
		boolean frage4 = (((6 * a) + 1) >= b) && (c == (b % 5));
		// (13 >= 13) && 3 == (3) --> T && T --> f
		boolean frage5 = (b / c) < (b / 3.0);
		// 13 / 3 < (13 / 3.0) --> 4 < 4.33 --> true
		boolean frage6 = (((b + c + 3) / 9) == (a + 1)) || (((b - 5) % a) > 0);
		// (19 / 9) == 3 || (8 % 2) > 0 --> f || f --> f
		System.out.println("1: " + frage1 + " 2: " + frage2 + " 3: " + frage3 + " 4: " 
				+ frage4 + " 5: " + frage5 + " 6: " + frage6);
		
		// Ex03
		/* 4. (x >= y) && (y > z) && (z >= x)
		 * --> ERRor
		 * 
		 * 
		 * */
	}

}
