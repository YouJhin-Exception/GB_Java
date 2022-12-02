package Hw1;

import java.util.Scanner;

public class Tsk3 {
    public static void main(String[] args) {
        double num1;
        double num2;
        double res;
        char op;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите 2 числа -> ");
        num1 = in.nextDouble();
        num2 = in.nextDouble();
        System.out.print("Введите действие (+,-, *, /,) -> ");
        op = in.next().charAt(0);

        if (op == '/' && num2 == 0) System.out.println("Нельзя делить на ноль");

        switch (op) {
            case '+' -> res = num1 + num2;
            case '-' -> res = num1 - num2;
            case '*' -> res = num1 * num2;
            case '/' -> res = num1 / num2;
            default -> {
                System.out.println("Веедите верный оператор");
                return;
            }
        }
        System.out.print("\nРезудьтат операции -> ");
        System.out.printf(num1 + " " + op + " " + num2 + " = " + res);

    }
}
