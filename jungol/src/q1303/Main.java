package q1303;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i = 1; i <= a*b; i++) {
			System.out.print(i + " ");
			if(i % b == 0 ) {
				System.out.println("");
			}
		}
		sc.close();
	}

}
