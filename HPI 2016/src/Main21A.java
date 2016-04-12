import java.util.*;
import java.io.*;
public class Main21A {

	public static void main(String[] args) throws Exception {
		
	//	Scanner s = new Scanner(System.in);
		Scanner s = new Scanner(new File("Main21A.txt"));
		String newSlogan = "";
		int c = 0;
		while(s.hasNext()){
		
			String x = s.next();
			if (c%3==0){
				newSlogan+=x;
				newSlogan+=" ";
			}
			c++;
		}
		
		
		System.out.println(newSlogan);
		
	}
	
	
}
