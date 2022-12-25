package Sem4;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Pr4 {
    public static void main(String[] args) {
        String[] base = {"one", "two", "three", "four", "five"};
        Queue<String> queueArr = new LinkedList<>(Arrays.asList(base));
        Deque<String> deque = new LinkedList<>(Arrays.asList(base));
        System.out.println("Очередь: ");
        while (!queueArr.isEmpty()) {
            System.out.print(queueArr.poll()+" ");
        }
        System.out.println("\nСтек: ");
        while (!deque.isEmpty()) {
            System.out.print(deque.pollLast()+" ");
        }

    }
}
