package q563;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Array[] = new int[10];
		int Array2[] = new int[10];
		
		
		for(int i = 0; i< Array.length; i++) {
			Array[i] = sc.nextInt();
		}
		
		Arrays.sort(Array);
		
		for(int i = 0; i<Array.length; i++) {
			for(int j = i+1; j<Array.length; j++) {
				int num = Array[i];
				
				if(num<Array[j]) {
					num = Array[j];
				}
				
				Array2[i] = num;
				
			}
		}
		
		for(int i = Array.length-1; i>=0; i--) {
			System.out.print(Array[i] + " ");
		}
		
		
		
	}

}
