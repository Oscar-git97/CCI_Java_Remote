package tp7.exo1;

import java.util.Scanner;

public class TestString8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Taper la première chaîne :");
		String str1 = scanner.nextLine();
		System.out.println("Taper la deuxieme chaîne :");
		String str2 = scanner.nextLine();
		System.out.println("R é sultat de str1.compareTo(str2) : " + str1.compareTo(str2));
		System.out.println("R é sultat de str1.compareToIgnoreCase(str2) : " + str1.compareToIgnoreCase(str2));

	scanner.close();
	}

}
