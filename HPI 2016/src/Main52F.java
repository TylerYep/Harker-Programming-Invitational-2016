import java.util.*;
import java.io.*;

public class Main52F {

	public static void main(String[] args) throws Exception {

		Scanner s = new Scanner(System.in);
//		Scanner s = new Scanner(new File("Main52F.txt"));
		
		int n = s.nextInt();
		int initial = s.nextInt();
		boolean baseChange = false;
		int changedNum = 0;

		
		while (s.hasNext()) {

			String operation = s.next();
			int number = s.nextInt();

			if (operation.equals("ADD")) {
				initial += number;
			}
			if (operation.equals("SUB")) {
				initial -= number;
			}
			if (operation.equals("MUL")) {
				initial *= number;
			}
			if (operation.equals("DIV")) {
				initial /= number;
			}
			if (operation.equals("COB")) {
				baseChange = true;
				
				//find length of int 
				String tempNum = "" + initial;
//				System.out.println("Temp num is " + tempNum);
				int lengthNum = tempNum.length();
				int counter = lengthNum-1;
				
//				while(initial > 0) {
//					int temp = initial / (int) Math.pow(10, counter);
//					changedNum += temp * (int) Math.pow(number, counter);
//					initial = initial % 10;
//					counter--;
//				}
				
				for(int i = 0; i < lengthNum; i++, counter--) {
//					System.out.println("For loop run");
//					System.out.println("char is " + tempNum.charAt(i));
//					System.out.println(Math.pow(number,counter) + "should be 4");
					
					switch (tempNum.charAt(i)) {
						case '0': break;
						case '1': changedNum += 1 * Math.pow(number, counter); break;
						case '2': changedNum += 2 * Math.pow(number, counter); break;
						case '3': changedNum += 3 * Math.pow(number, counter); break;
						case '4': changedNum += 4 * Math.pow(number, counter); break;
						case '5': changedNum += 5 * Math.pow(number, counter); break;
						case '6': changedNum += 6 * Math.pow(number, counter); break;
						case '7': changedNum += 7 * Math.pow(number, counter); break;
						case '8': changedNum += 8 * Math.pow(number, counter); break;
						case '9': changedNum += 9 * Math.pow(number, counter); break;
					}
					
//					System.out.println("Value of changed num is " + changedNum);
					
				}
				
				
			}

		}
		
		if(baseChange) {
			System.out.println(changedNum);
		}
		else {
			System.out.println(initial);
		}

	}

}
