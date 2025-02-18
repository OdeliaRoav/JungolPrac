package q561;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a [] = new int [10];
		
		int max = 0;
		int min = 0;
		
		for(int i = 0; i < 10; i++) {
			a[i] = sc.nextInt();
			
			if(a[i] >= 100) {
				max = a[i];
			}
			
		}
		
		int count = 0;
		int countb = 0;
		
		for(int i = 0; i < 10; i++) {
			if(a[i]>=100) {
				count ++;
			}
			else {
				countb ++;
			}
		}

		
		if(count == 0) {
			max = 100;
			for(int i = 0; i < 10; i++) {
				if(min<a[i]) {
					min = a[i];
				}
			}
		}
		else if(countb == 0) {
			min = 100;
			for(int i = 0; i < 10; i++) {
				if(max>a[i]) {
					max = a[i];
				}
			}
		}
		else {
			for(int i = 0; i < 10; i++) {
				if(a[i]>=100) {
					if(max>a[i]) {
						max = a[i];
					}
				}
				else {
					if(min<a[i]) {
						min = a[i];
					}
				}
			}
		}
		
		
		
		System.out.print(min + " " + max);
	}
}

//88 123 659 15 443 1 99 313 105 48
