package tp1.EX03;

public class TimeConverter {

	public static void main(String[] args) {
		double x = Math.random() * 20;
		double y = Math.random() * 20;
		
		System.out.println("x : " + x + " y : " + y);
		
		if (x > y){
			System.out.println("x est plus grand : " + x);
		} else if (x == y){
			System.out.println("ils sont egal ");
		} else {
			System.out.println("y est plus grand : " + y);
		}
	}

}
