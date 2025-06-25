package One;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Calculate cm = new Calculate();
        Scanner scanner = new Scanner(System.in);

        for (; ; ) {
            System.out.println("첫 번째 값을 넣어주세요.");
            cm.firstNumber = scanner.nextInt();
            scanner.nextLine();
            cm.More();

            for (; ; ) {
                System.out.println("추가, 리셋, 종료");
                String dd = scanner.nextLine();
                switch (dd) {
                    case "추가":
                        cm.More();
                        break;
                    case "리셋":
                        cm.reset = true;
                        break;
                    case "종료":
                        cm.turnOff = true;
                        break;
                    default:
                        break;
                }

                if (cm.turnOff) {
                    break;
                }

                if (cm.reset){
                    cm.reset = false;
                    break;
                }
            }

            if (cm.turnOff) {
                System.out.println("종료되었습니다.");
                break;
            }
        }
    }
}