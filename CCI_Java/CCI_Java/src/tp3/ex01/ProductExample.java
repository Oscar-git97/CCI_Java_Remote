package tp3.ex01;

import java.util.Scanner;

public class ProductExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Product productA = new Product();
		System.out.println("Quantité du produit A : ");
		productA.quantity = scanner.nextInt();
		System.out.println("Prix du produit A : ");
		productA.price = scanner.nextDouble();
		
		Product productB = new Product();
		System.out.println("Quantité du produit B : ");
		productB.quantity = scanner.nextInt();
		System.out.println("Prix du produit B : ");
		productB.price = scanner.nextDouble();
		
		System.out.println("productA.quantity: "+ productA.quantity +" productB.quantity: " + productB.quantity);
		System.out.println("productA.price: "+ productA.price +" productB.price: " + productB.price);
		double prixTotal = productB.price * productB.quantity + productA.price * productA.quantity;
		System.out.println(" Le prix total des deux produits est : " + prixTotal);
	}
}
