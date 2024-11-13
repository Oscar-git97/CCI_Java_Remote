package tp5.minesweeper.version1;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.WindowConstants;

@SuppressWarnings("serial")
public class MinesweeperFrame extends JFrame {
	Minesweeper minesweeper;
	MinesweeperPanel minesweeperPanel;
	static JMenuBar mb;
	
	static JMenu menu, size, difficulte, color;
	
//	static JMenuItem size, difficulte, color;
	static JMenuItem size1, size2, size3, diff1, diff2, diff3,  color1, color2, color3 ;
	static JFrame f;

	public MinesweeperFrame() {
	
		mb = new JMenuBar();
		
		
		menu = new JMenu("menu");	
		size = new JMenu("size in pixel");
		difficulte = new JMenu("Mines/no mines");
		color = new JMenu("Color");
		
		
		
//		
//		size = new JMenuItem("size");
//		difficulte = new JMenuItem("difficulté");
//		color = new JMenuItem("color");
//		
		
		size1 = new JMenuItem("500");
		size2 = new JMenuItem("700");
		size3 = new JMenuItem("1000");
		
		size.add(size1);
		size.add(size2);
		size.add(size3);
		
		diff1 = new JMenuItem("50/50");
		diff2 = new JMenuItem("25/75");
		diff3 = new JMenuItem("75/25");
		
		difficulte.add(diff1);
		difficulte.add(diff2);
		difficulte.add(diff3);
		
		color1 = new JMenuItem("red");
		color2 = new JMenuItem("blue");
		color3 = new JMenuItem("black");
		
		color.add(color1);
		color.add(color2);
		color.add(color3);
		
		menu.add(size);
		menu.add(difficulte);
		menu.add(color);
		
		mb.add(menu);
		setJMenuBar(mb);
	
		this.minesweeper = new Minesweeper();

		this.minesweeperPanel = new MinesweeperPanel(minesweeper);
		add(minesweeperPanel);
		
		

		
		pack();
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);

	}
}