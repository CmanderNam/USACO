package Section_1_2;
/*
ID: samueln1
LANG: JAVA
TASK: friday
*/
import java.io.*;
import java.util.*;
public class friday {
	static Scanner in;
	static PrintWriter out;
	static int n;
	static int[] week;
	static int[] year = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	static int[] leapyear = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	static StringBuilder sb;
	public static void main(String[] args) {
		try{
			in = new Scanner(new File("friday.in"));
			out = new PrintWriter(new File("friday.out"));
			init();
			out.println(solve());
			in.close();
			out.close();
		}catch(Exception e){
			System.out.println(e);
		}
		
	}
	
	
	private static void init(){
		n = in.nextInt();
		week = new int [7];
		sb = new StringBuilder();
	}
	
	private static String solve(){
		int month = 12;
		int date = 0;
		for(int i=1900; i<1900+n; i++){
			for(int j=0; j<12; j++){
				date = month%7;
				week[date]++;
				if(j==1 && isleapyear(i)){
					month+=1;
				}
				month+=year[j];
			}
		}
		 sb.append(week[5]).append(" ").append(week[6]).append(" ").append(week[0]).append(" ").append(week[1]).append(" ").append(week[2]).append(" ").append(week[3]).append(" ").append(week[4]);
		 return sb.toString();
	}
	
	private static boolean isleapyear(int currentyear){
		return currentyear % 4 ==0 &&(currentyear % 400==0 || currentyear %100 !=0);
	}

}
