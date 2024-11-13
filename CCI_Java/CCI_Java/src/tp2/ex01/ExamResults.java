package tp2.ex01;

import java.util.Scanner;

public class ExamResults {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Donnez moi le premiere note svp :");
		int note1 = scan.nextInt();
		System.out.println("Donnez moi le deuxieme note svp :");
		int note2 = scan.nextInt();
		System.out.println("Donnez moi le troisieme note svp :");
		int note3 = scan.nextInt();
		
		double moyenne = (note1 + note2 + note3) / 3;
		System.out.println("La moyenne : " + moyenne);
		
		if(moyenne >= 16){
			System.out.println("Tres Bien (TB)");
		} else if (moyenne >= 14) {
			System.out.println("Bien (B)");
		} else if (moyenne >= 12) {
			System.out.println("Assez Bien (AB)");
		} else if (moyenne >= 10) {
			System.out.println("Passable (P)");
		} else {
			System.out.println("gg, try again");
		}

	}

}
