import java.io.*;
import java.util.*;
public class speeding {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("speeding.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("speeding.out")));
		int[] limit = new int[101];
		int[] cow = new int[101];
		
		int n = in.nextInt();
		int m = in.nextInt();
		int start = 0;
		int pos = 0;
		for(int j=0; j<n; j++){
			pos += in.nextInt();
			int speed = in.nextInt();
			for(int i=start; i<pos; i++){
				limit[i] = speed;
			}
			start = pos;
		}
		
		start = 0;
		pos = 0; 
		for(int j=0; j<m; j++){
			pos += in.nextInt();
			int speed = in.nextInt();
			for(int i=start; i<pos; i++){
				cow[i] = speed;
			}
			start = pos;
		}
		
		int max=0;
		for(int i=0; i<101; i++){
			max = Math.max(max, cow[i]-limit[i]);
		}
		
		out.println(max);
		out.close();
		
	}

}
