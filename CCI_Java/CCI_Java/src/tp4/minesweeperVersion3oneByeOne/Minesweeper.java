package tp4.minesweeperVersion3oneByeOne;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Minesweeper {
	int nbColumns;
	int nbLines;
	int score;
	int selectedLine;
	int selectedColumn;

	ArrayList<List<Cell>> board;

	public Minesweeper() {
		this.nbColumns = 10;
		this.nbLines = 10;
		this.score = 100;
		this.selectedLine = 0;
		this.selectedColumn = 0;
		this.board = new ArrayList<List<Cell>>();

		for (int line = 0; line < this.nbLines; line++) {
			this.board.add(new ArrayList<Cell>());
			for (int column = 0; column < this.nbColumns; column++) {
				Cell cell = new Cell();
				cell.isRevealed = false;
				cell.isMine = ((int) (Math.random() * 5)) == 0;
				this.board.get(line).add(cell);
			}
		}
	}

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
