package tp6.v3;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.SwingUtilities;

public class PanelMouseListener extends MouseAdapter {
	MinesweeperPanel panel;

	public PanelMouseListener(MinesweeperPanel panel) {
		this.panel = panel;
	}

	@Override
	public void mouseClicked(MouseEvent e) {

//		System.out.println("Click Line = " + panel.minesweeper.selectedLine); 
//		System.out.println("Click Column = " + panel.minesweeper.selectedColumn); 

		if (panel.isValidPositionPx(e.getX(), e.getY()) && !panel.minesweeper.isOver()) {
			int line = panel.getLine(e.getY());
			int column = panel.getColumn(e.getX());
			if (SwingUtilities.isLeftMouseButton(e) && !panel.minesweeper.isFlagged(line, column)) {
				panel.minesweeper.reveal(line, column);
				if (!panel.minesweeper.isMine(line, column))
					panel.minesweeper.increaseScore();
			} else if (SwingUtilities.isRightMouseButton(e)) {
				panel.minesweeper.flag(line, column);
			}
				
			panel.repaint();
		}
	}

	@Override
	public void mouseMoved(MouseEvent e) {

//		panel.minesweeper.selectedLine = panel.getLine(e.getY());
//		panel.minesweeper.selectedColumn = panel.getColumn(e.getX());

		if (panel.isValidPositionPx(e.getX(), e.getY()) && !panel.minesweeper.isOver()) {
			int line = panel.getLine(e.getY());
			int column = panel.getColumn(e.getX());
			panel.minesweeper.select(line, column);
			panel.repaint();
		}

	}
}
