package q196;

import java.util.Scanner;

class Info {
    String name;
    int number;
    String Address;
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		 Info[] people = new Info[3];
		 
		 for(int i = 0; i<3; i++) {
			 people[i] = new Info();
			 people[i].name = sc.next();
			 people[i].number = sc.nextInt();
			 people[i].Address = sc.next();
			 
		 }

		
	}

}
