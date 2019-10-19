import java.io.*;
import java.util.*;
public class outofplace {

	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("outofplace.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("outofplace.out")));
		int num = Integer.parseInt(f.readLine());
		int[] line = new int[num];
		for(int i=0; i<num; i++){
			line[i] = Integer.parseInt(f.readLine());
		}
		int[] organized = new int[num];
		for(int i=0; i<num; i++)
			organized[i]=line[i];
		Arrays.sort(organized);
		int change = 0;
		for(int i=0; i<num; i++){
			if(organized[i]!=line[i])
				change++;
		}
		if(change>0)
			out.println(change-1);
		out.close();
		f.close();
	}
}