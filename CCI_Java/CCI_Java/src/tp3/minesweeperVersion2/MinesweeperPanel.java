package tp3.minesweeperVersion2;

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
		
		int nbColumns = this.minesweeper.nbColumns;
		int nbLines = this.minesweeper.nbLines;
		int selCol = this.minesweeper.selectedColumn;
		int selLine = this.minesweeper.selectedLine;
		
		
		int spaceBorder = 20;
		int spaceHor = (getWidth() - (spaceBorder*2)) / nbColumns;
		int spaceVert = (getHeight() - (spaceBorder*2)) / nbLines;
		
		// creating rows
		int posV = 0;
		for(int idx = 1; idx <= nbLines; idx++) {
			posV = (idx * spaceVert);
			g.setColor(Color.BLACK);
			g.drawLine(spaceBorder, posV + spaceBorder, getWidth() - spaceBorder, posV + spaceBorder);
		}
		
		// creating collumns
		int posH = 0;
		for(int idx = 1; idx <= nbColumns; idx++) {
			posH = (idx * spaceHor);
			g.setColor(Color.BLACK);
			g.drawLine(posH + spaceBorder, spaceBorder, posH + spaceBorder, getHeight() - spaceBorder);
				
		}
		
		int startSelCol = spaceBorder + (selCol * spaceHor);
		int startSelRow = spaceBorder + (selLine * spaceVert);
		
		g.setColor(Color.RED);
		g.fillRect(startSelCol,
				   startSelRow,
				   spaceHor,
				   spaceVert);
	}
}
