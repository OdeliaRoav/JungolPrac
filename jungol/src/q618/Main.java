package q618;

import java.util.Scanner;

class info {
    String Name;
    int height;
    float weight;
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        info[] a = new info[5];

        for (int i = 0; i < 5; i++) {
            a[i] = new info();
        }

        // 입력 받기
        for (int i = 0; i < 5; i++) {
            a[i].Name = sc.next();
            a[i].height = sc.nextInt();
            a[i].weight = sc.nextFloat();
        }
        
        sc.close();

        // 버블 정렬을 이용한 weight 기준 내림차순 정렬
        for (int i = 0; i < 5 - 1; i++) {
            for (int j = 0; j < 5 - 1 - i; j++) {
                if (a[j].weight < a[j + 1].weight) {
                    // 객체 교환 (swap)
                    info temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        // 정렬된 결과 출력
        System.out.println("weight");
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i].Name + " " + a[i].height + " " + a[i].weight);
        }
    }
}
