import java.math.BigInteger;
import java.util.HashSet;

public class ToPower {
	public static void main(String args[]) {
		HashSet<BigInteger> m = new HashSet<BigInteger>();
		BigInteger a = BigInteger.ONE;
		BigInteger b = BigInteger.ONE;
		int i, j;
		long count = 0;
		for (i = 2; i <= 100; i++) {
			a = new BigInteger(i + "");
			b = new BigInteger(i + "");
			for (j = 2; j <= 100; j++) {
				a = a.multiply(b);
				if (m.add(a))
					count++;
			}
		}
		System.out.println(count);
	}
}
