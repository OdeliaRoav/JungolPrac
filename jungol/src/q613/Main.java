package q613;

import java.util.Scanner;


class InFo {	
	String name;	
	String School;	
	int grade;
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		InFo p = new InFo();
		
		p.name = sc.next();
		p.School = sc.next();
		p.grade = sc.nextInt();
		
		System.out.println("Name : " + p.name);
		System.out.println("School : " + p.School);
		System.out.println("Grade : " + p.grade);
		
	}

}
