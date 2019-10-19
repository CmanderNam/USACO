import java.io.*;
import java.util.*;
public class blist {
	static BufferedReader f;
	static PrintWriter out;
	static StringTokenizer st;
	static StringBuilder sb;
	static int n;
	static int[] startt;
	static int[] endt;
	static int[] b;
	static int[] list;
	
	public static void main(String[] args) {
		try{
			f = new BufferedReader(new FileReader("blist.in"));
			out = new PrintWriter(new FileWriter("blist.out"));
			init();
			out.println(solve());
			out.close();
			f.close();
			
		}catch(Exception e){
			System.out.println(e);
			e.printStackTrace();
		}
	}
	
	private static void init() throws IOException {
		sb = new StringBuilder();
		st = new StringTokenizer(f.readLine());
		n = Integer.parseInt(st.nextToken());
		list = new int[1001];
		startt = new int[n];
		endt = new int[n];
		b = new int[n];
		for(int i=0; i<n; i++){
			st = new StringTokenizer(f.readLine());
			startt[i]=Integer.parseInt(st.nextToken());
			endt[i]=Integer.parseInt(st.nextToken());
			b[i]=Integer.parseInt(st.nextToken());
		}
	}
	
	private static int solve(){
		int max=0;
		for(int i=0; i<n; i++){
			for(int j=startt[i]; j<=endt[i]; j++){
				list[j]+=b[i];
				if(list[j]>max)
					max=list[j];
			}
		}
		return max;
	}

}
