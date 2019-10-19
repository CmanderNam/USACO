
import java.util.*;
import java.io.*;

public class hps {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(new File("hps.in"));
		PrintWriter out = new PrintWriter(new FileWriter("hps.out"));
		int[] array = new int[2];
		int n = in.nextInt();
		
		for (int i=0; i<n; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			if (a == b) continue;
			if(a-b==-2||a-b==1){
				array[0]++;
			}
			else if(a-b==-1||a-b==2){
				array[1]++;
			}
		}
		out.println(Math.max(array[0], array[1]));
		
		out.close();
		in.close();
	}
}