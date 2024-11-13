package projet.tp1.version1;
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

		g.setColor(Color.RED);
		g.drawLine(getWidth()/2, getHeight()/2, getWidth(), getHeight());

		g.setColor(Color.BLUE);
		g.drawLine(getWidth(), 0, getWidth() / 2, getHeight() / 2);
		
		g.setColor(Color.BLACK);
		g.drawLine(0, 0, getWidth() / 2, getHeight() / 2);
		
		g.setColor(Color.CYAN);
		g.drawLine(0, getHeight(), getWidth() / 2, getHeight() / 2);
		
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(200, 200, 30, 30);
		
		g.setColor(Color.GRAY);
		g.drawRect(200, 200, 30, 30);
		
		
	}
}
