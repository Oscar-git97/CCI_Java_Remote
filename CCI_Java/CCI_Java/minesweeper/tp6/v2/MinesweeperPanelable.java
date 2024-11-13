package tp6.v2;

import java.awt.Graphics;

public interface MinesweeperPanelable {

	public int getBoardBorder();
	public int getCellX(int column);
	public int getCellY(int line);
	public int getCellWidth();
	public int getCellHeight();
	public void drawCell(Graphics g, int line, int column);
	public int getColumn(int x);
	public int getLine(int y);
	void drawMinesweeper(Graphics g);
	
}
