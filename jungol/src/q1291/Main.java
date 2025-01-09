package q1291;

import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());*/
		
		while(true) {
			/*int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());*/
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a>=2 && a<=9 && b>=2 && b<=9) {
				if(a>b) {
					for(int i = 1; i<=9; i++) {
						for(int j = a; j>=b; j--) {
							System.out.printf("%d * %d =%3d   ", j, i , j*i);
							}
						System.out.println();
						}
				}
				else if(b>a) {
					for(int i = 1; i<=9; i++) {
						for(int j = a; j<=b; j++) {
							System.out.printf("%d * %d =%3d   ", j, i, j*i);
						}
						System.out.println();
					}
				}
				else {
					for(int i = 1; i<=9; i++) {
						System.out.printf("%d * %d =%3d\n", a, i, a*i);
					}
				}
				break;
			}
			else {
				System.out.println("INPUT ERROR!");
			}
		}
	}
//System.out.println(a + " * " + i + " = "+a*i +"   " +  b + " * " + i + " = " + b*i  );
}//System.out.printf("%d * %d =%3d   %d * %d =%3d \n", a, i, a*i, b, i, b*i );
