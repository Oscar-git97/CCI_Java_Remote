package tp5.v1;

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
	
	double difficulte = 0.25;
	Color colorSweeper = Color.RED;

	ArrayList<List<Cell>> board;

	public Minesweeper() {
		this.nbColumns = 10;
		this.nbLines = 10;
		this.score = this.nbColumns * this.nbLines;
		this.selectedLine = 0;
		this.selectedColumn = 0;
		this.board = new ArrayList<List<Cell>>();
		
		
		for (int row = 0; row < this.nbLines; row++) {
			this.board.add(new ArrayList<Cell>());
			for (int column = 0; column < this.nbColumns; column++) {
				boolean isMine = ((int) (Math.random() + difficulte)) == 1;
				Cell cell = new Cell(isMine, row, column);
				if (isMine)
					score--;
				this.board.get(row).add(cell);
			}
		}
	}

	public double getDifficulte() {
		return difficulte;
	}

	public void setDifficulte(double difficulte) {
		this.difficulte = difficulte;
	}

	public Color getColorSweeper() {
		return colorSweeper;
	}

	public void setColorSweeper(Color color) {
		this.colorSweeper = color;
	}
	
}
