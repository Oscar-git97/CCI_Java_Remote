package tp5.v1;

import java.util.ArrayList;

public class TestArrayListOfCell2 {

	public static void main(String[] args) {
		Cell cell0 = new Cell(false, 1, 1);
		Cell cell1 = new Cell(true, 1, 1);
		Cell cell2 = new Cell(false, 1, 1);
		Cell cell3 = new Cell(true, 1, 1);

		cell2.setRevealed(true);
		cell3.setRevealed(true);

		ArrayList<Cell> cells = new ArrayList<Cell>();

		for (int column = 0; column < 4; column++) {

			Cell cell = new Cell(((int) (Math.random() + 0.5)) == 1, 1, 1);
			cell.isRevealed = ((int) (Math.random() + 0.5)) == 1;
			cells.add(cell);
		}
		System.out.println(cells);
//		for (Cell tmp : cells)
//			System.out.println(tmp);

	}

}
