package q599;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		
		String numStr = a.replaceAll("[0-9]", "");
		numStr = numStr.replaceAll("[^a-zA-Z0-9]", "");
		numStr = numStr.toUpperCase();
		
		System.out.print(numStr);
	}

}   
