package exception;

import java.util.Scanner;

public class Main {
	static int n, m;
	static int ar[];
	
	public static void dice(int p) {
		if(p==n) {
			for(int i = 0; i<ar.length; i++) {
				System.out.print((ar[i]+1) + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i = 0; i<m; i++) {
			ar[p] = i;
			dice(p + 1);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		sc.close();
		
		ar = new int[n];
		dice(0);
		
	}
}
/*
1 1 1 
1 1 2
1 2 1
1 2 2
2 1 1 
2 1 2 
2 2 1
2차원 배열로 볼 수 있을 것 같은데
근데 언제로 나누어야하는가 

while(count<=a){
	for(int i = 1; i<=a; i++){
		System.out.print(i);
		for(int j = 1; j<=b; j++){
			System.out.print(j);
	}
	System.out.println();
	count++;
}

*/