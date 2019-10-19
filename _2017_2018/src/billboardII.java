import java.io.*;
import java.util.*;
public class billboardII {

	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("billboard.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("billboard.out")));
		
		
		boolean[][] a = new boolean[2001][2001];
		
		StringTokenizer st = new StringTokenizer(f.readLine());
		int x1 = Integer.parseInt(st.nextToken())+1000;
		int y1 = Integer.parseInt(st.nextToken())+1000;
		int x2 = Integer.parseInt(st.nextToken())+1000;
		int y2 = Integer.parseInt(st.nextToken())+1000;
		for(int r=x1; r<x2; r++){
			for(int c=y1; c<y2; c++){
				a[r][c] = true;
			}
		}
		
		st = new StringTokenizer(f.readLine());
		int x_1 = Integer.parseInt(st.nextToken())+1000;
		int y_1 = Integer.parseInt(st.nextToken())+1000;
		int x_2 = Integer.parseInt(st.nextToken())+1000;
		int y_2 = Integer.parseInt(st.nextToken())+1000;
		for(int r=x_1; r<x_2; r++){
			for(int c=y_1; c<y_2; c++){
				a[r][c] = false;
			}
		}
		boolean check = true;
		int minX = 2001, maxX = -1, minY = 2001, maxY = -1;
		for (int x=0; x<2001; x++) {
			for (int y=0; y<2001; y++) {
				if (a[x][y]) {
					check = false;
					minX = Math.min(minX, x);
					maxX = Math.max(maxX, x);
					minY = Math.min(minY, y);
					maxY = Math.max(maxY, y);
				}
			}
		}
		//System.out.println(Arrays.deepToString(a));
		if(check ==false)
			out.println((maxX-minX+1)*(maxY-minY+1));
		else
			out.println(0);
		
		f.close();
		out.close();
	}

}
