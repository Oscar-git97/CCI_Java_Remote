package tp7.exo1;

import java.util.Scanner;

public class TestString3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Taper un entier :");
		int value = scanner.nextInt();
		System.out.println("La chaîne correspondante est \"" + String.valueOf(value)+ "\"");
		
		scanner.close();
	}

}
