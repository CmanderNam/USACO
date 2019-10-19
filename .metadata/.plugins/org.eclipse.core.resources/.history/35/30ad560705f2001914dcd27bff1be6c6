import java.io.*;
import java.util.*;
public class paint {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("paint.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("paint.out")));
		
		//Data Organizer
		boolean[] arr = new boolean[101];
		int a= in.nextInt();
		int b= in.nextInt();
		int c= in.nextInt();
		int d= in.nextInt();
		
		for(int i=a; i<b; i++)
			arr[i]=true;
		
		for(int i=c; i<d; i++)
			arr[i]=true;
		int length = 0;
		for(int i=0; i<101; i++)
			if(arr[i]==true)
				length++;
		out.println(length);
		out.close();
	}

}
