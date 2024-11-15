package tp4.ex02;

import java.util.Scanner;

public class QuizAddition {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int flag = 1;
		int correctAnswersCount = 0;
		int incorrectAnswersCount = 0;

		while (flag == 1) {
			int firstNumber = (int) (Math.random() * 100);
			int secondNumber = (int) (Math.random() * 100);
			System.out.println(firstNumber + " + " + secondNumber + " ?");
			int userAnswer = scanner.nextInt();
			int res = firstNumber + secondNumber;
			if (userAnswer == res) {
				System.out.println("C'est juste !");
				System.out.println("Voulez - vous recommencer ? ( oui :1 / non :0) :");
				correctAnswersCount++;
			} else {
				System.out.println("C'est faux : le résultat est " + res + " !");
				System.out.println("Voulez - vous recommencer ? ( oui :1 / non :0) :");
				incorrectAnswersCount++;
			}

			flag = scanner.nextInt();

			while (flag != 1 && flag != 0) {
				System.out.println("tapez 1 où 0 s.v.p. !");
				flag = scanner.nextInt();
			}

		}
		System.out.println("Score : " + correctAnswersCount + " réponse ( s ) juste ( s ) ; " + incorrectAnswersCount
				+ " réponse ( s ) fausse ( s ) .");
		scanner.close();
	}

}
