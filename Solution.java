import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = fs.nextInt();
			int[] a = new int[n];
			int firstMax = Integer.MIN_VALUE;
			int firstMaxIndex = -1;
			for (int i = 0; i < n; i++) {
				a[i] = fs.nextInt();
				if (a[i] > firstMax) {
					firstMax = a[i];
					firstMaxIndex = i;
				}
			}
			int secondMax = Integer.MIN_VALUE;
			for (int i = 0; i < n; i++) {
				if (a[i] > secondMax && i != firstMaxIndex) {
					secondMax = a[i];
				}
			}
			for (int i = 0; i < n; i++) {
				if (i != firstMaxIndex) {
					System.out.print((a[i] - firstMax) + " ");
				} else {
					System.out.print((a[i] - secondMax) + " ");
				}
			}
			System.out.println();
		}
		fs.close();
	}
}
