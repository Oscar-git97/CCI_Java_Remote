package tp4.minesweeperVersion2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.Scanner;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MinesweeperPanel extends JPanel {
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

		// grand rect

		this.nbColumns = this.minesweeper.nbColumns;
		this.nbRows = this.minesweeper.nbLines;

		this.carreWidth = (getWidth() - (spaceBorder * 2)) - ((getWidth() - (spaceBorder * 2)) % nbColumns);
		this.carreHeight = (getHeight() - (spaceBorder * 2)) - ((getHeight() - (spaceBorder * 2)) % nbRows);

		this.spaceHor = carreWidth / nbColumns;
		this.spaceVert = carreHeight / nbRows;

		int lineEndH = carreHeight + spaceBorder;
		int lineEndV = carreWidth + spaceBorder;

		colorField(g);

		// creating collumns
		int posH = spaceBorder;
		g.setColor(Color.BLACK);
		g.drawLine(spaceBorder, spaceBorder, spaceBorder, lineEndH);

		for (int idx = 1; idx <= nbColumns; idx++) {
			posH = (idx * spaceHor) + spaceBorder;
//			g.setColor(Color.BLACK);
			g.drawLine(posH, spaceBorder, posH, lineEndH);
		}

		// creating rows
		int posV = spaceBorder;
		g.setColor(Color.BLACK);
		g.drawLine(spaceBorder, spaceBorder, lineEndV, spaceBorder);

		for (int idx = 1; idx <= nbRows; idx++) {
			posV = (idx * spaceVert) + spaceBorder;
			g.setColor(Color.BLACK);
			g.drawLine(spaceBorder, posV, lineEndV, posV);
		}
//		g.setColor(Color.CYAN);
//		g.fillRect(0, 0, this.carreWidth, this.carreHeight);
		colorField(g);
		colorSelected(g);

	}

	private void colorField(Graphics g) {

		for (int col = 0; col < this.nbColumns; col++)
			for (int row = 0; row < this.nbRows; row++) {

				if (isSelected(row, col) && isMine(row, col)) {
//					g.fillRect(getCellX(col), getCellY(row), spaceHor, spaceVert);
					int sizeBomb = 25;
					g.setColor(Color.BLACK);
					g.fillOval(getCellX(col) + (spaceHor / 2) - (sizeBomb/2), getCellX(row) + (spaceVert / 2) - (sizeBomb/2), sizeBomb, sizeBomb);
				} else if (isSelected(row, col)) {
					g.setColor(Color.DARK_GRAY);
					g.fillRect(getCellX(col), getCellY(row), spaceHor, spaceVert);
				}
			}
//				
	}

	private void colorSelected(Graphics g) {
		// select and color
		this.selCol = this.minesweeper.selectedColumn;
		this.selLine = this.minesweeper.selectedLine;
		boolean eins = this.selCol < this.minesweeper.nbColumns;
		boolean zwei = this.selLine < this.minesweeper.nbLines;

		if (selCol == -1 && selLine == -1)
			System.out.println("aucune cellule n'est selectionnée !");
		else if (selCol == -1)
			System.out.println("aucune column n'est selectionnée !");
		else if (selLine == -1)
			System.out.println("aucune line n'est selectionnée !");
		else if (eins && zwei) {
//			int startSelCol = spaceBorder + (selCol * spaceHor);
//			int startSelRow = spaceBorder + (selLine * spaceVert);

			g.setColor(Color.RED);
			g.fillRect(getCellX(selCol), getCellY(selLine), spaceHor, spaceVert);
		}
	}

	public int getColumn(int x) {
		int posCarre = x - this.spaceBorder;

		this.selCol = posCarre / spaceHor;
//		if (posCarre % spaceHor > 0)
//			this.selCol++;
		return this.selCol;
	}

	public int getLine(int y) {
		int posCarre = y - this.spaceBorder;

		this.selLine = posCarre / spaceVert;
//		if (posCarre % spaceVert > 0)
//			this.selLine++;
		return this.selLine;
	}

	int getBoardBorder() {
		return this.spaceBorder;
	}

	boolean isMine(int line, int column) {
		return this.minesweeper.board.get(line).get(column).isMine;
	}

	boolean isEmpty(int line, int column) { // inutil --> la meme que isMine
		return !isMine(line, column);
	}

	boolean isBlack(int line, int column) {

		return false;
	}

	boolean isGray(int line, int column) {

		return false;
	}

	boolean isSelected(int line, int column) {
		return this.minesweeper.board.get(line).get(column).isRevealed;
	}

	int getCellX(int column) {
		return (this.spaceBorder + (column * this.spaceHor));
	}

	int getCellY(int line) {
		return (this.spaceBorder + (line * this.spaceVert));
	}

	int getCellWidth() {
		return 0;
	}

	int getCellHeight() {
		return 0;
	}

	void drawCell(Graphics g, int line, int column) {

	}
}
