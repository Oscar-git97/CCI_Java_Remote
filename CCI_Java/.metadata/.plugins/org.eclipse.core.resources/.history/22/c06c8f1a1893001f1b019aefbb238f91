package tp5.minesweeper.version1;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Minesweeper {
	int nbColumns;
	int nbLines;
	int score;
	int selectedLine;
	int selectedColumn;
	
	double difficulte = 0.5;
	Color color = Color.RED;

	ArrayList<List<Cell>> board;

	public Minesweeper() {
		this.nbColumns = 10;
		this.nbLines = 10;
		this.score = this.nbColumns * this.nbLines;
		this.selectedLine = 0;
		this.selectedColumn = 0;
		this.board = new ArrayList<List<Cell>>();
		

		for (int line = 0; line < this.nbLines; line++) {
			this.board.add(new ArrayList<Cell>());
			for (int column = 0; column < this.nbColumns; column++) {
				Cell cell = new Cell();
				cell.isRevealed = false;
				cell.isMine = ((int) (Math.random() + difficulte)) == 0;
				if (cell.isMine)
					score--;
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

	public double getDifficulte() {
		return difficulte;
	}

	public void setDifficulte(double difficulte) {
		this.difficulte = difficulte;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
}
