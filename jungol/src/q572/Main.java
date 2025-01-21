package q572;

import java.util.Scanner;

public class Main {

	public static double Circle(int a) {
		double b = a* a*3.14;
		
		return b;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		System.out.printf("%.2f",Circle(a));
		
	}

}
