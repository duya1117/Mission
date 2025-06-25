package Four;

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer;
        int number;
        int count = 0;

        answer = (int)(Math.random() * 100 + 1);


            System.out.println("1~100사이에서 정답을 맞춰주세요.");
            number= scanner.nextInt();

        for(;;) {
            if(number < answer) {
                System.out.println("\n" + number + "는 정답보다 작습니다.");
                count++;
            } else if (number > answer) {
                System.out.println("\n" + number + "는 정답보다 큽니다.");
                count++;
            } else {
                System.out.println("\n" + "정답입니다.");
                count++;
                break;
            }
            System.out.printf("다시 맞춰주세요.");
            number= scanner.nextInt();
        }
        System.out.println("정답 시도 횟수는 " + count + "번 입니다.");
    }
}
