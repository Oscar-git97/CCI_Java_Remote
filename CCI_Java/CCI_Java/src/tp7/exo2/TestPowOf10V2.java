package tp7.exo2;

import java.math.BigInteger;

public class TestPowOf10V2 {

	public static void main(String[] args) {

		Calculator cal = new Calculator();

//		System.out.println(BigInteger.ZERO.compareTo(BigInteger.ONE));
//		System.out.println(BigInteger.TEN.add(BigInteger.ONE));
//		cal.powOf10(BigInteger.TWO);
		System.out.println("La plus grande valeur d'un int est " + cal.powOf10(BigInteger.ONE));
		System.out.println("La plus grande valeur d'un int est " + cal.powOf10(BigInteger.TWO));
		System.out.println("La plus grande valeur d'un int est " + cal.powOf10(BigInteger.valueOf(3)));
	}

}
