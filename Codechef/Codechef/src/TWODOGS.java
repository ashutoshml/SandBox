/*
 * In Chef's house there are N apples lying in a row on the floor. These apples are numbered from 1 (left most one) to N (right most one). The types of apples are also numbered by positive integers, and the type of apple i is Ti.
Chef has recently brought two trained dogs. Both of the dogs are too intelligent to know the smell of each type of apple. If Chef gives a dog an integer x, and releases it at one end of the row of apples, then the dog smells each apple one by one. Once the dog find an apple of type x, the dog picks the apple and back to Chef's room immidiately. If there is no apple of type x, then the dog will back without any apples.
Now Chef wants to eat two apples as soon as possible. Here the apples must have distinct types, and the sum of the types must be equal to K. Chef can release the dogs from either of the ends, namely, he can leave (both at left end) or (both at right end) or (one at left end and one at right end) and he can release them at the same time. The dogs take one second to smell each apple. However the dogs can run rapidly, so the time for moving can be ignored. What is the minimum time (in seconds) to get the desired apples from his dogs?
Input

The first line of input contains two space-separated integers N and K, denoting the number of apples and the required sum respectively. Then the next line contains N space-separated integers T1, T2, ..., TN, denoting the types of the apples.
Output

Print one integer describing the minimum number of seconds that Chef needs to wait till he gets the desired apples. If Chef cannot get the desired apples, then output "-1" without quotes.
Constraints

2 ≤ N ≤ 500000 (5 × 105)
1 ≤ K ≤ 1000000 (106)
1 ≤ Ti ≤ 1000000 (106)
Example

Sample Input 1:
5 5
2 4 3 2 1

Sample Output 1:
2

Sample Input 2:
5 5
2 4 9 2 5

Sample Output 2:
-1
Explanation

In the first example, if Chef leaves the first dog from left and gives it integer 4, and the second dog from right and gives it integer 1, then the first dog takes 2 seconds and the second dog takes 1 second to get the apples. Thus Chef needs to wait 2 seconds. In any other way, Chef can't get the desired apples in less than 2 seconds.
In the second example, Chef cannot get two apples such that the sum of their types is 5 so the answer is "-1".
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TWODOGS {
	static class MakeHappy implements Comparable<MakeHappy> {
		int data;
		int pos;

		public MakeHappy(int data, int pos) {
			this.data = data;
			this.pos = pos;
		}

		@Override
		public int compareTo(MakeHappy a) {

			if (this.data == a.data) {
				return this.pos - a.pos;
			}
			return this.data - a.data;
		}
	}

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n, k;
		String s[] = br.readLine().trim().split(" ", -1);
		n = Integer.parseInt(s[0]);
		k = Integer.parseInt(s[1]);
		MakeHappy[] makeHappy = new MakeHappy[n];
		String s1[] = br.readLine().trim().split(" ", -1);
		for (int i = 0; i < n; ++i) {
			makeHappy[i] = new MakeHappy(Integer.parseInt(s1[i]), Math.min(
					i + 1, n - i));
		}
		Arrays.sort(makeHappy);

		int i = 0, j = n - 1;

		int count = 0;
		int min = -1;
		int tempSum;
		while (j > -1 && i < n) {
			if (makeHappy[i].data + makeHappy[j].data < k)
				i++;
			else if (makeHappy[i].data + makeHappy[j].data > k)
				j--;
			else {
				if (count == 0) {
					if (makeHappy[i].data != makeHappy[j].data) {
						min = Math.max(makeHappy[i].pos, makeHappy[j].pos);
						count = 1;
					}
				} else {
					if (makeHappy[i].data != makeHappy[j].data) {
						tempSum = Math.max(makeHappy[i].pos, makeHappy[j].pos);
						if (tempSum < min) {
							min = tempSum;
						}
					}
				}
				j--;
			}
		}
		System.out.println(min);
	}
}