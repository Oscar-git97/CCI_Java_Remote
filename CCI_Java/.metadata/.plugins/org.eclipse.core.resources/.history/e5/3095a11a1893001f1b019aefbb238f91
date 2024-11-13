package tp5.minesweeper.version1;

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
				drawCell(g, idxRow, idxCol);
			}
		}

	}

	public int getColumn(int x) {
		int posCarre = x - getBoardBorder();
		this.selCol = posCarre / getCellWidth();
		return this.selCol;
	}

	public int getLine(int y) {
		int posCarre = y - getBoardBorder();
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

	public boolean isRedCell(int line, int column) {
		return (line == this.selLine && column == this.selCol);
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

	public void drawCell(Graphics g, int line, int column) {

		g.setColor(Color.BLACK);
		g.drawRect(getCellX(column), getCellY(line), getCellWidth(), getCellHeight());

		if (isRedCell(line, column)) {
			g.setColor(this.minesweeper.getColor());
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

	@Override
	public void drawMinesweeper(Graphics g) {

	}

}
