package Section_1_3;
/*
ID: samueln1
LANG: JAVA
TASK: milk2
*/
import java.io.*;
import java.util.*;
public class milk2 {
	
	static Scanner in;
	static PrintWriter out;
	static int n;
	static int l;
	static int min;
	static TreeSet<Integer> m = new TreeSet<Integer>();
	public static void main(String[] args) {
		try{
			in = new Scanner(new File("milk2.in"));
			out = new PrintWriter(new File("milk2.out"));
			init();
			out.println(solve());
			in.close();
			out.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	private static void init(){
		int max=0;
		min=999999999;
		n=in.nextInt();
		int[] start = new int[n];
		int [] end = new int[n];
		for(int i=0; i<n; i++){
			start[i]=in.nextInt();
			min = Math.min(min, start[i]);
			end[i] = in.nextInt();
			max = Math.max(max, end[i]);
		}
		l=max-min;
		
		for(int i=0; i<n; i++){
			for(int j=start[i]; j<end[i]; j++){
				m.add(j);
			}
		}
	}
	
	private static String solve(){
		int maxl=0;
		int maxi=0;
		int countl=0;
		int previous = min;
		for(int num:m){
			if(num-previous<=1){
				countl++;
				maxl=Math.max(maxl, countl);
				previous=num;
			}
			else{
				maxi=Math.max(maxi, num-previous-1);
				countl=0;
				previous=num;
			}
		}
		return maxl+" "+(maxi);
	}

}
