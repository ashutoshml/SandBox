import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PRGIFT {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int n, k;
		int[] arr;
		int i = 0;
		String[] s;
		int count;

		while (t-- > 0) {
			i = 0;
			count = 0;
			s = br.readLine().trim().split(" ", -1);
			n = Integer.parseInt(s[0]);
			k = Integer.parseInt(s[1]);

			arr = new int[n];
			s = br.readLine().trim().split(" ", -1);

			while (i < n) {
				arr[i] = Integer.parseInt(s[i]);
				if (arr[i] % 2 == 0)
					count++;
				i++;
			}
			if (k == 0 && count == n)
				System.out.println("NO");
			else if (count >= k)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
