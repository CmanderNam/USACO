/*
ID: samueln1
LANG: JAVA
TASK: ride
 */
import java.io.*;
import java.util.*;
public class ride {

	public static void main(String[] args) throws IOException{
		BufferedReader f = new BufferedReader(new FileReader("ride.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
		
		String comet = f.readLine();
		String group = f.readLine();
		int comettotal=1;
		int grouptotal=1;
		for(int i=0; i<comet.length();i++){
			char c = comet.charAt(i);
			comettotal=comettotal*(c-'A'+1);
		}
		for(int i=0; i<group.length();i++){
			char c = group.charAt(i);
			grouptotal=grouptotal*(c-'A'+1);
		}
		comettotal=comettotal%47;
		grouptotal=grouptotal%47;
		if(grouptotal==comettotal){
			out.println("GO");
		}
		else
			out.println("STAY");
		
		out.close();
		f.close();
	}

}
