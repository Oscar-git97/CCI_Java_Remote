package tp4.minesweeperVersion2;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class PanelMouseListener extends MouseAdapter {
	MinesweeperPanel panel;

	public PanelMouseListener(MinesweeperPanel panel) {
		this.panel = panel;
	}

	@Override
	public void mouseClicked(MouseEvent e) {

		System.out.println("Click Line = " + panel.minesweeper.selectedLine); // e.getY());//
		System.out.println("Click Column = " + panel.minesweeper.selectedColumn); // e.getX()); //
		
		panel.minesweeper.board.get(panel.getLine(e.getY())).get(panel.getColumn(e.getX())).isRevealed = true;
		panel.repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
		panel.minesweeper.selectedLine = panel.getLine(e.getY());
		panel.minesweeper.selectedColumn = panel.getColumn(e.getX());
		
		System.out.println("Line = " + panel.minesweeper.selectedLine); // e.getY());//
		System.out.println("Column = " + panel.minesweeper.selectedColumn); // e.getX()); //
		
		panel.repaint();
	}
}
