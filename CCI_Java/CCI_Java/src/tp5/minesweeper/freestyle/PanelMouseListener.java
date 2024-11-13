package tp5.minesweeper.freestyle;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class PanelMouseListener extends MouseAdapter {
	MinesweeperPanel panel;

	public PanelMouseListener(MinesweeperPanel panel) {
		this.panel = panel;
	}

	@Override
	public void mouseClicked(MouseEvent e) {

//		System.out.println("Click Line = " + panel.minesweeper.selectedLine); 
//		System.out.println("Click Column = " + panel.minesweeper.selectedColumn); 
		int line = panel.getLine(e.getY());
		int column = panel.getColumn(e.getX());
		panel.minesweeper.board.get(line).get(column).isRevealed = true;
//		panel.minesweeper.score--;
		panel.repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
//		panel.minesweeper.selectedLine = panel.getLine(e.getY());
//		panel.minesweeper.selectedColumn = panel.getColumn(e.getX());
		
		try {
			int line = panel.getLine(e.getY());
			int column = panel.getColumn(e.getX());
			if (!panel.isOutOfBounds(line, column)) {
				panel.minesweeper.board.get(line).get(column).setSelected(true);
				panel.repaint();
			}
		} catch (Exception e2) {
			// TODO: handle exception
//			e2.printStackTrace();
		}
		
		
		
//		System.out.println("Line = " + panel.minesweeper.selectedLine); 
//		System.out.println("Column = " + panel.minesweeper.selectedColumn); 
		
		
	}
}
