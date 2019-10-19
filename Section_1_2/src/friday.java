/*
ID: samueln1
LANG: JAVA
TASK: friday
 */
import java.io.*;
import java.util.*;
public class friday {

	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("friday.in"));
		PrintWriter out = new PrintWriter(new FileWriter("friday.out"));
		
		int n = Integer.parseInt(f.readLine());
		
		int[] week = new int [7];
		
		
		int[] year = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] leapyear = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int day = 12;
		int date = 0;
		for(int i=1900; i<1900+n; i++){
			for(int j=0; j<12; j++){
				date = day%7;
				week[date]++;
				if(isleapyear(i)){
					day+=leapyear[j];
				}
				else
					day+=year[j];
			}
		}
		out.println(week[5]+" "+week[6]+" "+week[0]+" "+week[1]+" "+week[2]+" "+week[3]+" "+week[4]);
		
		out.close();
		f.close();
		
		
		
		
	}
	public static boolean isleapyear(int currentyear){
		boolean result = false;
		if(currentyear%100==0){
			if(currentyear%400==0)
				result = true;
		}
		else if(currentyear%4==0)
			result = true;
		
		return result;
	}
}
