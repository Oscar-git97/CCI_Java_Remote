package tp7.exo1;

import java.util.Scanner;

public class TestString5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Taper une chaîne de caractères représentant un entier :");
		String str = scanner.nextLine();
		System.out.println("La valeur correspondante est " + Double.parseDouble(str));
	
	scanner.close();
	}

}
