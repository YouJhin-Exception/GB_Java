package StartJava.Hw5;

//1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;


public class Tsk1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> fb = new HashMap<>();

        System.out.print("Введите Фамилию И.О. - и номер телефона -> ");
        Scanner scanner = new Scanner(System.in);
        //var 1
//        String line = scanner.nextLine();
//        String[] spt = line.split(",");
//
//        for (String part : spt) {
//            String[] only = part.split("-");
//            String name = only[0].trim();
//            String num = only[1].trim();
//            fb.put(name, num);
//
//        }
        // var 2

        String line;
        while (!Objects.equals(line = scanner.nextLine(), "q")) {
            System.out.print("Введите Фамилию И.О. - и номер телефона -> ");
            String name = line.trim().split("-")[0];
            String num = line.trim().split("-")[1];
            fb.put(name, num);
        }


        //var 3
//        while (true){
//            String name = reader.readLine();
//            if (name.equals("")) break;
//            String number = reader.readLine();
//            if (number.equals("")) break;
//            fb.put(name,number); // можно парсануть к инту
//        }

        System.out.println(fb);

    }
}