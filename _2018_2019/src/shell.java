import java.io.*;
import java.util.*;
public class shell {

	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("shell.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("shell.out")));
		int n = Integer.parseInt(f.readLine());
		
		int ans=0;
		int[][] a = new int[n][3];
		int[] table = new int[3];
		for(int i=0; i<n; i++){
			StringTokenizer st = new StringTokenizer(f.readLine());
			a[i][0]=Integer.parseInt(st.nextToken());
			a[i][1]=Integer.parseInt(st.nextToken());
			a[i][2]=Integer.parseInt(st.nextToken());
			//System.out.println(a[i][0] + " " + a[i][1] + " " + a[i][2]);
		}
		
		for(int i=0; i<3; i++){
			table[i]=1;
			int t=0;
			for(int j=0; j<n; j++){
				int temp1 = a[j][0]-1;
				int temp2 = a[j][1]-1;
				int temp3 = a[j][2]-1;
				int temp = table[temp1];
				table[temp1]=table[temp2];
				table[temp2]=temp;
				if(table[temp3]==1){
					t++;
				}
			}
			for(int j=0; j<3; j++){
				table[j]=0;
			}
			ans = Math.max(ans, t);
		}
		out.println(ans);
		out.close();
		f.close();
	}

}
