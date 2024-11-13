package tp5.v1;

public class testCell {

	public static void main(String[] args) {
		Cell cell0 = new Cell(false, 1, 1);
		Cell cell1 = new Cell(true, 1, 1);
		Cell cell2 = new Cell(false, 1, 1);
		Cell cell3 = new Cell(true, 1, 1);

		cell2.setRevealed(true);
		cell3.setRevealed(true);
		System.out.println(cell0.toString() + cell1 + cell2 + cell3);

	}

}
