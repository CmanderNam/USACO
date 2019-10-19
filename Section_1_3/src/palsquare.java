/*
ID: samueln1
LANG: JAVA
TASK: palsquare
 */
import java.util.*;
import java.io.*;
public class palsquare {

	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("palsquare.in"));
		PrintWriter out = new PrintWriter(new FileWriter("palsquare.out"));
		int B = Integer.parseInt(f.readLine());
		for(int i=1; i<=300; i++){
			String temp = Integer.toString((int)Math.pow(i, 2), B)+"";
			String Int = Integer.toString(i,B);
			int count=0;
			for(int j=0; j<temp.length()/2; j++){
				if(temp.charAt(j)==temp.charAt(temp.length()-j-1))
					count++;
			}
			if(count==temp.length()/2){
				out.println(Int.toUpperCase() + " " + temp.toUpperCase());
			}
			
		}
		out.close();
		f.close();
	}
	
}
