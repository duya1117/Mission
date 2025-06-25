package Three;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Start start = new Start();
        int basicMoney;

        System.out.println("초기 금액을 설정해 주세요.");
        basicMoney = scanner.nextInt();

        start.repeat(basicMoney);

    }
}
