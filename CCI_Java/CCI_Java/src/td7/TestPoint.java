package td7;

public class TestPoint {

	public static void main(String[] args) {

		Point pointA = new Point("A", 3, 5);
		Point pointB = new Point("B", -6, 8);
		System.out.println(pointA + " " + pointB);
		System.out.println(pointA.scale(5) + " " + pointB.scale(5));
		

	}

}
