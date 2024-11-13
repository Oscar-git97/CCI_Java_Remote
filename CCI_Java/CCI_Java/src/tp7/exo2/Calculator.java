package tp7.exo2;

import java.math.BigInteger;

public class Calculator {

	public int powOf10(int n) {
		return (int) Math.pow(10, n);
	}

	public BigInteger powOf10(BigInteger n) {
		
		BigInteger pow = BigInteger.ONE;
		
		for (int i = 0; i < n.intValue(); i++)
			pow = pow.multiply(BigInteger.TEN);
//			System.out.println(pow);
		return pow;
	}
	
	
}
