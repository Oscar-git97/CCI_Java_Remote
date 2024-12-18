package tp5.ex01;

import java.util.Scanner;

public class HolidayManager {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Employee employee = new Employee(45252);
		int answer;
		do {
			System.out.println(" ------------- --------------- -------------- ------------ ");
			System.out.println(" Que voulez - vous faire ? ");
			System.out.println(" 1 - Afficher les p é riodes de vacances de l ' employ é . ");
			System.out.println(" 2 - Ajouter une p é riode de vacances . ");
			System.out.println(" 3 - Savoir si l ' employ é est en vacances un jour donn é . ");
			System.out.println(" 4 - Quitter l ' application . ");
			System.out.print(" Votre choix : ");
			answer = scanner.nextInt();
			System.out.println(" ------------- --------------- -------------- ------------ ");
			if (answer == 1)
				employee.print();
			else if (answer == 2)
				employee.scanAndAddHolidayWith(scanner);
			else if (answer == 3)
				employee.checkIfOnHoliday(scanner);
			else if (answer != 4)
				System.out.println("Commande non disponible ! ");
		} while (answer != 4);
		System.out.println("Merci d ' avoir utilis é l ' application . Au revoir ! ");
		scanner.close();
	}
}
