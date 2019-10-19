import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.*;
import java.util.*;
public class guess {

	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("guess.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("guess.out")));
		int n = Integer.parseInt(f.readLine());
		String a[][] = new String[n][100];
		for(int i=0; i<n; i++){
			StringTokenizer st = new StringTokenizer(f.readLine());
			st.nextToken();
			a[i][0]=st.nextToken();
			int temp = Integer.parseInt(a[i][0]);
			for(int j=1; j<=temp; j++){
				a[i][j]=st.nextToken();
			}
		}
		int ans = 0;
		for(int i=0; i<n-1; i++){
			int t=0;
			for(int j=i+1; j<n; j++){
				int temp1=Integer.parseInt(a[i][0]);
				int temp2=Integer.parseInt(a[j][0]);
				for(int k=1; k<=temp1; k++){
					for(int l=1; l<=temp2; l++){
						if(a[i][k].equals(a[j][l]))
							t++;
					}
				}
				ans=Math.max(ans, t);
				t=0;
			}
			
		}
		out.println(ans+1);
		out.close();
		f.close();
	}

}
