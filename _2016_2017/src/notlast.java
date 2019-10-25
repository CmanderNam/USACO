import java.util.*;
import java.io.*;

public class notlast {
	public static String[] cows = {"Bessie", "Elsie", "Daisy", "Gertie", "Annabelle", "Maggie", "Henrietta"};
	public static HashMap<String,Integer> map;

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(new File("notlast.in"));
		PrintWriter out = new PrintWriter(new FileWriter("notlast.out"));
		map = new HashMap<String,Integer>();
		for (int i=0; i<cows.length; i++)
			map.put(cows[i], i);

		
		int n = in.nextInt();
		pair[] list = new pair[cows.length];
		for (int i=0; i<cows.length; i++)
			list[i] = new pair(cows[i], 0);

		for (int i=0; i<n; i++) {
			String name = in.next();
			int c = in.nextInt();
			list[map.get(name)].count += c;
		}

		Arrays.sort(list);

		int i = 0;
		while (i < list.length && list[i].count == list[0].count) i++;
		
		if ((i < list.length-1 && list[i].count == list[i+1].count) || i == list.length)
			out.println("Tie");
		else
			out.println(list[i].name);

		out.close();
		in.close();
	}
}

class pair implements Comparable<pair> {

	public String name;
	public int count;

	public pair(String n, int c) {
		name = n;
		count = c;
	}

	public int compareTo(pair other) {
		return this.count - other.count;
	}
}