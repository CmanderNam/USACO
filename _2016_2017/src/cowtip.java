import java.util.*;
import java.io.*;

public class cowtip {
	public static int n;
	public static boolean[][] a;
	
	public static void main(String[] args) throws Exception {

		Scanner in = new Scanner(new File("cowtip.in"));
		PrintWriter out = new PrintWriter(new FileWriter("cowtip.out"));
		
		n = in.nextInt();
		a = new boolean[n][n];

		for (int i=0; i<n; i++) {
			String s = in.next();
			for (int j=0; j<n; j++)
				a[i][j] = (s.charAt(j) == '1');
		}

		int r = 0;

		for (int i=2*n-2; i>=0; i--) {
			for (int j=0; j<n; j++) {
				int k = i-j;
				if (k >= n || k < 0) continue;
				if (a[j][k]) {
					toggle(j, k);
					r++;
				}
			}
		}

		
		out.println(r);

		out.close();
		in.close();
	}

	public static void toggle(int x, int y) {
		for (int i=0; i<=x; i++)
			for (int j=0; j<=y; j++)
				a[i][j] = !a[i][j];
	}
}