package q538;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		
		
		while(true) {
			System.out.print("number? ");
			int a = sc.nextInt();
			
			if(a<0) {
				System.out.println("negative number");
			}
			else if(a>0) {
				System.out.println("positive integer");
			}
			else {
				break;
			}
			
			
		}
		
	}

}
