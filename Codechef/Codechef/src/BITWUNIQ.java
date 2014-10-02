import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class BITWUNIQ {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
		int b[] = { 2, 3, 2, 3, 2, 1, 3 };
		System.out.println(convertTo3Bit(51));
	}

	public static int convertTo3Bit(int n) {
		int m = 0;
		int k = 0;
		while (n != 0) {
			m = m + (int) (Math.pow(10, k++) * (n % 3));
			n /= 3;
		}
		return m;
	}
}