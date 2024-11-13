package tp2.ex04;

import java.util.Scanner;

public class MoneyDecomposition {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] bills = {500, 200, 100, 50, 20, 10, 5, 2, 1};
		System.out.println("Entrez un montant en euros :");
		int montant = scanner.nextInt();
		System.out.println("Vous avez entré : " + montant);
		System.out.println("Décomposition :");
//		while (montant / bills[idx] == 0) {
//			idx	++;		
//		}

		for (int i : bills) {
			int div = montant / i;
			if(div > 0) {
				System.out.println(div + " billet(s) de " + i + " euros");
				montant = montant % i;
			}	
			
		}

	}

}

