import java.util.*;
import java.io.*;
public class Main53G {

	public static void main(String[] args) throws Exception {
		
//		Scanner s = new Scanner(System.in);
		Scanner s = new Scanner(new File("Main53G.txt"));
		
		
		String x = s.nextLine();
		for(int y = 0; y < x.length(); y++) {
			int extent = 1;
			while(y+extent < x.length() && x.charAt(y) == x.charAt(y+extent)) {
				
				extent++;
				
			}
			
			String a = "" + x.charAt(y) + extent;
			
			System.out.print(a);
			y+=extent-1;
		}
		
		
	}
	
	
}
