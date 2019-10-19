import java.io.*;
import java.util.*;
public class measurement {

	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("measurement.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("measurement.out")));
		Map<String,Integer> m1 = new HashMap<String,Integer>();
		m1.put("Bessie", 1);
		m1.put("Elsie", 2);
		m1.put("Mildred", 3);
		int num = Integer.parseInt(f.readLine());
		int[][] d = new int[101][2];
		
		for(int i=0; i<num; i++){
			StringTokenizer st = new StringTokenizer(f.readLine());
			int day = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			int milk = Integer.parseInt(st.nextToken());
			d[day][0] = m1.get(name);
			d[day][1] = milk;
		}
		int change = 0;
		int Bessie = 0;
		int Elsie = 0;
		int Mildred = 0;
		boolean b=true;
		boolean e=true;
		boolean m=true;
		boolean tempb=true;
		boolean tempe=true;
		boolean tempm=true;
		for(int i=1; i<101; i++){
			if(d[i][0]==1)
				Bessie+=d[i][1];
			else if(d[i][0]==2)
				Elsie+=d[i][1];
			else if(d[i][0]==3)
				Mildred+=d[i][1];
			
			int max = Math.max(Math.max(Bessie,Elsie), Math.max(Elsie, Mildred));
			if(Bessie == max)
				tempb=true;
			else
				tempb=false;
			
			if(Elsie == max)
				tempe=true;
			else
				tempe=false;
			
			if(Mildred == max)
				tempm = true;
			else
				tempm = false;
			
			if(b!=tempb || e!=tempe || m!=tempm)
				change++;
			b=tempb;
			e=tempe;
			m=tempm;
		}
		out.println(change);
		f.close();
		out.close();
	}
}
