import java.io.*;
import java.util.*;
public class sleepy {

	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("sleepy.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sleepy.out")));
		int n = Integer.parseInt(f.readLine());
		
		int line [] = new int [n];
		StringTokenizer st = new StringTokenizer(f.readLine());
		for(int i=0; i<n; i++){
			line[i]=Integer.parseInt(st.nextToken());
		}
		int ans = 0;
		for(int i=n-1; i>0; i--){
			if(line[i]<line[i-1]){
				ans=i;
				break;
			}
		}
		out.println(ans);
		out.close();
		f.close();
	}

}
