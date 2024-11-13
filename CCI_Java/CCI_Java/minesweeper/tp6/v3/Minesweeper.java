package tp6.v3;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Minesweeper {
	private int nbColumns;
	private int nbLines;
	private int score;

	double difficulte = 0.33;
	Color colorSweeper = Color.RED;

	private ArrayList<ArrayList<Cell>> board;

	public Minesweeper() {
		this.nbColumns = 10;
		this.nbLines = 10;
		this.score = 0;
		this.board = new ArrayList<ArrayList<Cell>>();

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
		score++;
	}

	public boolean isRevealed(int line, int column) {
//		if (isValidPositionLC(line, column))
			return board.get(line).get(column).getIsRevealed();
//		return false;
	}

	public boolean isMine(int line, int column) {
//		if (isValidPositionLC(line, column))
			return board.get(line).get(column).getIsMine();
//		return false;
	}

	public void reveal(int line, int column) {
		boolean isIt = isMine(line, column);
		if(isIt) {
			for(ArrayList<Cell> row : board) {
				for(Cell cell : row)
					cell.reveal();
			}
		}
		board.get(line).get(column).reveal();
	}

	public Cell getCell(int line, int column) {
		return board.get(line).get(column);
	}

	public void select(int line, int column) {
		board.get(line).get(column).setSelected(true);
	}

	public void deselect(int line, int column) {
		board.get(line).get(column).setSelected(false);
	}

	public boolean isValidPositionLC(int line, int column) {
		boolean lineCheck = line <= nbLines && line > 0;
		boolean columnCheck = column <= nbColumns && column > 0;
		if (lineCheck && columnCheck)
			return true;
		return false;
	}

}
