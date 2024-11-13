package tp3.minesweeperVersion4;

import java.util.ArrayList;
import java.util.Scanner;

public class Minesweeper {
	int nbColumns;
	int nbLines;
	int score;
	int selectedLine;
	int selectedColumn;
//	int selLineOpened;
//	int selColumnOpend;
	int [][] field;
	int [][] opend;
	
	private void checkSelect() {
		Scanner scanner = new Scanner(System.in);
		while (this.selectedColumn == -1 || this.selectedLine == -1) {
			
			if (this.selectedColumn == -1 && this.selectedLine == -1) {
				System.out.println("Selectionnez une cellule svp. (en utilisant d'une entier) !");
				System.out.println("Column : ");
				this.selectedColumn = scanner.nextInt();
				System.out.println("Line : ");
				this.selectedLine = scanner.nextInt();
			} 
			
			
		}
	}
}
