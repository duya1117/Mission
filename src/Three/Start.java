package Three;

import java.util.Scanner;

class Start {
    Scanner scanner = new Scanner(System.in);
    int choice;
    int money;
    int total;
    boolean stop = false;

    void repeat(int basicMoney) {
        total = basicMoney;
        do {
            System.out.println("\n무엇을 하시겠습니까?\n입금 = 1\t\t출금 = 2\t\t종료 = 0");
            choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    System.out.println("입금 하실 금액을 입력해주세요.");
                    money = scanner.nextInt();
                    input(money);
                    break;
                case 2:
                    System.out.println("출금 하실 금액을 입력해주세요.");
                    money = scanner.nextInt();
                    output(money);
                    break;
                case 0:
                    stop = true;
                    System.out.println("종료되었습니다.");
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        } while (!stop);
    }
    void input(int money){
        total += money;
        System.out.println("입금 --- " + money);
        System.out.println("현재 잔액은 " + total + "원 입니다.");
    }
    void output(int money){
        if(total - money < 0){
            System.out.println("금액이 부족합니다.");
            System.out.println("현재 잔액은 " + total + "원 입니다.");
        } else if (total - money >= 0) {
            total -= money;
            System.out.println("출금 --- " + money);
            System.out.println("현재 잔액은 " + total + "원 입니다.");
        }
    }
}