package tp4.minesweeperVersionFreestyle;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

@SuppressWarnings("serial")
public class MinesweeperFrame extends JFrame {
	Minesweeper minesweeper;
	MinesweeperPanel minesweeperPanel;

	public MinesweeperFrame() {
		this.minesweeper = new Minesweeper();

		this.minesweeper.nbColumns = 5;
		this.minesweeper.nbLines = 5;
		this.minesweeper.score = 30;
		this.minesweeper.selectedLine = 1;
		this.minesweeper.selectedColumn = 1;
		this.minesweeper.field = new int [this.minesweeper.nbColumns][this.minesweeper.nbLines];
		this.minesweeper.opend = new int [this.minesweeper.nbColumns][this.minesweeper.nbLines];
		
		for(int col = 0;col < this.minesweeper.nbColumns; col++) {
			for(int row = 0;row< this.minesweeper.nbLines; row++) {
				double nb = Math.random()*2;
				this.minesweeper.field[col][row] = (int)nb;
				System.out.println((int)nb);
			}
		}

		this.minesweeperPanel = new MinesweeperPanel(minesweeper);
		add(minesweeperPanel);
		pack();
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);

	}
}