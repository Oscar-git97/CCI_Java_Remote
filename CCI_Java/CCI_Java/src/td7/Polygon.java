package td7;

import java.util.ArrayList;

public class Polygon {
	private String name;
	private ArrayList<Point> points;

	public Polygon() {
		this(null);
	}

	public Polygon(String name) {
		this.name = name;
		this.points = new ArrayList<Point>();
	}
	
	public void addPoint(Point p) {
		points.add(p);
	}
	
	public int getPointsSize() {
		return points.size();
	}
	
	public Point getPoint(int idx) {
		return points.get(idx);
	}

	public String getName() {
		return name;
	}
	
	public String toString() {
		String res = name + ": ";
		for(Point p : points) {
			res += p.toString() + ", ";
		}
		return res;
	}
	
	public Polygon scale(double k) {
		
		Polygon polyScaled = new Polygon(name+"'");
		for(Point p : points) {
			polyScaled.addPoint(p.scale(k));
		}
		
		return polyScaled;
	}
}
