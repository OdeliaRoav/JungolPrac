package q196;

import java.util.Arrays;
import java.util.Scanner;

class Info implements Comparable<Info> {
    String name;
    String number;
    String address;  // 변수명 수정 (일반적으로 소문자로 시작)

    @Override
    public int compareTo(Info other) {
        return this.name.compareTo(other.name);  // 이름 기준 사전순 정렬
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Info[] people = new Info[3];

        // 입력 받기
        for (int i = 0; i < 3; i++) {
            people[i] = new Info();
            people[i].name = sc.next();
            people[i].number = sc.next();
            people[i].address = sc.next();
        }
        
        // 정렬 (이름 기준)
        Arrays.sort(people);  

        System.out.println("name : " + people[0].name);
        System.out.println("tel : " + people[0].number);
        System.out.println("addr : " + people[0].address);
        
       }
}
