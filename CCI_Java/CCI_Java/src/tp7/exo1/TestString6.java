package tp7.exo1;

import java.util.Scanner;

public class TestString6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Taper le nom de la ville :");
		String str = scanner.nextLine();
		System.out.println("Le nom de la ville en majuscules est \"" + str.stripIndent().toUpperCase()+"\"");
	
	scanner.close();
	}

}