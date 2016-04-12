import java.util.*;
import java.io.*;
public class Main23C {

	public static void main(String[] args) throws Exception {
		
		Scanner s = new Scanner(System.in);
//		Scanner s = new Scanner(new File("Main23C.txt"));
		
		ArrayList<Integer> input = new ArrayList<Integer>();
		int[] ints = new int[10000];
		
		int total = s.nextInt();
		
		while(s.hasNext()) {
			
			int i = s.nextInt();
			input.add(i);
			ints[i]++;
			
			
		}
		
		int output = 0;
		boolean duplicate = false;
		
		for(int i: input) {
			
			if(ints[i] > 1) {
				output = i;
				duplicate = true;
				
			}
			
		}
		
		if(duplicate) {
			System.out.println(output);
		}
		else {
			System.out.println("NONE");
		}
		
		
		
		
	}
	
	
}
