package q618;

import java.util.Scanner;

class Info {
    String name;
    int height;
    float weight;
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Info[] people = new Info[5];

        // 입력 받기
        for (int i = 0; i < 5; i++) {
            people[i] = new Info();
            people[i].name = sc.next();
            people[i].height = sc.nextInt();
            people[i].weight = sc.nextFloat();
        }

        sc.close();

        // 1. 이름순 정렬 (오름차순, 버블 정렬)
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                if (people[j].name.compareTo(people[j + 1].name) > 0) {
                    Info temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                }
            }
        }

        System.out.println("name");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%s %d %.1f\n", people[i].name, people[i].height, people[i].weight);
        }

        // 2. 몸무게순 정렬 (내림차순, 버블 정렬)
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                if (people[j].weight < people[j + 1].weight) {
                    Info temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                }
            }
        }

        System.out.println("weight");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%s %d %.1f\n", people[i].name, people[i].height, people[i].weight);
        }
    }
}
