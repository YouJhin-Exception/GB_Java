package Hw3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
public class Tsk3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> someList = new ArrayList<>();
        for (int i = 0; i < 20 ; i++) {
            someList.add(rnd.nextInt(1,777));
        }
        System.out.println(someList);
        someList.sort(Comparator.naturalOrder());
        System.out.println(someList);
        int min = someList.get(0);
        int max = someList.get(someList.size()-1);
        System.out.println("Минимальный элемент -> "+min);
        System.out.println("Максимальный элемент -> "+max);
        System.out.println("Среднее арифметическое -> "+calcAve(someList));
    }

    public static double calcAve(List<Integer> arr) {
        return arr.stream().mapToDouble(av->av).average().orElse(0);
    }
}
