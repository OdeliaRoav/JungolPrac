package q1856;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int h = sc.nextInt(), r = sc.nextInt();
      sc.close();
      int[][] a = new int[r][h]; 
      int n = 1;
      for (int i = 0; i < h; i++) {
         if ((i + 1) % 2 == 1 ) {
            for (int k = 0; k < r; k++) {
               a[k][i] = n++;
            }
         }
         else {
            for (int k = r - 1; k >= 0; k--) {
               a[k][i] = n++;
            }
         }
      }
      
      for (int i = 0; i < h; i++) {
         for (int k = 0; k < r; k++) {
            System.out.print(a[k][i] + " ");
         }
         System.out.println();
      }
         
   }

}
