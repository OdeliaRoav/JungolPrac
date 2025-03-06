package q1314;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
 
        char[][] charArr = new char[n][n];
         
        char start = 'A';
         
        for(int i = 0; i < n; i++) {
            if(i % 2 == 0) {
                for(int j = 0; j < n; j++) {
                    if(start > 'Z') start = 'A';
                    charArr[j][i] = start++;
                }
            }else {
                for(int j = n-1; j >= 0; j--) {
                    if(start > 'Z') start = 'A';
                    charArr[j][i] = start++;
                }
            }
        }
         
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(charArr[i][j] + " ");
            }
            System.out.println();
        }
         
    }
}