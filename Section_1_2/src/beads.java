/*
ID: samueln1
LANG: JAVA
TASK: beads
 */
import java.io.*;
import java.util.*;
public class beads {

	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("beads.in"));
		PrintWriter out = new PrintWriter(new FileWriter("beads.out"));
		
		int num = Integer.parseInt(f.readLine());
		String bead = f.readLine();
		String necklace = bead+bead;
		
		
		
		int most = 0;
		for(int j=0; j<num; j++){
			int change = 0;
			int max = 0;
			String temp = necklace.substring(j,num+j);
			char c=' ';
			int position = 0;
			while(position<num){
				if(temp.charAt(position)=='r'){
					if(c=='b'){
						change++;
					}
					c=temp.charAt(position);
				}
				
				else if(temp.charAt(position)=='b'){
					if(c=='r'){
						change++;
					}
					c=temp.charAt(position);
				}
				if(change==2) break;
				max++;
				position++;
			}
			if(max>most){
				most=max;
			}
		}
		
		out.println(most);
		
		out.close();
		f.close();
		
	}

}
