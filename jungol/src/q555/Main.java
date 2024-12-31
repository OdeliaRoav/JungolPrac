
package q555;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String Array[] = new String[10];
		
		for(int i = 0;  i < Array.length; i++) {
			Array[i] = sc.next();
		}
		
		for(int i = 0; i < Array.length; i++) {
			System.out.print(Array[i]);
		}
		
	}

}
