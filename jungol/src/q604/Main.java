package q604;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String array[] = new String[10];
		

		for(int i = 0; i<10; i++) {
			array[i] = sc.next();
		}
		
		String a = sc.next();
		char b = a.charAt(0);
		
		for(int i = 0; i<10; i++) {
			if(b == array[i].charAt(array[i].length()-1)) {
				System.out.println(array[i]);
			}
			
			
		}
		
		
	}

}
