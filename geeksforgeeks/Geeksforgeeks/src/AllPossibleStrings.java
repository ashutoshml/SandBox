import java.io.IOException;

public class AllPossibleStrings {
	public static void main(String args[]) throws IOException {
		char a[] = { 'a', 'b' };
		int k = 3;
		possibleKLen(a, k);
	}

	static void possibleKLen(char a[], int k) {
		int n = a.length;
		possibleKLenRec(a, "", n, k);
	}

	static int possibleKLenRec(char a[], String prefix, int n, int k) {
		if (k == 0) {
			System.out.println(prefix);
		} else
			for (int i = 0; i < n; ++i) {
				String newPrefix = prefix + a[i];
				possibleKLenRec(a, newPrefix, n, k - 1);
			}
		return 1;
	}
}
