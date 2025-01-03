package q615;

import java.util.Scanner;

public class Main {
	String name;
	int num1;
	int num2;
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Main j = new Main();
		
		j.name = sc.next();
		j.num1= sc.nextInt();
		j.num2 = sc.nextInt();
		
		Main s = new Main();

		s.name = sc.next();
		s.num1 = sc.nextInt();
		s.num2 = sc.nextInt();
		
		System.out.println(j.name +" "+ j.num1 + " "+j.num2);
		System.out.println(s.name + " " + s.num1 +" " +s.num2);
		System.out.println("avg " +  (j.num1+s.num1)/2 +" "+(j.num2 +s.num2)/2);
		
		
		
	}

}
