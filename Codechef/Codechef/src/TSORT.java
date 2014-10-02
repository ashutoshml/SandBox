import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class TSORT {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
		int t = Integer.parseInt(br.readLine());
		int[] n = new int[t];
		for (int i = 0; i < t; i++) {
			n[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(n);
		for (int i = 0; i < t; i++)
			out.println(n[i]);
		out.close();
	}
}
