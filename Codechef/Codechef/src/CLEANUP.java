import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CLEANUP {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int n, m;
		for (int i = 0; i < t; ++i) {
			List<Integer> arraylist = new ArrayList<Integer>();
			String s[] = br.readLine().split(" ", -1);
			n = Integer.parseInt(s[0]);
			m = Integer.parseInt(s[1]);
			for (int j = 1; j <= n; j++) {
				arraylist.add(j);
			}
			s = br.readLine().split(" ", -1);
			for (int j = 0; j < m; ++j) {
				arraylist.remove(arraylist.indexOf(Integer.parseInt(s[j])));
			}
			int[] appArray = new int[arraylist.size()];
			int index = 0;
			for(int app:arraylist){
			    appArray [index] = app;
			    index++;
			}
			int a[] = new int[arraylist.size()];
			for (int j = 0; j < arraylist.size(); ++j) {
				a[j] = appArray[j];
			}
			for (int j = 0; j < a.length; j += 2) {
				System.out.print(a[j] + " ");
			}
			System.out.println();
			for (int j = 1; j < a.length; j += 2) {
				System.out.print(a[j] + " ");
			}
			System.out.println();
		}
	}
}
