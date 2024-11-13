package tp7.exo1;

import java.util.Scanner;

public class TestString10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Taper la première chaîne :");
		String str1 = scanner.nextLine();
		System.out.println("Taper la deuxieme chaîne :");
		String str2 = scanner.nextLine();
		if (str1.contains(str2))
			str1 = str1.replaceAll(str2, " ");
		System.out.println("Résultat : " + str1);

		scanner.close();
	}

}
