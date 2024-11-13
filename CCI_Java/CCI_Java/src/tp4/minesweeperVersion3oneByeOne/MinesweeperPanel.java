package tp4.minesweeperVersion3oneByeOne;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.Scanner;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MinesweeperPanel extends JPanel implements MinesweeperPanelable {
	Minesweeper minesweeper;
	int spaceHor;
	int spaceVert;
	int nbColumns;
	int nbRows;
	int selCol;
	int selLine;
	int carreWidth;
	int carreHeight;
	int spaceBorder;

	public MinesweeperPanel(Minesweeper minesweeper) {
		this.minesweeper = minesweeper;
		setPreferredSize(new Dimension(500, 500));
		addMouseListener(new PanelMouseListener(this));
		addMouseMotionListener(new PanelMouseListener(this));
		spaceBorder = 20;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		this.nbColumns = this.minesweeper.nbColumns;
		this.nbRows = this.minesweeper.nbLines;

		this.carreWidth = (getWidth() - (spaceBorder * 2)) - ((getWidth() - (spaceBorder * 2)) % nbColumns);
		this.carreHeight = (getHeight() - (spaceBorder * 2)) - ((getHeight() - (spaceBorder * 2)) % nbRows);

		this.spaceHor = carreWidth / nbColumns;
		this.spaceVert = carreHeight / nbRows;

		int lineEndH = carreHeight + spaceBorder;
		int lineEndV = carreWidth + spaceBorder;

		for (int idxRow = 0; idxRow < this.minesweeper.board.size(); idxRow++) {
			for (int idxCol = 0; idxCol < this.minesweeper.board.get(idxRow).size(); idxCol++) {
				drawCell(g, idxRow, idxCol);
			}
		}

	}

	public int getColumn(int x) {
		int posCarre = x - this.spaceBorder;
		this.selCol = posCarre / spaceHor;
		return this.selCol;
	}

	public int getLine(int y) {
		int posCarre = y - this.spaceBorder;
		this.selLine = posCarre / spaceVert;
		return this.selLine;
	}

	public int getBoardBorder() {
		return this.spaceBorder;
	}

	@Override
	public boolean isBlackCell(int line, int column) {
		return this.minesweeper.board.get(line).get(column).isRevealed;
	}

	@Override
	public boolean isGrayCell(int line, int column) {
		return !this.minesweeper.board.get(line).get(column).isRevealed;
	}

	boolean isMine(int line, int column) {
		return this.minesweeper.board.get(line).get(column).isMine;
	}

	public boolean isSelected(int line, int column) {
		return (line == this.selLine && column == this.selCol);
	}

	public int getCellX(int column) {
		return (this.spaceBorder + (column * this.spaceHor));
	}

	public int getCellY(int line) {
		return (this.spaceBorder + (line * this.spaceVert));
	}

	public int getCellWidth() {
		return this.spaceHor;
	}

	public int getCellHeight() {
		return this.spaceVert;
	}

	public void drawCell(Graphics g, int line, int column) {

		g.setColor(Color.BLACK);
		g.drawRect(getCellX(column), getCellY(line), getCellWidth(), getCellHeight());
		
		if(isSelected(line, column)) {
			g.setColor(Color.RED);
			g.fillRect(getCellX(column), getCellY(line), getCellWidth(), getCellHeight());
		} else if (isBlackCell(line, column) && isMine(line, column)) {
			int sizeBomb = 25;
			g.setColor(Color.BLACK);
			g.fillOval(getCellX(column) + (getCellWidth() / 2) - (sizeBomb / 2),
					getCellX(line) + (getCellHeight() / 2) - (sizeBomb / 2), sizeBomb, sizeBomb);
		} else if (isBlackCell(line, column)) {
			g.setColor(Color.DARK_GRAY);
			g.fillRect(getCellX(column), getCellY(line), getCellWidth(), getCellHeight());
		}
	}

}
