package Section_1_2;
/*
ID: samueln1
LANG: JAVA
TASK: gift1
*/
import java.io.*;
import java.util.*;
public class gift1 {
	static Scanner in;
	static PrintWriter out;
	static int n;
	static LinkedHashMap<String, Integer> list;
	static StringBuilder sb;
	
	public static void main(String[] args) {
		try{
			in = new Scanner(new File("gift1.in"));
			out = new PrintWriter(new File("gift1.out"));
					
			init();
			out.print(solve());
			in.close();
			out.close();
		}catch(Exception e){
			System.out.println(e);
		}
		
	}
	
	private static void init(){
		list = new LinkedHashMap<String, Integer>();
		n = in.nextInt();
		in.nextLine();
		for(int i=0; i<n; i++){
			String name = in.nextLine();
			list.put(name, 0);
		}
	}
	
	private static String solve(){
		sb = new StringBuilder();
		for(int i=0; i<n; i++){
			String Giver = in.next();
			int money = in.nextInt();
			int d = in.nextInt();
			int dm=0;
			int left = 0;
			if(d==0){
				continue;
			}
			else{
				dm = money/d;
				left = money%d;
			}
			list.put(Giver,  list.get(Giver)-money+left);
			
			for(int j=0; j<d; j++){
				String r = in.next();
				list.put(r, list.get(r)+dm);
			}
			
		}
		for(String key: list.keySet()){
			sb.append(key).append(" ").append(list.get(key)).append("\n");
		}
		return sb.toString();
	}

}
