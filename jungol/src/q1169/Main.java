package q1169;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int Array[][][] = new int[6][6][6];
		
		if (M == 1) {
			for(int i = 1; i<=6; i++) {
				for(int j = 1; j<=6; j++) {
					for(int x = 1; x<=6; x++) {
						System.out.println(i + " " + j + " " + x);	
					}
				}
			}
			
		}
		else if (M == 2) {
			
		}
		
		
	}

}
