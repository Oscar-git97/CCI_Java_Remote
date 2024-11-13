package tp3.minesweeperVersion3;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class PanelMouseListener extends MouseAdapter {
	MinesweeperPanel panel;

	public PanelMouseListener(MinesweeperPanel panel) {
		this.panel = panel;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		//System.out.println("Clicked " + e.getX() + " " + e.getY());
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		//System.out.println("Moved " + e.getX() + " " + e.getY());
		
		panel.minesweeper.selectedLine = panel.getLine(e.getY());
		panel.minesweeper.selectedColumn = panel.getColumn(e.getX());
		
		System.out.println("Line = " + panel.minesweeper.selectedLine); // e.getY());//
		System.out.println("Column = " + panel.minesweeper.selectedColumn); // e.getX()); //
		
		panel.repaint();
	}
}
