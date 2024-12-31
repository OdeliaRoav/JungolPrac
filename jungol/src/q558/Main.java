package q558;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Array[] = new int[100];
		int count = 0;
		
		for(int i = 0 ; i<100; i++) {
			Array[i] = sc.nextInt();
			count++;
			if(Array[i] == 0) {
				break;
			}
		}
		
		for(int i = count-2; i>=0; i-- ) {
			System.out.print(Array[i] + " ");
		}
	}

}
