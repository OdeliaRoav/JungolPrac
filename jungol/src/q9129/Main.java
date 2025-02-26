package q9129;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		String result = String.format("%.2f", a);
		String result2 = String.format("%.2f", b);
		String result3 = String.format("%.2f", c);
		
		String result4 = result.concat(result2);
		String result5 = result4.concat(result3);
		
		for(int i = 0; i< result5.length(); i++) {
			if(result5.charAt(i)== '.') {
				System.out.println();
				continue;
			}
			else {
				System.out.print(result5.charAt(i));
				
			}
		}
		
		
	}

}
