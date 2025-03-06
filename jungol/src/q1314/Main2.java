package q1314;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] arr = new char[n][n];

        // 문자 채우기
        for (int row = 0; row < n; row++) {
            char ch = (char) ('A' + row); // 각 행의 시작 문자 설정
            for (int col = 0; col < n; col++) {
                arr[row][col] = ch;
                ch += n; // 다음 열에서는 n만큼 증가
            }
        }

        // 출력
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
