package tp6.v3;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Minesweeper {
	private int nbColumns;
	private int nbLines;
	private int score;
	private boolean gameWin;
	private boolean gameOver;
	private int nbMines;
	private int nbBlanks;
	private int nbRevealed;

	double difficulty;
	Color colorSweeper = Color.RED;

	private ArrayList<ArrayList<Cell>> board;

	public Minesweeper() {
		resetGame(0.25);

	}

	public void resetGame(double difficulty) {
		this.nbColumns = 15;
		this.nbLines = 15;
//		this.nbColumns = 3;
//		this.nbLines = 3;
		this.difficulty = difficulty;
		this.score = 0;

		this.gameOver = false;
		this.gameWin = false;
		this.nbMines = 0;
		this.nbRevealed = 0;

		this.board = new ArrayList<ArrayList<Cell>>();
		for (int row = 0; row < this.nbLines; row++) {
			this.board.add(new ArrayList<Cell>());
			for (int column = 0; column < this.nbColumns; column++) {
				boolean isMine = ((int) (Math.random() + difficulty)) == 1;
				Cell cell = new Cell(isMine, row + 1, column + 1);
				this.board.get(row).add(cell);
				if (isMine)
					nbMines++;
			}
		}

		this.nbBlanks = (nbLines * nbColumns) - nbMines;
		setNeighbors();
	}

	private void setNeighbors() {
		for (ArrayList<Cell> row : board)
			for (Cell cell : row) {
				addAllNeighbors(cell);
			}
	}

	private void addAllNeighbors(Cell cell) {
		int res = 0;
		for (int row = cell.getRow() - 1; row <= (cell.getRow() + 1); row++) {
			for (int col = cell.getColumn() - 1; col <= (cell.getColumn() + 1); col++) {

				if (isValidPositionLC(row, col) && !(row == cell.getRow() && col == cell.getColumn()))
					// && isMine(row, col) && !(row == cell.getRow()) && !(col == cell.getRow())
					cell.addNeighbor(getCell(row, col));
			}
		}
	}
//	public double getDifficulte() {
//		return difficulte;
//	}
//
//	public void setDifficulte(double difficulte) {
//		this.difficulte = difficulte;
//	}

//	public Color getColorSweeper() {
//		return colorSweeper;
//	}
//
//	public void setColorSweeper(Color color) {
//		this.colorSweeper = color;
//	}

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
		if (isValidPositionLC(line, column))
			return getCell(line, column).getIsRevealed();
		return false;
	}

	public boolean isMine(int line, int column) {
		if (isValidPositionLC(line, column))
			return getCell(line, column).getIsMine();
		return false;
	}

	public void reveal(int line, int column) {
		boolean isIt = isMine(line, column);
		if (isIt) {
			gameOver = true;
			for (ArrayList<Cell> row : board) {
				for (Cell cell : row)
					cell.reveal();
			}
		}
		getCell(line, column).reveal();
		nbRevealed++;
		if (nbRevealed == nbBlanks) {
			gameWin = true;
		}
	}

	public Cell getCell(int line, int column) {
		if (isValidPositionLC(line, column))
			return board.get(line - 1).get(column - 1);
		return null;
	}

	public void select(int line, int column) {
		getCell(line, column).setSelected(true);
	}

//	public void deselect(int line, int column) {
//		board.get(line).get(column).setSelected(false);
//	}

	public boolean isGameOver() {
		return gameOver;
	}

	public boolean isValidPositionLC(int line, int column) {
		boolean lineCheck = line <= nbLines && line > 0;
		boolean columnCheck = column <= nbColumns && column > 0;
		if (lineCheck && columnCheck)
			return true;
		return false;
	}

	public boolean isOver() {
		return gameOver || gameWin;
	}

	public boolean isWin() {
		return gameWin;
	}

	public void updateScore() {
		int nbRevealedTmp = 0;
		for (ArrayList<Cell> row : board)
			for (Cell cell : row)
				if (cell.isRevealed())
					nbRevealedTmp++;
		nbRevealed = nbRevealedTmp;
		score = nbRevealed;
		if (nbRevealed == nbBlanks)
			gameWin = true;
	}

	public void flag(int line, int column) {
		// TODO Auto-generated method stub
		if (getCell(line, column).isFlagged())
			getCell(line, column).setFlagged(false);
		else {
			getCell(line, column).setFlagged(true);
		}

	}

	public boolean isFlagged(int line, int column) {
		return getCell(line, column).isFlagged();
	}

	public double getDifficulty() {
		return this.difficulty;
	}

}
