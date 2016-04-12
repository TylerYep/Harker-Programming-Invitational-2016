import java.util.Scanner;
import java.io.*;


public class MainChal {
	
	public static boolean rowChecker(String[][] grid){
		boolean isTrue = false;
		for (int i=0; i < 3; i++) {
			if(grid[i][0].equals(grid[i][1]) && grid[i][0].equals(grid[i][2])) {
				isTrue = true;
			}
		}
		return isTrue;
	}
	public static boolean colChecker(String[][] grid){
		boolean isTrue = false;
		for (int i=0; i < 3; i++) {
			if(grid[0][i].equals(grid[1][i]) && grid[0][i].equals(grid[2][i])) {
				isTrue = true;
			}
		}
		return isTrue;
	}
	public static boolean diagChecker(String[][] grid){
		boolean isTrue = false;
			if(grid[0][0].equals(grid[1][1]) && grid[0][0].equals(grid[2][2])) {
				isTrue = true;
			}
			if(grid[2][0].equals(grid[1][1]) && grid[0][0].equals(grid[0][2])) {
				isTrue = true;
			}
		return isTrue;
	}
	
	public static void main(String[] args) throws Exception {
		
		String result = "NO";
		
//		Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("MainChal.txt"));

		String choice = in.next();
		String[][] grid = new String[3][3];
		//Initialized grid
		
		int rowBoard = 0;
		while(in.hasNext()) { 
			String s = in.next();
			for(int col = 0; col < 3; col++) { 
				grid[rowBoard][col] = ""+ s.charAt(col);
			}
			rowBoard++;
		}
		String[][] newGrid = new String[3][3];
		for (int row = 0; row<3;row++){
			for (int col = 0; col<3;col++){
				if (grid[row][col].equals(".")){
					newGrid = grid;
					newGrid[row][col]=choice;
					if((!rowChecker(newGrid) && !colChecker(newGrid) && !diagChecker(newGrid))){
						result = "YES";
					}
				}
			}
		}
		System.out.println(result);
	}
}
