/*
ID: samueln1
LANG: JAVA
TASK: transform
 */
import java.io.*;
import java.util.*;
public class transform {
	static char[][] tile;
	static char[][] ans;
	static int num;
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("transform.in"));
		PrintWriter out = new PrintWriter(new FileWriter("transform.out"));
		
		num = Integer.parseInt(f.readLine());
		
		tile = new char[num][num];
		ans = new char[num][num];
		ans=tile.clone();
		char[][] comp = new char[num][num];
		
		for(int r=0; r<num; r++){
			String st = f.readLine();
			//System.out.println(st);
			for(int c=0; c<num; c++){
				tile[r][c] = st.charAt(c);
			}
		}
		
		for(int r=0; r<num; r++){
			String st = f.readLine();
			for(int c=0; c<num; c++){
				comp[r][c] = st.charAt(c);
			}
		}
		
		
		
		if(Arrays.deepEquals(comp, ninety(tile))){
			out.println("1");
		}
		else if(Arrays.deepEquals(comp, ninety(ninety(tile)))){
			out.println("2");
		}
		else if(Arrays.deepEquals(comp, ninety(ninety(ninety(tile))))){
			out.println("3");
		}
		else if(Arrays.deepEquals(comp, reflect(tile))){
			out.println("4");
		}
		else if(Arrays.deepEquals(comp, ninety(reflect(tile)))){
			out.println("5");
		}
		else if(Arrays.deepEquals(comp, ninety(ninety(reflect(tile))))){
			out.println("5");
		}
		else if(Arrays.deepEquals(comp, ninety(ninety(ninety(reflect(tile)))))){
			out.println("5");
		}
		else if(Arrays.deepEquals(comp, tile)){
			
			out.println("6");
			
		}
		else
			out.println("7");
		f.close();
		out.close();
		
	}

	private static char[][] ninety(char[][] input) {
	       char[][] ret = new char[input.length][input.length];
	       for(int i=0; i<input.length; i++) {
	           for(int j=0; j<input.length; j++) {
	               ret[j][input.length-1-i] = input[i][j];
	           }
	       }
	       return ret;
	   }

	
	private static char[][] reflect(char[][] input) {
	       char[][] ret = new char[input.length][input.length];
	       for(int i=0; i<input.length; i++) {
	           for(int j=input.length-1; j>=0; j--) {
	               ret[i][input.length-1-j] = input[i][j];
	           }
	       }
	       return ret;
	   }
	
	static void print(char[][] a){
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a.length; j++){
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
	
}
