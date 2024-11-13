package projet.tp2.version1;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

@SuppressWarnings("serial")
public class MinesweeperFrame extends JFrame {
	Minesweeper minesweeper;
	MinesweeperPanel minesweeperPanel;

	public MinesweeperFrame() {
		this.minesweeper = new Minesweeper();
		this.minesweeperPanel = new MinesweeperPanel(minesweeper);
		add(minesweeperPanel);
		pack();
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
