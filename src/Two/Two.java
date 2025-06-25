package Two;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Info info = new Info();
        String student;

        System.out.println("학생 이름과 점수를 적어주세요");
        System.out.println("----------------------");
        System.out.println("이름 | 국어 | 영어 | 수학");

        student = scanner.nextLine();

        info.input(student);
        info.result();
        info.rating(info.average);

        info.output();
    }
}

