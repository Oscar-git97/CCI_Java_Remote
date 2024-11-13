package tp4.minesweeperVersionFreestyle;

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
			g.setColor(Color.BLACK);
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
//		g.setColor(Color.CYAN);
//		g.fillRect(0, 0, this.carreWidth, this.carreHeight);
		for (int col = 0; col < this.nbColumns; col++)
			for (int row = 0; row < this.nbRows; row++) {
//
//				g.setColor(Color.BLUE);
//				g.fillRect(getCellX(col+1), getCellY(row+1), spaceHor, spaceVert);
				if (isSelected(row, col) && isMine(row, col)) {
					System.out.println("GAME OVER!!!");
					g.setColor(Color.CYAN);
					g.fillRect(0, 0, this.carreWidth, this.carreHeight);
				} else if (isSelected(row, col)) {
					g.setColor(Color.BLACK);
					g.fillRect(getCellX(col), getCellY(row), spaceHor, spaceVert);
				} else {
					g.setColor(Color.GRAY);
					g.fillRect(getCellX(col), getCellY(row), spaceHor, spaceVert);
				}
			}
//				
	}

	private void colorSelected(Graphics g) {
		// select and color
		this.selCol = this.minesweeper.selectedColumn;
		this.selLine = this.minesweeper.selectedLine;

		if (selCol == -1 && selLine == -1)
			System.out.println("aucune cellule n'est selectionnée !");
		else if (selCol == -1)
			System.out.println("aucune column n'est selectionnée !");
		else if (selLine == -1)
			System.out.println("aucune line n'est selectionnée !");
		else {
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
		return 0;
	}

	boolean isMine(int line, int column) {
		if (this.minesweeper.field[column][line] == 1)
			return true;
		return false;
	}

	boolean isEmpty(int line, int column) {
		if (isMine(line, column))
			return false;
		return true;
	}

	boolean isSelected(int line, int column) {
		if (this.minesweeper.opend[column][line] == 1)
			return true;
		return false;
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
