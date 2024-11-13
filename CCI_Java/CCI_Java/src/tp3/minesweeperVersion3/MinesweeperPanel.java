package tp3.minesweeperVersion3;

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
			int startSelCol = spaceBorder + (selCol * spaceHor);
			int startSelRow = spaceBorder + (selLine * spaceVert);

			g.setColor(Color.RED);
			g.fillRect(startSelCol, startSelRow, spaceHor, spaceVert);
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
}
