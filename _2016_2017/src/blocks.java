import java.io.*;
import java.util.*;
public class blocks {

	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("blocks.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("blocks.out")));
		
		int n = Integer.parseInt(f.readLine());
		int[] temp1 = new int[26];
		int[] temp2 = new int[26];
		int[] result = new int[26];
		
		for(int j=0; j<n; j++){
			StringTokenizer st = new StringTokenizer(f.readLine());
			
			String t1 = st.nextToken();
			for(int i=0; i<t1.length(); i++){
				temp1[t1.charAt(i)-'a']++;
			}
			
			String t2 = st.nextToken();
			for(int i=0; i<t2.length(); i++){
				temp2[t2.charAt(i)-'a']++;
			
			}
			
			for(int i=0; i<26; i++){
				result[i]+=Math.max(temp1[i], temp2[i]);
			}
			temp1 = new int[26];
			temp2 = new int[26];
		}
		for(int i=0; i<26; i++)
			out.println(result[i]);
		f.close();
		out.close();
	}
}
