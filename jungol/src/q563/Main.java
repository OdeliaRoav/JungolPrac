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
		
		//Arrays.sort(Array);
		
		for(int i = 0; i<Array.length-1; i++) {
			for(int j = 0; j<Array.length -i -1; j++) {
				if(Array[j]>Array[j+1]) {
					
					int num = Array[j];
					Array[j] = Array[j+1];
					Array[j+1] = num;
				}
				
			}
		}
		
		for(int i = Array.length-1; i>=0; i--) {
			System.out.print(Array[i] + " ");
		}
		
		
		
	}

}
