package tp2.ex04;

import java.util.Scanner;

public class MoneyDecompositionV2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] bills = {500, 200, 100, 50, 20, 10, 5, 2, 1};
		System.out.println("Entrez un montant en euros :");
		int montant = scanner.nextInt();
		System.out.println("Vous avez entré : " + montant);
		System.out.println("Décomposition :");
		
		int div = montant / 500;
		if(div > 0) {
			System.out.println(div + " billet(s) de " + 500 + " euros");
			montant = montant % 500;
		}	
		div = montant / 200;
		if(div > 0) {
			System.out.println(div + " billet(s) de " + 200 + " euros");
			montant = montant % 200;
		}
		div = montant / 100;
		if(div > 0) {
			System.out.println(div + " billet(s) de " + 100 + " euros");
			montant = montant % 100;
		}
		div = montant / 50;
		if(div > 0) {
			System.out.println(div + " billet(s) de " + 50 + " euros");
			montant = montant % 50;
		}
		div = montant / 20;
		if(div > 0) {
			System.out.println(div + " billet(s) de " + 20 + " euros");
			montant = montant % 20;
		}
		div = montant / 10;
		if(div > 0) {
			System.out.println(div + " billet(s) de " + 10 + " euros");
			montant = montant % 10;
		}
		div = montant / 5;
		if(div > 0) {
			System.out.println(div + " billet(s) de " + 5 + " euros");
			montant = montant % 5;
		}
		div = montant / 2;
		if(div > 0) {
			System.out.println(div + " billet(s) de " + 2 + " euros");
			montant = montant % 2;
		}
		div = montant / 1;
		if(div > 0) {
			System.out.println(div + " billet(s) de " + 1 + " euros");
			montant = montant % 1;
		}

	}

}
