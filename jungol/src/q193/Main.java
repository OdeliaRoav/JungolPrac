package q193;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 5개의 단어 입력 받기
        String[] Array = new String[5];
        for (int i = 0; i < 5; i++) {
            Array[i] = sc.next();
        }

        // 검색할 문자 및 단어 입력 받기
        char d = sc.next().charAt(0);
        String b = sc.next();

        boolean found = false;

        // 특정 문자를 포함하는 단어 출력
        for (String word : Array) {
            if (word.indexOf(d) != -1 || word.contains(b)) {
                System.out.println(word);
                found = true;
            }
        }

        // 아무것도 출력되지 않았다면 "none" 출력
        if (!found) {
            System.out.println("none");
        }

        sc.close();
    }
}
