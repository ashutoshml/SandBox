import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class GERALD04 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		double girl, chef, dist;
		DecimalFormat f = new DecimalFormat("##.0");
		double option1, option2;
		String s[] = new String[2];
		while (t-- > 0) {
			s = br.readLine().trim().split(":", -1);
			girl = Double.parseDouble(s[0]) * 60 + Double.parseDouble(s[1]);
			s = br.readLine().trim().split(":", -1);
			chef = Double.parseDouble(s[0]) * 60 + Double.parseDouble(s[1]);
			dist = Double.parseDouble(br.readLine().trim());
			option1 = girl - chef + dist;
			if (dist * 2 <= girl - chef) {
				option2 = girl - chef;
			} else {
				option2 = dist + ((girl - chef) - dist)
						+ ((2 * dist - (girl - chef)) / 2);
			}
			System.out.println(f.format(option1) + " " + f.format(option2));
		}
	}
}
