import java.io.*;
import java.util.*;
public class lifeguards {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("lifeguards.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("lifeguards.out")));
		int num = Integer.parseInt(f.readLine());
		int[] a = new int [1001];
		int[][] l = new int[num][2];
		int count =0;
		
		int min=10000;
		int max = 0;
		for(int i=0; i<num; i++){
			StringTokenizer st = new StringTokenizer(f.readLine());
			int first = Integer.parseInt(st.nextToken());
			min = Math.min(first, min);
			int last = Integer.parseInt(st.nextToken());
			max = Math.max(max, last);
			l[i][0] = first;
			l[i][1] = last;
			for(int j=first; j<last; j++){
				a[j]++;
				if(a[j]==1)
					count++;
			}
		}
		int tempcount = 100000;
		//System.out.println(Arrays.deepToString(l));
		//System.out.println(Arrays.toString(a));
		for(int j=0; j<num; j++){
			int temp = 0;
			for(int i=l[j][0]; i<l[j][1]; i++){
				if(a[i] == 1)
					temp++;
			}
			//System.out.println(tempcount);
				tempcount = Math.min(tempcount, temp);
		}
		//System.out.println(tempcount);
		out.println(count-tempcount);
		out.close();
		f.close();
	}
}
//591