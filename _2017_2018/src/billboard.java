import java.io.*;
import java.util.*;
public class billboard {

	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("billboard.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("billboard.out")));
		
		
		boolean[][] a = new boolean[2001][2001];
		
		for(int i=0; i<2; i++){
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
		}
		StringTokenizer st = new StringTokenizer(f.readLine());
		int x1 = Integer.parseInt(st.nextToken())+1000;
		int y1 = Integer.parseInt(st.nextToken())+1000;
		int x2 = Integer.parseInt(st.nextToken())+1000;
		int y2 = Integer.parseInt(st.nextToken())+1000;
		for(int r=x1; r<x2; r++){
			for(int c=y1; c<y2; c++){
				a[r][c] = false;
			}
		}
		int count = 0;
		for(int r=0; r<a.length; r++){
			for(int c=0; c<a.length; c++){
				if(a[r][c]==true)
					count++;
			}
		}
		//System.out.println(Arrays.deepToString(a));
		out.println(count);
		
		f.close();
		out.close();
		
		
		
		
		
		
	}

}
