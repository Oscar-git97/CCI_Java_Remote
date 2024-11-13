package tp6.v2;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Minesweeper {
	private int nbColumns;
	private int nbLines;
	private int score;
	
	double difficulte = 0.25;
	Color colorSweeper = Color.RED;

	private ArrayList<List<Cell>> board;

	public Minesweeper() {
		this.nbColumns = 10;
		this.nbLines = 10;
		this.score = 0;
		this.board = new ArrayList<List<Cell>>();
		
		
		for (int row = 0; row < this.nbLines; row++) {
			this.board.add(new ArrayList<Cell>());
			for (int column = 0; column < this.nbColumns; column++) {
				boolean isMine = ((int) (Math.random() + difficulte)) == 1;
				Cell cell = new Cell(isMine, row, column);
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

	public int getNbColumns() {
		return nbColumns;
	}

	public int getNbLines() {
		return nbLines;
	}
	 public int getScore() {
		return score;
	}
	
	 public void increaseScore() {
		 score ++;
	 }
	 
	 public boolean isRevealed() {
		 return false;
	 }
	
	
}
