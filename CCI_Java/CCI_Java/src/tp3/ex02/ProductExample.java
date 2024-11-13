package tp3.ex02;

public class ProductExample {

	public static void main(String[] args) {
		Product productA = new Product();
		productA.quantity = 15;
		productA.price = 30.5;
		
		Product productB = new Product();
		productB.quantity = 120;
		productB.price = 10.2;
		
		System.out.println("productA.quantity: "+ productA.quantity +" productB.quantity:" + productB.quantity);
		System.out.println("productA.price: "+ productA.price +" productB.price:" + productB.price);
		
	}
}
