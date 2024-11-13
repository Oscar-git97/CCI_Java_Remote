package tp5.minesweeper.freestyle;

import java.awt.Color;
import java.awt.Dimension;
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

		this.nbColumns = this.minesweeper.nbColumns;
		this.nbRows = this.minesweeper.nbLines;

		this.carreWidth = (getWidth() - (getBoardBorder() * 2)) - ((getWidth() - (getBoardBorder() * 2)) % nbColumns);
		this.carreHeight = (getHeight() - (getBoardBorder() * 2)) - ((getHeight() - (getBoardBorder() * 2)) % nbRows);

		this.spaceHor = carreWidth / nbColumns;
		this.spaceVert = carreHeight / nbRows;

		int lineEndH = carreHeight + getBoardBorder();
		int lineEndV = carreWidth + getBoardBorder();

		for (int idxRow = 0; idxRow < this.minesweeper.board.size(); idxRow++) {
			for (int idxCol = 0; idxCol < this.minesweeper.board.get(idxRow).size(); idxCol++) {
				Cell tmp = this.minesweeper.board.get(idxRow).get(idxCol);
				drawCell(g, idxRow, idxCol);
				tmp.setSelected(false);
			}
		}

	}

	public void drawCell(Graphics g, int line, int column) {

		g.setColor(Color.BLACK);
		g.drawRect(getCellX(column), getCellY(line), getCellWidth(), getCellHeight());
		Cell tmp = this.minesweeper.board.get(line).get(column);
		g.setColor(tmp.getColor());
		g.fillRect(getCellX(column), getCellY(line), getCellWidth(), getCellHeight());

		if (tmp.isRevealed && tmp.isMine) {
			int sizeBomb = 25;
			g.setColor(Color.BLACK);
			g.fillOval(getCellX(column) + (getCellWidth() / 2) - (sizeBomb / 2),
					getCellX(line) + (getCellHeight() / 2) - (sizeBomb / 2), sizeBomb, sizeBomb);
		}
	}

	public void drawCell(Graphics g, Cell tmp) {

		g.setColor(Color.BLACK);
		g.drawRect(getCellX(tmp.column), getCellY(tmp.row), getCellWidth(), getCellHeight());

		g.setColor(tmp.getColor());
		g.fillRect(getCellX(tmp.column), getCellY(tmp.row), getCellWidth(), getCellHeight());

		if (tmp.isRevealed && tmp.isMine) {
			int sizeBomb = 25;
			g.setColor(Color.BLACK);
			g.fillOval(getCellX(tmp.column) + (getCellWidth() / 2) - (sizeBomb / 2),
					getCellX(tmp.row) + (getCellHeight() / 2) - (sizeBomb / 2), sizeBomb, sizeBomb);
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

	@Override
	public boolean isBlackCell(int line, int column) {
		return this.minesweeper.board.get(line).get(column).getColor() == Color.DARK_GRAY;
	}

	@Override
	public boolean isGrayCell(int line, int column) {
		return this.minesweeper.board.get(line).get(column).getColor() == Color.GRAY;
	}

	public boolean isRedCell(int line, int column) {
		return this.minesweeper.board.get(line).get(column).getColor() == Color.RED;
	}

	boolean isMine(int line, int column) {
		return this.minesweeper.board.get(line).get(column).isMine;
	}

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

	public boolean isOutOfBounds(int x, int y) {
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
