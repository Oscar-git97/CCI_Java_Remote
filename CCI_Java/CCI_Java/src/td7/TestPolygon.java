package td7;

public class TestPolygon {

	public static void main(String[] args) {
		Point pointA = new Point("A", 1, 2);
		Point pointB = new Point("B", 3, 4);
		Point pointC = new Point("C", 5, 6);
		
		Polygon poli = new Polygon("Triangle");
		poli.addPoint(pointA);
		poli.addPoint(pointB);
		poli.addPoint(pointC);
		
		System.out.println(poli);
		
		System.out.println(poli.scale(5));

	}

}
