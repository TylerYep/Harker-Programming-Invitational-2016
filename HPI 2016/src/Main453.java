import java.util.*;
import java.io.*;
public class Main453{

	public static void main(String[] args) throws Exception {
		
		Scanner in = new Scanner(new File("Tyler.txt"));
		//Scanner in = new Scanner(System.in);
		int size = 0;
		int l = in.nextInt();
		int w = in.nextInt();
		for(int e = 0; e<l; e++){
			String x = in.next();
			for (int col = 0; col< w; col++){
				if(x.charAt(col)=='X'){
					size++;
				}
				
			}
			System.out.println(size);
		}
		System.out.println(size);
		
	}
	
	
}
