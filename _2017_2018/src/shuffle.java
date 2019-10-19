import java.io.*;
import java.util.*;
public class shuffle {

	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("shuffle.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("shuffle.out")));
		
		
		int ncows = Integer.parseInt(f.readLine());
		Map<Integer,Integer> m = new HashMap<Integer,Integer>();
		int[] original = new int[ncows+1];
		int[] before = new int[ncows+1];
		
		StringTokenizer st = new StringTokenizer(f.readLine());
		for(int i=1; i<=ncows; i++){
			m.put(Integer.parseInt(st.nextToken()), i);
		}
		
		StringTokenizer st1 = new StringTokenizer(f.readLine());
		for(int i=1; i<=ncows; i++){
			original[i] = Integer.parseInt(st1.nextToken());
		}
		
		for(int j=0; j<3; j++){
			for(int i=1; i<=ncows; i++){
				before[m.get(i)]=original[i];
			}
			original = before;
			before = new int[ncows+1];
		}
		for(int i=1; i<=ncows; i++){
			out.println(original[i]);
		}
		
		f.close();
		out.close();
		
	}

}
