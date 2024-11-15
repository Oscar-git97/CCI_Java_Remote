package td7;

public class Point {
	String name;
	private double x;
	private double y;

	public Point() {
		this(null, 0, 0);
	}

	public Point(String name, double x, double y) {
		this.name = name;
		this.x = x;
		this.y = y;
	}

	public Point scale(double k) {
		return new Point(name + "'", k * x, k * y);
	}

	@Override
	public String toString() {
		return name + "(" + x + ";" + y + ")";
	}

	public String getName() {
		return name;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	public Point translate(double dx, double dy) {
		return new Point(name+"'", x + dx, y+dy);
	}

	
}
