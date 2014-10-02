import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ROTATION {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[];
		int[] arr;
		int m;
		int n;
		s = br.readLine().trim().split(" ", -1);
		n = Integer.parseInt(s[0]);
		m = Integer.parseInt(s[1]);
		arr = new int[n];
		char ch;
		int t;
		s = br.readLine().trim().split(" ", -1);
		for (int i = 0; i < n; ++i) {
			arr[i] = Integer.parseInt(s[i]);
		}
		int c = 0;
		while (m-- > 0) {
			s = br.readLine().trim().split(" ", -1);
			ch = s[0].charAt(0);
			t = Integer.parseInt(s[1]) - 1;
			if (ch == 'R') {
				if (c + t < n)
					System.out.println(arr[c + t]);
				else
					System.out.println(arr[c + t - n]);
			} else if (ch == 'C') {
				if (c + t + 1 < n)
					c = c + t + 1;
				else {
					c = c + t + 1 - n;
				}
			} else if (ch == 'A') {
				if (c - t <= 0) {
					c = n + c - t - 1;
				} else {
					c = c - t - 1;
				}
			}
		}
	}
}
