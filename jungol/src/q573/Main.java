package q573;

import java.util.Scanner;

public class Main {
	
	public static void print(int a) {
		int count = 0;
		
		for(int i = 0 ; i<a; i++) {
			for(int j = 0; j<a; j++) {
				count++;
				System.out.print(count + " ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		print(a);
		
		
	}

}
