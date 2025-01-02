package q614;

import java.util.Scanner;

public class Main{
	String School;
	int grade;
	
	
	Main(){	
	}
	
	Main(String str, int grade){
		this.School = str;
		this.grade = grade;				
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		Main sch = new Main("Jejuelementary School", 6);
		Main sch2 = new Main();
		
		sch2.School = sc.next();
		sch2.grade = sc.nextInt();
		
		System.out.println(sch.grade + " grade in " + sch.School);
		System.out.print(sch2.grade + " grade in " + sch2.School + " School");
		
	}
}