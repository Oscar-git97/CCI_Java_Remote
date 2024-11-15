package tp2.minesweeperVersion1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MinesweeperPanel extends JPanel {
	Minesweeper minesweeper;

	public MinesweeperPanel(Minesweeper minesweeper) {
		this.minesweeper = minesweeper;
		setPreferredSize(new Dimension(500, 500));
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
//		g.setColor(Color.RED);
//		g.drawLine(0, 0, getWidth(), getHeight());
//		g.setColor(Color.BLUE);
//		g.drawLine(getWidth(), getHeight(), getWidth() / 2, getHeight() / 2);

// grand rect
		
		int spaceBorder = 20;
		int nbColumns = 5;
		int nbRows = 5;
		
		int maxWidth = (getWidth() - spaceBorder) - ((getWidth() - spaceBorder) % nbColumns);
		int maxHeight = (getHeight() - spaceBorder) - ((getHeight() - spaceBorder) % nbRows);
		
		int spaceHor = (getWidth() - (spaceBorder*2)) / nbColumns;
		int spaceVert = (getHeight() - (spaceBorder*2)) / nbRows;
		// 
		int posV = 0;
		for(int idx = 1; idx <= nbRows; idx++) {
			posV = (idx * spaceVert);
			g.setColor(Color.BLACK);
			g.drawLine(20, posV, getWidth() - 20, posV);
		}
		
		
		int posH = 0;
		for(int idx = 1; idx <= nbColumns; idx++) {
			posH = (idx * spaceHor);
			g.setColor(Color.BLACK);
			g.drawLine(posH, 20, posH, getHeight() - 20);
		}
		
	}
}
