package tp7.exo2;

import java.math.BigInteger;

public class TestPowOf10V3 {

	public static void main(String[] args) {

		Calculator cal = new Calculator();

		for (int i = 0; i <= 15; i++)
			System.out.println("10^" + i + " = " + cal.powOf10(i));

		System.out.println("La plus grande valeur d'un int est " + Integer.MAX_VALUE);
	}

}
