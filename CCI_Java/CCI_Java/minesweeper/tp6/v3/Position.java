package tp6.v3;

import java.util.ArrayList;

public class Position {

	private int line;
	private int column;
	private ArrayList<Position> neighbors;

	public Position(int line, int column) {
		super();
		this.line = line;
		this.column = column;
		this.neighbors = new ArrayList<Position>();

		setNeighbors();
	}

	private void setNeighbors() {
		for (int ln = line - 1; ln < line + 1; ln++) {
			for (int cmn = column - 1; cmn < column + 1; cmn++) {
				if (ln != line && cmn != column)
					this.neighbors.add(new Position(ln, cmn));
			}
		}
	}

}
