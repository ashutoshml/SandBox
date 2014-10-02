import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SUBMIN {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		String[] s = br.readLine().trim().split(" ", -1);
		int left[] = new int[n];
		Arrays.fill(left, 1);
		int right[] = new int[n];
		Arrays.fill(right, 1);
		int a[] = new int[n];
		for (int i = 0; i < n; ++i)
			a[i] = Integer.parseInt(s[i]);
		int j, k;
		for (int i = 1; i < n - 1; ++i) {
			j = i - 1;
			k = i + 1;
			while (a[i] < a[j]) {
				left[i]++;
				j--;
				if (j < 0)
					break;
			}
			while (a[i] <= a[k]) {
				right[i]++;
				k++;
				if (k > n - 1)
					break;
			}
			left[i] = left[i] * right[i];
		}

		int t = Integer.parseInt(br.readLine().trim());
		int sum = 0;
		while (t-- > 0) {
			sum = 0;
			k = Integer.parseInt(br.readLine().trim());
			for (int i = 0; i < n; ++i) {
				if (a[i] == k)
					sum += left[i];
			}
			System.out.println(sum);
		}
	}
}
