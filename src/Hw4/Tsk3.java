package Hw4;

//Написать программу, определяющую правильность расстановки скобок в выражении.
//
//        a+(d*3) - истина
//        [a+(1*3) - ложь
//        [6+(3*3)] - истина
//        {a}\[+\]{(d*3)} - истина
//        <{a}+{(d*3)}> - истина
//        {a+]}{(d*3)} - ложь

import java.util.*;

public class Tsk3 {
    public static void main(String[] args) {
        String s1 = "a+(d*3)";  // - истина
        String s2 = "[a+(1*3)";  //- ложь
        String s3 = "[6+(3*3)]"; //- истина
        String s4 = "{a}\\[+\\]{(d*3)}";  //- истина
        String s5 = "{a+]}{(d*3)}";  //- ложь

        if (checkerRow(s4)) System.out.println("Правильная последовательность");
        else System.out.println("НЕ правильная последовательность");
    }

    public static boolean checkerRow(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if (x == '(' || x == '[' || x == '{') {
                deque.push(x);
                continue;
            }
            char ch;
            switch (x) {
                case ')' -> {
                    ch = deque.pop();
                    if (ch == '[' || ch == '{')
                        return false;
                }
                case '}' -> {
                    ch = deque.pop();
                    if (ch == '[' || ch == '(')
                        return false;
                }
                case ']' -> {
                    ch = deque.pop();
                    if (ch == '(' || ch == '{')
                        return false;
                }
            }

        }
        return (deque.isEmpty());
    }
}
// по хорошему нужна еще проверка на "дурака" с закрывающими скобками в начале строки....