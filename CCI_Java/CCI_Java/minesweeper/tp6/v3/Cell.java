package tp6.v3;

import java.awt.Color;

public class Cell {
	private boolean isRevealed;
	private boolean isMine;
	boolean isSelected;
	Color color;
	private int row;
	private int column;
	private boolean active;
	private int neighbors;

	public Cell(boolean isMine, int row, int column) {
		this.isRevealed = false;
		this.isSelected = false;
		this.color = Color.GRAY;
		this.isMine = isMine;
		this.row = row;
		this.column = column;
		this.active = true;
	}

	private void refreshColor() {

		if (this.isSelected)
			this.color = Color.RED;
		else if (!this.isRevealed)
			this.color = Color.DARK_GRAY;
		else if (!this.isRevealed)
			this.color = Color.lightGray;
	}

	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}

	public void setRevealed(boolean status) {
		this.isRevealed = status;
		this.active = false;

		if (status && !this.isMine)
			this.color = Color.DARK_GRAY;
	}
	
	public void reveal() {
		this.isRevealed = true;
	}

	public boolean getIsRevealed() {
		return isRevealed;
	}
	
	public void setMine(boolean isMine) {
		this.isMine = isMine;
	}
	
	public void setNeighbors(int neighbors) {
		this.neighbors = neighbors;
	}
	
	public int getNeighbors() {
		return neighbors;
	}

	public boolean getIsSelected() {
		return isSelected;
	}

	public Color getColor() {
		if (!isRevealed)
			refreshColor();
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public boolean isRevealed() {
		return isRevealed;
	}

	public boolean getIsMine() {
		return isMine;
	}
	
	public void setActive(boolean active) {
		this.active = active;
	}
	
	public int getColumn() {
		return column;
	}
	
	public int getRow() {
		return row;
	}
	
	@Override
	public String toString() {
		if(!isRevealed)
			return "C";
		else if (isMine)
			return "B";
		return "V";
	}

	
}
