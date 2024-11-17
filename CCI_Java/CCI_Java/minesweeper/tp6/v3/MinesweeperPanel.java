package tp6.v3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
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
	private Color colorSweeper;

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
		this.colorSweeper = Color.RED;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		if (!this.minesweeper.isOver())
			this.minesweeper.updateScore();
		this.nbColumns = this.minesweeper.getNbColumns();
		this.nbRows = this.minesweeper.getNbLines();

		this.carreWidth = (getWidth() - (getBoardBorder() * 2)) - ((getWidth() - (getBoardBorder() * 2)) % nbColumns);
		this.carreHeight = (getHeight() - (getBoardBorder() * 2)) - ((getHeight() - (getBoardBorder() * 2)) % nbRows);

		this.spaceHor = carreWidth / nbColumns;
		this.spaceVert = carreHeight / nbRows;

		for (int idxRow = 1; idxRow <= this.minesweeper.getNbLines(); idxRow++) {
			for (int idxCol = 1; idxCol <= this.minesweeper.getNbColumns(); idxCol++) {
				Cell tmp = this.minesweeper.getCell(idxRow, idxCol);
//				drawCell(g, idxRow, idxCol);
				drawCell(g, tmp);
				tmp.setSelected(false);
			}
		}

		// show score
		String banner = "Difficulty : " + this.minesweeper.getDifficulty() + "     Score : "
				+ this.minesweeper.getScore();
		int fontSize = spaceBorder - 6;
		Font font = new Font("Ariel", Font.BOLD, fontSize);
		FontMetrics metricsBanner = g.getFontMetrics(font);

		int xBanner = (getWidth() - metricsBanner.stringWidth(banner)) / 2;
		g.setColor(Color.darkGray);
		g.setFont(font);
		g.drawString(banner, xBanner, (spaceBorder - 3));

		if (this.minesweeper.isGameOver())
			drawGameOver(g);
		else if (this.minesweeper.isWin())
			drawWin(g);
	}

	private void drawWin(Graphics g) {
		int fontSize = (getHeight() + getWidth()) / (2 * 3 * 2);
		Font font = new Font("Ariel", Font.BOLD, fontSize);
		FontMetrics metrics = g.getFontMetrics(font);

		g.setColor(Color.CYAN);
		g.fillRect(0, fontSize * 2, getWidth(), fontSize * 2);// fontSize * 2
		String gg = "GG, U WIN!";
		int xGame = (getWidth() - metrics.stringWidth(gg)) / 2;
		String score = "Score : " + this.minesweeper.getScore();
		int xScore = (getWidth() - metrics.stringWidth(score)) / 2;
		g.setColor(Color.BLACK);
		g.setFont(font);
		g.drawString(gg, xGame, fontSize * 3);
		g.drawString(score, xScore, (fontSize * 4) - getHeight() / 22);
		System.out.println("You've won! Choose a difficulty to restart the game.");

	}

	private void drawGameOver(Graphics g) {

		int fontSize = (getHeight() + getWidth()) / (2 * 3 * 2);
		Font font = new Font("Ariel", Font.BOLD, fontSize);
		FontMetrics metrics = g.getFontMetrics(font);

		g.setColor(Color.CYAN);
		g.fillRect(0, fontSize * 2, getWidth(), fontSize * 2);// fontSize * 2
		String gg = "GAME OVER!";
		int xGame = (getWidth() - metrics.stringWidth(gg)) / 2;
		String score = "Score : " + this.minesweeper.getScore();
		int xScore = (getWidth() - metrics.stringWidth(score)) / 2;
		g.setColor(Color.BLACK);
		g.setFont(font);
		g.drawString(gg, xGame, fontSize * 3);
		g.drawString(score, xScore, (fontSize * 4) - getHeight() / 22);
		System.out.println("You've lost! Choose a difficulty to restart the game.");
	}

