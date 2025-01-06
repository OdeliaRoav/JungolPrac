package q529;

import java.util.Scanner;


public class Main {

	public static void print(int a, int b) {
		int obesity = b + 100-a;
		
		if(obesity>0) {
			System.out.println(obesity);
			System.out.print("Obesity");
		}
		else {
			System.out.print(obesity);
		}
		
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		print(a, b);
	}

}
