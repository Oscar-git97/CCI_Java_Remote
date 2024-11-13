package tp6.v3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
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

	static JMenuBar mb;

	static JMenu menu;

	static JMenuItem size, difficulte, color;

	static JFrame f;

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

		this.nbColumns = this.minesweeper.getNbColumns();
		this.nbRows = this.minesweeper.getNbLines();

		this.carreWidth = (getWidth() - (getBoardBorder() * 2)) - ((getWidth() - (getBoardBorder() * 2)) % nbColumns);
		this.carreHeight = (getHeight() - (getBoardBorder() * 2)) - ((getHeight() - (getBoardBorder() * 2)) % nbRows);

		this.spaceHor = carreWidth / nbColumns;
		this.spaceVert = carreHeight / nbRows;

		int lineEndH = carreHeight + getBoardBorder();
		int lineEndV = carreWidth + getBoardBorder();

		for (int idxRow = 0; idxRow < this.minesweeper.getNbLines(); idxRow++) {
			for (int idxCol = 0; idxCol < this.minesweeper.getNbColumns(); idxCol++) {
				Cell tmp = this.minesweeper.getCell(idxRow, idxCol);
//				drawCell(g, idxRow, idxCol);
				drawCell(g, tmp);
				tmp.setSelected(false);
			}
		}

		// show score
		g.setColor(Color.darkGray);
		g.setFont(new Font("Ariel", Font.BOLD, spaceBorder - 3));
		g.drawString("Score : " + this.minesweeper.getScore(), (getWidth() / 2) - 40, (spaceBorder - 3));

	}

	public void drawCell(Graphics g, int line, int column) {

		g.setColor(Color.BLACK);
		g.drawRect(getCellX(column), getCellY(line), getCellWidth(), getCellHeight());
		Cell tmp = this.minesweeper.getCell(line, column);
		g.setColor(tmp.getColor());
		g.fillRect(getCellX(column), getCellY(line), getCellWidth(), getCellHeight());

		if (tmp.getIsRevealed() && tmp.getIsMine()) {
			int sizeBomb = 25;
			g.setColor(Color.BLACK);
			g.fillOval(getCellX(column) + (getCellWidth() / 2) - (sizeBomb / 2),
					getCellX(line) + (getCellHeight() / 2) - (sizeBomb / 2), sizeBomb, sizeBomb);
		}
	}

	public void drawCell(Graphics g, Cell tmp) {

		g.setColor(Color.BLACK);
		int xTmp = getCellX(tmp.getColumn());
		int yTmp = getCellY(tmp.getRow());
		g.drawRect(xTmp, yTmp, getCellWidth(), getCellHeight());

		if (tmp.isSelected) {
			g.setColor(Color.RED);
			g.fillRect(xTmp, yTmp, getCellWidth(), getCellHeight());
		} else if (tmp.toString().equals("B")) {
			g.setColor(Color.RED);
			g.fillRect(xTmp, yTmp, getCellWidth(), getCellHeight());
			g.setColor(Color.WHITE);
			g.drawRect(xTmp, yTmp, getCellWidth(), getCellHeight());
			int sizeBomb = 25;
			g.setColor(Color.BLACK);
			g.fillOval(xTmp + (getCellWidth() / 2) - (sizeBomb / 2), yTmp + (getCellHeight() / 2) - (sizeBomb / 2),
					sizeBomb, sizeBomb);
		} else if (tmp.toString().equals("C")) {
			g.setColor(Color.DARK_GRAY);
			g.fillRect(xTmp, yTmp, getCellWidth(), getCellHeight());
		} else {
			g.setColor(Color.GRAY);
			g.fillRect(xTmp, yTmp, getCellWidth(), getCellHeight());
			g.setColor(Color.BLACK);
			g.setFont(new Font("Ariel", Font.BOLD, 35));
			g.drawString(String.valueOf(tmp.getNeighbors()), xTmp + 15, (yTmp + getCellHeight() - 10));
		}
	}

	public int getColumn(int x) {
		boolean condX = x > getBoardBorder() && x < (getBoardBorder() + (this.nbColumns * getCellWidth()));
		if (condX) {
			int posCarre = x - getBoardBorder();
			this.selCol = posCarre / getCellWidth();
			return this.selCol;
		}
		return -1;
	}

	public int getLine(int y) {

		boolean condY = y > getBoardBorder() && y < (getBoardBorder() + (this.nbRows * getCellHeight()));
		if (condY) {
			int posCarre = y - getBoardBorder();
			this.selLine = posCarre / spaceVert;
			return this.selLine;
		}
		return -1;

	}

	public int getBoardBorder() {
		return this.spaceBorder;
	}

//	boolean isMine(int line, int column) {
//		return this.minesweeper.isMine(line, column);
//	}

	public int getCellX(int column) {
		return (getBoardBorder() + (column * getCellWidth()));
	}

	public int getCellY(int line) {
		return (getBoardBorder() + (line * getCellHeight()));
	}

	public int getCellWidth() {
		return this.spaceHor;
	}

	public int getCellHeight() {
		return this.spaceVert;
	}

	public boolean isValidPositionPx(int x, int y) {
		boolean condX = x > getBoardBorder() && x < (getBoardBorder() + (this.nbColumns * getCellWidth()));
		boolean condY = y > getBoardBorder() && y < (getBoardBorder() + (this.nbRows * getCellHeight()));
		if (condX && condY)
			return true;
		return false;
	}

	@Override
	public void drawMinesweeper(Graphics g) {

	}

}
