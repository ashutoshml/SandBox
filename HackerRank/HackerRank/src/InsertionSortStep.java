import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InsertionSortStep {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		String s[] = br.readLine().trim().split(" ", -1);
		int i = 0, j;
		for (i = 0; i < n; ++i) {
			a[i] = Integer.parseInt(s[i]);
		}
		int key;
		int sum = 0;
		for (i = 1; i < n; ++i) {
			key = a[i];
			j = i - 1;
			while (j >= 0 && a[j] > key) {
				a[j + 1] = a[j];
				j--;
				sum++;
			}
			a[j + 1] = key;
		}
		System.out.println(sum);
	}
}
