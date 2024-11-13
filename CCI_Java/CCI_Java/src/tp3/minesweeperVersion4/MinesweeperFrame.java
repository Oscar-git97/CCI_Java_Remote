package tp3.minesweeperVersion4;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

@SuppressWarnings("serial")
public class MinesweeperFrame extends JFrame {
	Minesweeper minesweeper;
	MinesweeperPanel minesweeperPanel;

	public MinesweeperFrame() {
		this.minesweeper = new Minesweeper();

		this.minesweeper.nbColumns = 25;
		this.minesweeper.nbLines = 25;
		this.minesweeper.score = 30;
		this.minesweeper.selectedLine = 3;
		this.minesweeper.selectedColumn = 8;
		this.minesweeper.field = new int [this.minesweeper.nbColumns][this.minesweeper.nbLines];
		this.minesweeper.opend = new int [this.minesweeper.nbColumns][this.minesweeper.nbLines];

		this.minesweeperPanel = new MinesweeperPanel(minesweeper);
		add(minesweeperPanel);
		pack();
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);

	}
}