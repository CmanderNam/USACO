/*
ID: samueln1
LANG: JAVA
TASK: milk2
 */
import java.io.*;
import java.util.*;
public class milk2 {

	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("milk2.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("milk2.out")));
		
		//Data Organizer
		int n = Integer.parseInt(f.readLine());
		milk[] arr = new milk[n];
		for(int i=0; i<n; i++){
			StringTokenizer st = new StringTokenizer(f.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			arr[i] = new milk(start, end);
			
		}
		Arrays.sort(arr);
		//Processor
		int maxt=0;
		int maxi=0;
		int start = arr[0].start;
		int end = arr[0].end;
		for(int i=1; i<n; i++){
			if(arr[i].start<=end){ 
				if(arr[i].end>end)			
					end = arr[i].end;
			}
			else{
				maxt=Math.max(end-start, maxt);
				maxi=Math.max(arr[i].start-end,maxi);
				start = arr[i].start;
				end = arr[i].end;
				}
			}
		
		if(end-start>maxt)
			maxt=end-start;
		out.println(maxt+" "+maxi);
		
		f.close();
		out.close();
		
	}

}
class milk implements Comparable<milk>{
	//data field
	int start;
	int end;
	
	//constructor
	milk(int s, int e){
		this.start = s;
		this.end = e;
	}
	
	//methods
		public String toString(){
			return start + " " + end;
		}
	
	@Override
	public int compareTo(milk that) {
		if(this.start < that.start) return -1;
		else return 1;
		
	}
	
}