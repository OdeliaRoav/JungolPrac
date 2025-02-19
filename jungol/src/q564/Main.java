package q564;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] count = new int[26]; // 알파벳 개수 저장 배열

        while (sc.hasNext()) {
            char ch = sc.next().charAt(0); // 한 글자 입력받기
            if (ch < 'A' || ch > 'Z') break; // 대문자가 아니면 입력 종료
            count[ch - 'A']++; // 해당 문자 카운트 증가
        }

        sc.close();

        
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) { // 1번 이상 등장한 문자만 출력
                System.out.println((char) (i + 'A') + " " + count[i]);
            }
        }
    }
}
