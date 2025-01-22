package q560;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Array[] = new int[10];
		
		for(int i = 0; i<10; i++) {
			Array[i] = sc.nextInt();
		}
		
		int min = Array[0];
		
		for(int i = 0; i<10; i++) {
			if(min>=Array[i]) {
				min = Array[i];
			}
		}
		
		System.out.println(min);
	}

}
