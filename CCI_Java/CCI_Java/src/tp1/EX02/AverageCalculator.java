package tp1.EX02;

import java.util.Scanner;

public class AverageCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Donnez moi deux nombre ! premiere : ");
		int a = scanner.nextInt();
		System.out.println("Deuxieme : ");
		int b = scanner.nextInt();
		System.out.println("Vous avez mis : " + a + " et " + b);
		int somme = a + b;
		int produit = a * b;
		System.out.println("Somme : " + somme + " produit : " + produit);
		if (b != 0) {
			int div = a / b;
			int rest = a % b;
			System.out.println("div : " + div + " rest : " + rest);
		} else {
			System.out.println("Division pas possible, car b = 0");
		}
	}

}
