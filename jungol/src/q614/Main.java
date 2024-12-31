package q614;

import java.util.Scanner;

class SchoolInfo {
    String schoolName;
    int grade;

    // 생성자
    public SchoolInfo(String schoolName, int grade) {
        this.schoolName = schoolName;
        this.grade = grade;
    }
}

public class Main {
    public static void main(String[] args) {
        // 첫 번째 변수 초기화
        SchoolInfo info1 = new SchoolInfo("Jejuelementary", 6);

        // 두 번째 변수 사용자 입력
        Scanner scanner = new Scanner(System.in);

        System.out.println("새로운 학교명을 입력하세요 (20자 이하의 영문자):");
        String newSchoolName = scanner.nextLine();

        // 입력 검증
        while (newSchoolName.length() > 20 || !newSchoolName.matches("[a-zA-Z ]+")) {
            System.out.println("잘못된 입력입니다. 20자 이하의 영문자로 입력해주세요:");
            newSchoolName = scanner.nextLine();
        }

        System.out.println("새로운 학년을 입력하세요 (숫자):");
        int newGrade = scanner.nextInt();

        // 두 번째 변수 초기화
        SchoolInfo info2 = new SchoolInfo(newSchoolName, newGrade);

        // 출력
        System.out.println("\n출력 결과:");
        System.out.println("첫 번째 학교명: " + info1.schoolName + ", 학년: " + info1.grade);
        System.out.println("두 번째 학교명: " + info2.schoolName + ", 학년: " + info2.grade);
    }
}
