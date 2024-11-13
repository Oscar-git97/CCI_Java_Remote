package tp3.ex05;

import java.util.Scanner;

public class SumCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Combien de nombres souhaitez-vous entrer ? ");
		int n = scanner.nextInt();
		int sum = 0;
		for(int idx = 1; idx <= n; idx++) {
			System.out.println("Entrez le nombre " + idx);
			sum += scanner.nextInt();
		}
		System.out.println("La somme des nombres saisis est : " + sum);

	}

}
