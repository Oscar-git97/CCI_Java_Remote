package tp3.minesweeperVersion2;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
@SuppressWarnings("serial")
public class MinesweeperFrame extends JFrame {
Minesweeper minesweeper;
MinesweeperPanel minesweeperPanel;
public MinesweeperFrame() {
this.minesweeper = new Minesweeper();

this.minesweeper.nbColumns = 15;
this.minesweeper.nbLines = 20;
this.minesweeper.score = 30;
this.minesweeper.selectedLine = 3;
this.minesweeper.selectedColumn = 8;

this.minesweeperPanel = new MinesweeperPanel(minesweeper);
add(minesweeperPanel);
pack();
setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
setVisible(true);


}}