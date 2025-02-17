package q617;
import java.util.Scanner;

class Student{
	String Name;
	int height;
};

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student a[] = new Student[5];
		for(int i = 0; i<5; i++) {
			a[i] = new Student();
		}
		
		for(int i = 0; i<5; i++) {
			a[i].Name = sc.next();
			a[i].height = sc.nextInt();	
		}
		
		int b = a[0].height;
		int c = 0;
		
		for(int i = 0; i<5; i++) {
			if(b>a[i].height) {
				b = a[i].height;
				c = i;
			}
		}
		
		System.out.print(a[c].Name + " "+a[c].height);
	}

}