package projet.tp2.version1;
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
		int cellX = 10;
		int cellY = 30;
		int cellWidth = 200;
		int cellHeight = 400;
		
		super.paintComponent(g);

		g.setColor(Color.RED);
		g.drawLine(0, 0, getWidth(), getHeight());

		g.setColor(Color.BLUE);
		g.drawLine(500, 0, getWidth() / 2, getHeight() / 2);
		
		g.setColor(Color.BLACK);
		g.drawRect(100, 200, 30, 50);
		
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(200, 200, 30, 30);
		
		g.setColor(Color.GRAY);
		g.drawRect(cellX, cellY, cellWidth, cellHeight);
	}
}
