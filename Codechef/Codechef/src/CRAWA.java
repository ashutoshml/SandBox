import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CRAWA {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		String[] s;
		int x, y;
		boolean flag;
		while (t-- > 0) {
			s = br.readLine().trim().split(" ", -1);
			x = Integer.parseInt(s[0]);
			y = Integer.parseInt(s[1]);	
			flag = false;

			if (y % 2 == 0) {
				if (y == 0 && x >= 0 && x <= 1)
					flag = true;
				if (y > 0 && x >= (-1 * y) && x < y)
					flag = true;
				if (y < 0 && x >= y && x <= (-1 * y) + 1)
					flag = true;
			}

			if (x > 0 && x % 2 == 1 && y > (-1 * x) && y <= x + 1)
				flag = true;

			if (x < 0 && x % 2 == 0 && y >= x && y <= (-1 * x))
				flag = true;

			if (flag == true)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
