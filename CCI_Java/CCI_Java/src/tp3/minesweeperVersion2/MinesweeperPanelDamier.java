package tp3.minesweeperVersion2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MinesweeperPanelDamier extends JPanel {
	Minesweeper minesweeper;
	int spaceHor;
	int spaceVert;
	public MinesweeperPanelDamier(Minesweeper minesweeper) {
		this.minesweeper = minesweeper;
		setPreferredSize(new Dimension(500, 500));
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		// grand rect

		int spaceBorder = 20;
		int nbColumns = 10;
		int nbRows = 10;

		int carreWidth = (getWidth() - (spaceBorder * 2)) - ((getWidth() - (spaceBorder * 2)) % nbColumns);
		int carreHeight = (getHeight() - (spaceBorder * 2)) - ((getHeight() - (spaceBorder * 2)) % nbRows);

		this.spaceHor = carreWidth / nbColumns;
		this.spaceVert = carreHeight / nbRows;
		
		int lineEndH = carreHeight + spaceBorder;
		int lineEndV = carreWidth + spaceBorder;

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

	}
}
