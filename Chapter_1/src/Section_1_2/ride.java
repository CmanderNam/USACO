package Section_1_2;  
/*
ID: samueln1
LANG: JAVA
TASK: ride
*/
import java.io.*;
import java.util.*;
public class ride {
	static Scanner in;
	static PrintWriter out;
	static String inFile = "ride.in";
	static String outFile = "ride.out";
	static String result = "";
	static String[] input;
	
	public static void main(String[] args) {
		try{
			in = new Scanner(new File(inFile));
			out = new PrintWriter(new File(outFile));
			input = new String[2];
			init();
			result = solve();
			out.println(result);
			in.close();
			out.close();
		}catch(Exception e){
			System.out.println(e);
		}

	}
	
	private static void init(){
		input[0] = in.nextLine();
		input[1] = in.nextLine();
	}
	
	private static String solve(){
		int n1 = convert(input[0]);
		int n2 = convert(input[1]);
		
		if(n1==n2) return "GO";
		else return "STAY";
	}
	
	static int convert(String s){
		int product = 1;
		for(int i=0; i<s.length(); i++){
			char c = s.charAt(i);
			product*=c-'A'+1;
		}
		product%=47;
		return product;
	}

}
