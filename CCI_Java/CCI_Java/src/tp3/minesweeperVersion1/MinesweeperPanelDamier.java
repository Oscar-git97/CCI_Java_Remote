package tp3.minesweeperVersion1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MinesweeperPanelDamier extends JPanel {
	Minesweeper minesweeper;

	public MinesweeperPanelDamier(Minesweeper minesweeper) {
		this.minesweeper = minesweeper;
		setPreferredSize(new Dimension(500, 500));
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.RED);
		g.drawLine(0, 0, getWidth(), getHeight());
		g.setColor(Color.BLUE);
		g.drawLine(getWidth(), getHeight(), getWidth() / 2, getHeight() / 2);

// grand rect
		int widthHouse = getWidth() / 3;
		int heightHouse = getHeight() / 3;
		int xMid = getWidth() / 2;
		int yMid = getHeight() / 2;
		int unten = yMid + (heightHouse / 2) ;
		int oben = yMid - heightHouse / 2;
		int links = xMid - widthHouse / 2;
		int rechts = xMid + (widthHouse / 2);
		// house
		g.setColor(Color.YELLOW);
		g.fillRect(links,
				   oben,
				   widthHouse,
				   heightHouse);
		g.setColor(Color.BLACK);
		g.drawRect(links,
				   oben,
				   widthHouse,
				   heightHouse);
		
		g.setColor(Color.BLACK);
		g.drawLine(links, oben, rechts - widthHouse / 2, oben - heightHouse / 2);
		g.setColor(Color.BLACK);
		g.drawLine(rechts, oben, links + widthHouse / 2, oben - heightHouse / 2);
////port
//		g.setColor(Color.LIGHT_GRAY);
//		g.fillRect(200, 200, 30, 30);
//		g.setColor(Color.GRAY);
//		g.drawRect(200, 200, 30, 30);

// g.setColor(Color.BLUE);
		g.setColor(Color.RED);
		g.drawLine(links, oben, rechts, oben);
		
		// Oval getWidth()   getHeight()
		g.setColor(Color.RED);
		g.drawOval(0, 100, 10, 10);
	}
}
