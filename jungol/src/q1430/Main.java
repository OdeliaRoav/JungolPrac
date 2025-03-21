package q1430;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int d = a * b * c;
        
        String e = Integer.toString(d);
        
        int[] Array = new int[10];

        for (int i = 0; i < e.length(); i++) {
            int num = e.charAt(i) - '0'; 
            Array[num]++;
        }

        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i]);
        }

    }
}
