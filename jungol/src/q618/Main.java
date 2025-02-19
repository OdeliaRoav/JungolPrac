package q618;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

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
            people[i].name = sc.next(); // 이름 (최대 20자)
            people[i].height = sc.nextInt();
            people[i].weight = sc.nextFloat();
        }
        
        sc.close();

        // 1. 이름순 정렬 (오름차순)
        Arrays.sort(people, Comparator.comparing(o -> o.name));

        System.out.println("name");
        for (Info person : people) {
            System.out.printf("%s %d %.1f\n", person.name, person.height, person.weight);
        }
        
        System.out.println();
        // 2. 몸무게순 정렬 (내림차순)
        Arrays.sort(people, Comparator.comparingDouble((Info o) -> o.weight).reversed());

        System.out.println("weight");
        for (Info person : people) {
            System.out.printf("%s %d %.1f\n", person.name, person.height, person.weight);
        }
    }
}
