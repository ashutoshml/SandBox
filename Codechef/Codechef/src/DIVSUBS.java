import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DIVSUBS {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		int a[], f[], was[];
		boolean done = false;
		String s[];
		while (t-- > 0) {

			int n = Integer.parseInt(br.readLine().trim());

			a = new int[n];
			f = new int[n + 1];
			was = new int[n];
			s = br.readLine().trim().split(" ", -1);

			for (int i = 0; i < n; ++i) {
				a[i] = Integer.parseInt(s[i]);
				if (a[i] % n == 0 && !done) {
					System.out.println("1\n" + (i + 1));
					done = true;
				}
			}

			int i;
			int j;
			if (!done) {
				for (i = 0; i < n; ++i)
					was[i] = 0;
				f[0] = 0;
				was[0] = 1;
				for (i = 1; i <= n; ++i) {
					f[i] = (f[i - 1] + a[i - 1]) % n;
					if (was[f[i]] == 1)
						break;
					was[f[i]] = 1;
				}

				for (j = 0; j <= i; ++j) {
					if (f[i] == f[j])
						break;
				}
				System.out.println(i - j);
				for (j = j + 1; j <= i; ++j) {
					System.out.print(j);
					if (j != i)
						System.out.print(" ");
				}
				System.out.println();
			}

		}
	}
}
