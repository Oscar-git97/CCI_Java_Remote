package tp3.ex04;

import java.util.Scanner;

public class NumberPrinter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" Entrez un nombre entier positif : ");
		int n = scanner.nextInt();
		
		for(int idx = 1; idx <= n; idx++) 
			System.out.print(idx + " ");
		
	}
}
