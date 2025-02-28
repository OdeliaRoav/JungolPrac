package q190;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String Array[] = {"flower", "rose", "lily", "daffodil", "azalea"};
		
		String a = sc.next();
		char b = a.charAt(0);
		int count = 0;
		
		
		for(int i = 0; i<5; i++) {
			if(b == Array[i].charAt(1)){
				System.out.println(Array[i]);
				count ++;
			}
			else if (b == Array[i].charAt(2)) {
				System.out.println(Array[i]);
				count ++;
			}
		}
		
		System.out.print(count);
	}

}
