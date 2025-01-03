package q593;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("ASCII code =? ");
			
			int num = sc.nextInt();
			if(num<=127&&num>=33) {
				char ch = (char)num;
				System.out.println(ch);
			}
			else {
				break;
			}
	
	
	}
	}
}
