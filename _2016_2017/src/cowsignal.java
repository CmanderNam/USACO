import java.io.*;
import java.util.*;
public class cowsignal {

	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("cowsignal.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("cowsignal.out")));
		StringTokenizer st = new StringTokenizer(f.readLine());
		int height = Integer.parseInt(st.nextToken());
		int length = Integer.parseInt(st.nextToken());
		int enlarge = Integer.parseInt(st.nextToken());
		
		String temp = "";
		
		for(int k=0; k<height; k++){
			String a = f.readLine();
			for(int i=0; i<a.length(); i++){
				for(int j=0; j<enlarge; j++){
					temp+=a.charAt(i);
				}
			}
			for(int j=0; j<enlarge; j++)
				out.println(temp);
			temp="";
		}
		f.close();
		out.close();
	}

}