//	@Deprecated
//	public void drawCell(Graphics g, int line, int column) {
//
//		g.setColor(Color.BLACK);
//		g.drawRect(getCellX(column), getCellY(line), getCellWidth(), getCellHeight());
//		Cell tmp = this.minesweeper.getCell(line, column);
//		g.setColor(tmp.getColor());
//		g.fillRect(getCellX(column), getCellY(line), getCellWidth(), getCellHeight());
//
//		if (tmp.getIsRevealed() && tmp.getIsMine()) {
//			int sizeBomb = 25;
//			g.setColor(Color.BLACK);
//			g.fillOval(getCellX(column) + (getCellWidth() / 2) - (sizeBomb / 2),
//					getCellX(line) + (getCellHeight() / 2) - (sizeBomb / 2), sizeBomb, sizeBomb);
//		}
//	}

	public void drawCell(Graphics g, Cell tmp) {

		g.setColor(Color.BLACK);
		int xTmp = getCellX(tmp.getColumn());
		int yTmp = getCellY(tmp.getRow());
		g.drawRect(xTmp, yTmp, getCellWidth(), getCellHeight());

		if (tmp.isFlagged()) {
			g.setColor(Color.DARK_GRAY);
			g.fillRect(xTmp, yTmp, getCellWidth(), getCellHeight());
			g.setColor(Color.WHITE);
			g.drawRect(xTmp, yTmp, getCellWidth(), getCellHeight());
			int sizeBomb = (getCellWidth() + getCellHeight()) / 5;
			g.setColor(Color.GREEN);
			g.fillOval(xTmp + (getCellWidth() / 2) - (sizeBomb / 2), yTmp + (getCellHeight() / 2) - (sizeBomb / 2),
					sizeBomb, sizeBomb);
		} else if (tmp.isSelected()) {
			g.setColor(colorSweeper);
			g.fillRect(xTmp, yTmp, getCellWidth(), getCellHeight());
		} else if (tmp.toString().equals("B")) {
			g.setColor(Color.RED);
			g.fillRect(xTmp, yTmp, getCellWidth(), getCellHeight());
			g.setColor(Color.WHITE);
			g.drawRect(xTmp, yTmp, getCellWidth(), getCellHeight());
			int sizeBomb = (getCellWidth() + getCellHeight()) / 5;
			g.setColor(Color.BLACK);
			g.fillOval(xTmp + (getCellWidth() / 2) - (sizeBomb / 2), yTmp + (getCellHeight() / 2) - (sizeBomb / 2),
					sizeBomb, sizeBomb);
		} else if (tmp.toString().equals("C")) {
			g.setColor(Color.DARK_GRAY);
			g.fillRect(xTmp, yTmp, getCellWidth(), getCellHeight());
		} else {
			g.setColor(Color.GRAY);
			g.fillRect(xTmp, yTmp, getCellWidth(), getCellHeight());
			if (tmp.getNeighbors() != 0) {
				g.setColor(Color.BLACK);
				g.setFont(new Font("Ariel", Font.BOLD, getCellHeight() / 2));
				g.drawString(String.valueOf(tmp.getNeighbors()), xTmp + 15, (yTmp + getCellHeight() - 10));
			}
		}
	}

	public int getColumn(int x) {
		int posCarre = x - getBoardBorder();
		this.selCol = posCarre / getCellWidth();
		return this.selCol + 1;
	}

	public int getLine(int y) {
		int posCarre = y - getBoardBorder();
		this.selLine = posCarre / spaceVert;
		return this.selLine + 1;
	}

	public int getBoardBorder() {
		return this.spaceBorder;
	}

	public int getCellX(int column) {
		return (getBoardBorder() + ((column - 1) * getCellWidth()));
	}

	public int getCellY(int line) {
		return (getBoardBorder() + ((line - 1) * getCellHeight()));
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

	public void setColorSweeper(Color colorSweeper) {
		this.colorSweeper = colorSweeper;
	}

}
