package q111;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		
		for(int i = 0; i<4; i++) {
			int a = sc.nextInt();
			sum += a;
			
		}
		
		int avg = sum/4;
		
		System.out.println("sum " + sum);
		System.out.println("avg " + avg);
		
	}

}
