import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coins {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int v[] = new int[3];
		v[0] = 1;
		v[1] = 3;
		v[2] = 5;
		int sum = Integer.parseInt(br.readLine());
		int min[] = new int[sum + 1];
		min[0] = 0;
		int i, j;
		for (i = 1; i <= sum; ++i)
			min[i] = sum + 1000;
		for (i = 1; i <= sum; i++) {
			for (j = 0; j < 3; j++) {
				if (v[j] <= i && min[i - v[j]] + 1 < min[i]) {
					min[i] = min[i - v[j]] + 1;
					System.out.println("min[" + i + "] = " + min[i]);
				}
			}
		}
		System.out.println(min[sum]);
	}
}
