package q563;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Array[] = new int[10];
		int Array2[] = new int[10];
		
		
		for(int i = 0; i< Array.length; i++) {
			Array[i] = sc.nextInt();
		}
		
		for(int i = 0; i<Array.length; i++) {
			for(int j = i; j<Array.length; j++) {
				int num = Array[i];
				
				if(num<Array[j]) {
					num = Array[j];
				}
				
				Array2[i] = num;
				
			}
		}
		
		for(int i = 0; i<Array.length; i++) {
			System.out.print(Array2[i] + " ");
		}
		
		
		
	}

}
