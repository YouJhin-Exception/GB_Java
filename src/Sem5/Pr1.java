package Sem5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

// Создать структуру для хранения Номеров паспартов и Фамилий сотрудников организации
// вывести данные сотрудников с фамилией Иванов
public class Pr1 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.print(" Введите номер паспорта и фамилию -> ");
            String[] line = scan.nextLine().split(" ");
            map.put(Integer.parseInt(line[0]), line[1]);
        }
        for (var s1 : map.entrySet()) {
            System.out.println(s1.getKey() + " " + s1.getValue());
        }
        System.out.println();
        int count = 0;
        for (var s2 : map.entrySet()) {
            if (s2.getValue().equals("Иванов")) {
                count++;
                System.out.println("По данному запросу найденно " + count + " совпадений:");
                System.out.println(s2.getKey() + " " + s2.getValue());
            }
        }

    }

}
