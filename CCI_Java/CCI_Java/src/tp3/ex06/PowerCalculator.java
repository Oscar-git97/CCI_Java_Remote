package tp3.ex06;

import java.util.Scanner;

public class PowerCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" Entrez un nombre reel: ");
		int x = scanner.nextInt();
		
		System.out.println(" Entrez un nombre entier positif : ");
		int n = scanner.nextInt();
		
		double product = 1;
		for(int idx = 1; idx <= n; idx++) 
			product *= x;
		System.out.println(x + "^" + n + " = " + product);
		
		
	}
}
