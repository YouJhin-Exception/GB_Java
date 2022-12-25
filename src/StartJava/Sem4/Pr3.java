package StartJava.Sem4;
//Принимает от пользователя строку и запоминает ее
//Если введено print, выводит строки так, чтобы последняяя введенная строка была первой, а первая последней
//Если введено revert удаляет предыдущую введеную строку из памяти

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Pr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<String> dq = new ArrayDeque<>();

        while (true){
            System.out.print("Input some - >");
            String line = sc.nextLine();
            if (line.equals("")){
                break;
            } else if (line.equals("print")) {
                while (!dq.isEmpty()){
                    System.out.print(dq.removeLast()+" ");
                }
                System.out.println();
            } else if (line.equals("revert")) {
                dq.removeLast();
            } else {
                dq.add(line);
            }

        }
        System.out.println(dq);
    }
}
