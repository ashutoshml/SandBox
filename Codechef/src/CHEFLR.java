import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CHEFLR {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		String s;
		long k;
		while (t-- > 0) {
			s = br.readLine().trim();
			k = 1;
			for (int i = 0; i < s.length(); i++) {
				if (i % 2 == 0) {
					if (s.charAt(i) == 'l') {
						k = 2 * k;
					} else {
						k = 2 * k + 2;
					}
				} else {
					if (s.charAt(i) == 'l') {
						k = 2 * k - 1;
					} else {
						k = 2 * k + 1;
					}
				}
				k %= 1000000007;
			}
			System.out.println(k);
		}
	}
}
