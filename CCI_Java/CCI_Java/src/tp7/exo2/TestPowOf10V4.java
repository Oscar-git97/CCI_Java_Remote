package tp7.exo2;

import java.math.BigInteger;

public class TestPowOf10V4 {

	public static void main(String[] args) {

		Calculator cal = new Calculator();

		for (int i = 0; i < 100; i++)
			System.out.println("La plus grande valeur d'un int est " + cal.powOf10(BigInteger.valueOf(i)));
		
	}

}
