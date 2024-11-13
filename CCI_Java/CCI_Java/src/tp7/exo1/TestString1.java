package tp7.exo1;

import java.util.Scanner;

public class TestString1 {

//	Taper la premi è re cha î ne : salut
//	Taper la deuxi è me cha î ne : bonjour
//	La premi è re cha î ne vaut " salut " .
//	La deuxi è me cha î ne vaut " bonjour " .

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Taper la première chaîne :");
		String str1 = scanner.nextLine();
		System.out.println("Taper la deuxieme chaîne :");		
		String str2 = scanner.nextLine();
		
		System.out.println("La première chaîne vaut \"" + str1 +"\"");
		System.out.println("La deuxieme chaîne vaut \"" + str2+"\"");

		scanner.close();
		
	}
	
	
}
