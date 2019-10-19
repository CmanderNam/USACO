import java.io.*;
import java.util.*;
public class square {

	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("square.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("square.out")));
		StringTokenizer st1 = new StringTokenizer(f.readLine());
		StringTokenizer st2 = new StringTokenizer(f.readLine());
		
		int x1 = Integer.parseInt(st1.nextToken());
		int y1 = Integer.parseInt(st1.nextToken());
		int x2 = Integer.parseInt(st1.nextToken());
		int y2 = Integer.parseInt(st1.nextToken());
		
		int x3 = Integer.parseInt(st2.nextToken());
		int y3 = Integer.parseInt(st2.nextToken());
		int x4 = Integer.parseInt(st2.nextToken());
		int y4 = Integer.parseInt(st2.nextToken());
		
		int xmin = Math.min(Math.min(x1,x2), Math.min(x3,x4));
		//System.out.println(xmin);
		int xmax = Math.max(Math.max(x1,x2), Math.max(x3,x4));
		//System.out.println(xmax);
		int ymin = Math.min(Math.min(y1,y2), Math.min(y3,y4));
		//System.out.println(ymin);
		int ymax = Math.max(Math.max(y1,y2), Math.max(y3,y4));
		// System.out.println(ymax);
		int x = xmax-xmin;
		int y = ymax-ymin;
		int side = Math.max(x, y);
		int area = (int) Math.pow(side, 2);
		out.println(area);
		
		f.close();
		out.close();
		
	}

}
