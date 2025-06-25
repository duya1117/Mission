package One;

import java.util.Scanner;

class Calculate {
    double firstNumber;
    String operator;
    double secondNumber;
    double result;
    boolean turnOff= false;
    boolean reset = false;

    public void More(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("연산 할 연산자를 넣어주세요. (+, -, *, /)");
        operator = scanner.nextLine();
        System.out.println("두 번째 값을 넣어주세요.");
        secondNumber = scanner.nextInt();
        Operator();
        firstNumber = result;
    }

    public void printResult() {
        if (result == (int) result) {
            System.out.println("결과 값 : " + (int) result);
        } else {
            System.out.printf("결과 값 : %.4f\n",result);
        }
    }

    public void Operator() {
        switch (operator) {
            case "+":
                result = firstNumber + secondNumber;
                printResult();
                break;
            case "-":
                result = firstNumber - secondNumber;
                printResult();
                break;
            case "*":
                result = firstNumber * secondNumber;
                printResult();
                break;
            case "/":
                if (secondNumber == 0) {
                    System.out.println("0으로 나눌수 없습니다.");
                    printResult();
                } else {
                    result = firstNumber / secondNumber;
                    printResult();
                }
                break;
            default:
                System.out.println("잘못된 값을 입력하셨습니다.");
                printResult();
        }
    }
}