package tp4.minesweeperVersion3oneByeOne;

import java.awt.Graphics;

public interface MinesweeperPanelable {

	public int getBoardBorder();
	public boolean isBlackCell(int line, int column);
	public boolean isGrayCell(int line, int column);
	public boolean isSelected(int line, int column);
	public int getCellX(int column);
	public int getCellY(int line);
	public int getCellWidth();
	public int getCellHeight();
	public void drawCell(Graphics g, int line, int column);
	public int getColumn(int x);
	public int getLine(int y);
	
}
