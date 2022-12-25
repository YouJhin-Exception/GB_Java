package Sem6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

// задачка на 1000 чисел (0-24) и % уникальных чисел
public class Pr1 {
    public static Integer[] fillArray(int size, int min, int max) {
        Random random = new Random();
        Integer[] array = new Integer[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(min, max + 1);
        }
        return array;
    }

    public static Double persetUnic(Integer[] array) {
        Set<Integer> set = new HashSet<>(Arrays.asList(array));
        return (set.size() * 100.0 / array.length);
    }

    public static void main(String[] args) {
        System.out.println(persetUnic(fillArray(1000, 0, 24)));
    }
}
