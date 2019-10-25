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

		int c = 0;

		for(int i=n-1; i>=0; i--){
			for(int j=n-1; j>=0; j--){
				if(a[i][j]==true){
					toggle(i,j);
					c++;	
				}
			}
		}

		
		out.println(c);

		out.close();
		in.close();
	}

	public static void toggle(int x, int y) {
		for (int i=0; i<=x; i++)
			for (int j=0; j<=y; j++)
				a[i][j] = !a[i][j];
	}
}