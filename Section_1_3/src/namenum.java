/*
ID: samueln1
LANG: JAVA
TASK: namenum
 */
import java.io.*;
import java.util.*;
public class namenum {

	static int[] a = {2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,0,7,7,8,8,8,9,9,9,0};
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("namenum.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("namenum.out")));
		BufferedReader d = new BufferedReader(new FileReader("dict.txt"));
		Set<String> ans = new TreeSet<String>();
		long input = Long.parseLong(f.readLine());
		int len = (input+"").length();
		//System.out.println(input);
		String name="";
		 while ((name = d.readLine()) != null) {	
			//if(name.equals("GREG")) System.out.println(name);
			//System.out.println(convert("GREG"));
			if(len==name.length()){
				if(input==convert(name)){
					//System.out.println(convert(name));

					ans.add(name);
				}
			}

		}
		
		if(ans.size()==0){
			out.println("NONE");
		}
		
		else for(String s:ans){
			out.println(s);
		}
		out.close();
		f.close();
		d.close();
		
	}

	static long convert(String s){
		String num = "";
		for(int i=0; i<s.length(); i++){
			
			int temp = a[s.charAt(i)-'A'];
			num+=temp+"";
		}
		return Long.parseLong(num);
	}
}
/*
2: A,B,C     5: J,K,L    8: T,U,V
3: D,E,F     6: M,N,O    9: W,X,Y
4: G,H,I     7: P,R,S
*/
