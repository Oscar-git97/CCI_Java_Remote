package tp7.exo1;

import java.util.Scanner;

public class TestString7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Taper la première chaîne :");
		String str1 = scanner.nextLine();
		System.out.println("Taper la première chaîne :");
		String str2 = scanner.nextLine();
		System.out.println("Les deux chaînes commencent - elles parle même caractère ? " + (str1.charAt(0) == str2.charAt(0)));

	scanner.close();
	}

}