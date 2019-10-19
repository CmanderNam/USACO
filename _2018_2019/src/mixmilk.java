/*
ID: samueln1
LANG: JAVA
TASK: mixmilk
 */
import java.io.*;
import java.util.*;
public class mixmilk {
	
	static BufferedReader f;
	static PrintWriter out;
	static int[] capacity;
	static int[] contains;
	static StringTokenizer st;
	static StringBuilder sb;
	public static void main(String[] args) {
		try{
			f = new BufferedReader(new FileReader("mixmilk.in"));
			out = new PrintWriter(new FileWriter("mixmilk.out"));
			init();
			out.println(solve());
			out.close();
			f.close();
			
		}catch(Exception e){
			System.out.println(e);
			e.printStackTrace();
		}
		
	}
	
	private static void init() throws IOException{
		sb = new StringBuilder();
		capacity = new int[3];
		contains = new int[3];
		for(int i=0; i<3; i++){
			st = new StringTokenizer(f.readLine());
			capacity[i]=Integer.parseInt(st.nextToken());
			contains[i]=Integer.parseInt(st.nextToken());
		}
	}
	
	private static String solve(){
		for(int i=0; i<100; i++){
			int num = i%3;
			if(num==2){
				if(contains[2]>capacity[0]-contains[0]){
					contains[2]-=capacity[0]-contains[0];
					contains[0]=capacity[0];
				}
				else{
					contains[0]+=contains[2];
					contains[2]=0;
				}
			}
			else{
				if(contains[num]>capacity[num+1]-contains[num+1]){
					contains[num]-=capacity[num+1]-contains[num+1];
					contains[num+1]=capacity[num+1];
				}
				else{
					contains[num+1]+=contains[num];
					contains[num]=0;
				}
			}
		}
		for(int i=0; i<2; i++){
			sb.append(contains[i]).append("\n");
		}
		sb.append(contains[2]);
		return sb.toString();
	}

}
