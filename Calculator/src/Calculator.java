import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("1 число ");
            double num1 = scanner.nextDouble();

            System.out.print("+, -, *, / : ");
            String op = scanner.next();

            System.out.print("2 число ");
            double num2 = scanner.nextDouble();

            double result = 0;
            if (op.equals("+")) {
                result = num1 + num2;
            } else if (op.equals("-")) {
                result = num1 - num2;
            } else if (op.equals("*")) {
                result = num1 * num2;
            } else if (op.equals("/") && num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Ошибка!");
                continue;
            }

            System.out.println("Ответ: " + result);

            System.out.print("Еще раз?");
            String answer = scanner.next();
            if (!answer.equalsIgnoreCase("да")) {
                break;
            }
        }

        scanner.close();
        System.out.println("Все!");
    }
}