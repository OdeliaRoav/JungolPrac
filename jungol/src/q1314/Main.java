package q1314;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char ch = 'A';
		
		int n = sc.nextInt();
		
		for(int j = 0; j<n; j++) {
			ch = (char) ('A' + j);
			for(int i = 1; i<=n; i++) {
				System.out.print(ch+" ");
				ch+=n;
			}
			System.out.println();
			
		}
		
		
	}

}
