package Hw2;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Tsk2 {
    public static void main(String[] args) throws IOException {

        double num1;
        double num2;
        double res;
        char op;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите 2 числа -> ");
        num1 = in.nextDouble();
        num2 = in.nextDouble();
        System.out.print("Введите действие (+, -, *, /,) -> ");
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
//        System.out.printf(num1 + " " + op + " " + num2 + " = " + res);
        String res2 = num1 + " " + op + " " + num2 + " = " + res;
        System.out.println(res2);
        log(res2);
    }
    public static void log(String str) throws IOException {
        Logger LOGER = Logger.getLogger(Tsk2.class.getName());
        LOGER.setLevel(Level.INFO);
        FileHandler fh = new FileHandler("calcLog1.txt", true);
        LOGER.addHandler(fh);
        SimpleFormatter sf = new SimpleFormatter();
        fh.setFormatter(sf);
        //LOGER.log(Level.WARNING,"Calc Warning");
        LOGER.info(str);

    }

}
