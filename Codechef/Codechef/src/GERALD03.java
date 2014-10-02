import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GERALD03 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		String s[] = new String[2];
		int a1, b1, a2, b2;
		int i;
		int count = 0;

		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine().trim());
			s = br.readLine().trim().split(" ", -1);
			StringBuffer app1 = new StringBuffer();
			a1 = Integer.parseInt(s[0]);
			b1 = Integer.parseInt(s[1]);
			count = 0;

			while (n-- > 1) {
				s = br.readLine().trim().split(" ", -1);
				a2 = Integer.parseInt(s[0]);
				b2 = Integer.parseInt(s[1]);
				if (a2 > a1) {
					for (i = a1; i < a2; ++i)
						app1.append("L+");
					count += a2 - a1;
				} else if (a2 < a1) {
					for (i = a1; i > a2; --i)
						app1.append("L-");
					count += a1 - a2;
				}
				if (b2 > b1) {
					for (i = b1; i < b2; ++i)
						app1.append("R+");
					count += b2 - b1;
				} else if (b2 < b1) {
					for (i = b1; i > b2; --i)
						app1.append("R-");
					count += b1 - b2;
				}
				a1 = a2;
				b1 = b2;
			}
			System.out.println(count);
			System.out.println(app1);
		}
	}
}
