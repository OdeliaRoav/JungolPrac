package q1840;

import java.util.Scanner;

public class Main {
	static int h, w;
	static int [][] ar, visited;
	

	public static void printArr() {
		System.out.println("--- Arr ----------------");
		for(int i = 0; i < ar.length; i++) {
			for(int j = 0; j<ar[i].length; j++) {
				System.out.print(ar[i][j]+ " ");				
			}
			System.out.println();
		}
	}
	
	public static void printVisited() {
		System.out.println("--- Visited ----------------");
		for(int i = 0; i < ar.length; i++) {
			for(int j = 0; j<ar[i].length; j++) {
				System.out.print(visited[i][j]+ " ");				
			}
			System.out.println();
		}
	}
	
	public static boolean checkCheese() {
		boolean isCheese = false;
		for(int i = 0; i < ar.length; i++) {
			for(int j = 0; j<ar[i].length; j++) {
				if(ar[i][j] == 1) {
					isCheese = true;
					
				}
			}
			
		}
		return isCheese;
	}
	
	public static void meltingCheese() {
		
	}
	
	private static int countingCheese() {
		
	}
	
	
	public static void r(int ph, int pw) {
		visited[ph][pw] = 1;
		
		// 탈출 조건
		if(ar[ph][pw] == 1) {
			ar[ph][pw] = 2;
			return; 
		}
		
		// recucrsive 
		
		// UP
		if(ph>0 && visited[ph-1][pw] == 0) 
			r(ph-1, w);
		// DOWN
		if(ph<h-1 && visited[ph+1][pw] == 0) 
			r(h+1, w);
		// LEFT
		if(pw>=1 && visited[ph][pw-1] == 0) 
			r(h, w-1);
		// RIGHT
		if(pw<w-1 && visited[ph][pw+1] == 0) 
			r(h, w+1);
		
	}
	
	public 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		w = sc.nextInt();
		
		ar = new int[h][w];
		visited = new int[h][w];
		
		for(int i = 0; i < ar.length; i++) {
			for(int j = 0; j<ar[i].length; j++) {
				ar[i][j] = sc.nextInt();
				
			}
		}
		sc.close();
		
		int time = 0;
		
		do {
			System.out.println(time++));
			initVisited();
			
			printArr();
			printVisited();
			
			r(0,0);
			meltingCheese();
			
			
			
		}while(checkCheese());
		
	}

}
