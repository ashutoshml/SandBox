import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UpsAndDowns {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int temp;
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			String s[] = br.readLine().trim().split(" ", -1);
			for (int i = 0; i < n; ++i)
				arr[i] = Integer.parseInt(s[i]);

			for (int i = 0; i < n-1; ++i) {
				if (arr[i] > arr[i + 1] && i % 2 == 0) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				} else if (arr[i] < arr[i + 1] && i % 2 != 0) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
			for (int i = 0; i < n; ++i)
				System.out.print(arr[i]+" ");
			System.out.println();
		}
	}
}
