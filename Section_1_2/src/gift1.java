/*
ID: samueln1
LANG: JAVA
TASK: gift1
 */
import java.io.*;
import java.util.*;
public class gift1 {

	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("gift1.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));
		Map<String,Integer> P = new LinkedHashMap<String, Integer>();
		StringTokenizer st;
		
		int num = Integer.parseInt(f.readLine());
		for(int i=0; i<num; i++){
			P.put(f.readLine(), 0);
		}
		
		for(int i=0; i<num; i++){
			String name = f.readLine();
			st = new StringTokenizer(f.readLine());
			int money = Integer.parseInt(st.nextToken());
			int numppl = Integer.parseInt(st.nextToken());
			if(numppl>0){	
				int distributed = money/numppl;
				int leftover = money%numppl;
				P.replace(name, P.get(name), P.get(name)-money+leftover);
				for(int j=0; j<numppl; j++){
					String receiver = f.readLine();
					P.replace(receiver, P.get(receiver), P.get(receiver)+distributed);
				}
			}
		}
		for(String s:P.keySet())
			out.println(s+" "+P.get(s));
		
		out.close();
		f.close();		
	}

}