package q607;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String a = sc.next();
		String b = sc.next();
		
		String c = a.substring(0,2);
		
		
		System.out.print(c);
		
		for(int i = 0; i<b.length()-2; i++) {
			System.out.print(b.charAt(i+2));
		}
		System.out.print(c);
	}
//관련 함수들 하나도 안쓰고 맞음 ㄷㄷ;;
}
