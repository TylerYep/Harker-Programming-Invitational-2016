import java.util.*;
import java.io.*;
public class Main22B {

	public static void main(String[] args) throws Exception {
		
		Scanner s = new Scanner(System.in);
		
		String i1 = s.nextLine();
		String i2 = "";
		for (int c = i1.length()-1; c>=0; c--){
			i2 += i1.charAt(c);
		}
		System.out.println(i2);
		
	}
	
	
}
