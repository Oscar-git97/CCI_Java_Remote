package tp7.exo1;

import java.util.Scanner;
//Taper la premi è re cha î ne : bonjour
//Taper la deuxi è me cha î ne : bon
//str1 commence -t - elle par str2 ? true
//str1 finit - elle par str2 ? false
//str1 contient - elle str2 ? true
public class TestString9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Taper la première chaîne :");
		String str1 = scanner.nextLine();
		System.out.println("Taper la deuxieme chaîne :");
		String str2 = scanner.nextLine();
		System.out.println("str1 commence -t - elle par str2 ? " + str1.startsWith(str2));
		System.out.println("str1 finit - elle par str2 ? " + str1.endsWith(str2));
		System.out.println("str1 contient - elle str2 ? " + str1.contains(str2));
		
	scanner.close();
	}

}
