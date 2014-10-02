import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FLOORI4 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		long n, i, m;
		long sum = 0;
		long k;
		while (t-- > 0) {
			sum = 0;
			i = 1;
			String s[] = br.readLine().trim().split(" ", -1);
			n = Long.parseLong(s[0]);
			m = Long.parseLong(s[1]);
			while (i <= n) {
				if (i < 100) {
					k = (i * i * i * i) % m;
				} else if (i < 1000) {
					k = (((i * i * i) % m) * i) % m;
				} else if (i < 10000) {
					k = (((i * i) % m) * ((i * i) % m)) % m;
				} else
					k = ((i % m) * (i % m) * (i % m) * (i % m)) % m;
				sum = sum + (k * ((n / i) % m)) % m;
				if (sum > m)
					sum %= m;
				i++;
			}
			System.out.println(sum);
		}
	}
}
