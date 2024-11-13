package tp5.ex02;

import java.util.Scanner;

public class CasinoGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int money = 100;

		int exitFlag = 1;
		System.out.println("Vous avez 100 euros . Bonne chance !");

		while (exitFlag == 1 && money > 0) {

			int bet = 0;
			while (bet <= 0 || bet > money) {
				System.out.println("Combien voulez - vous miser ? ");
				bet = scanner.nextInt();
				if (bet <= 0 || bet > money)
					System.out.println("Choisissez une valeur entre 1 et " + money + " s.v.p. !");
			}
			int userNumber = 0;

			while (userNumber <= 0 || userNumber > 6) {
				System.out.println("Sur quel numéro (il faut etre entre 1 et 6) ? ");
				userNumber = scanner.nextInt();
				if (userNumber <= 0 || userNumber > 6)
					System.out.println("Choisissez une valeur entre 1 et 6 s.v.p. !");
			}

			double number = 1 + Math.random() * 5 + 0.5;
			System.out.println("Le bon numéro était le " + (int) number);

			if ((int)number == userNumber)
				money += bet;
			else
				money -= bet;
			System.out.println("Vous avez à présent " + money + " euros.");
			if (money > 0) {
				System.out.println("Voulez - vous recommencer ? ( oui :1 / non :0) :");
				exitFlag = scanner.nextInt();
			}
			
		} 
		
		if(money == 100)
			System.out.println("Vous n'avez pas perdu d'argent");
		else if(money == 0)
			System.out.println("Vous êtes ruiné !");
		else if(money >100)
			System.out.println("Vous avez gagné de l'argent !");
		else
			System.out.println("Vous avez perdu de l'argent !");

	}

}
