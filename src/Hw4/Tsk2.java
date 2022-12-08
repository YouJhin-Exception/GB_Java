package Hw4;

import java.util.LinkedList;

//Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди,
//dequeue() - возвращает первый элемент из очереди и удаляет его,
//first() - возвращает первый элемент из очереди, не удаляя.
public class Tsk2 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Orange");
        linkedList.add("Banana");
        linkedList.add("Kiwi");
        System.out.println(linkedList);

        enqueue(linkedList, "Orange");
        System.out.println(linkedList);

        String s = dequeue(linkedList);
        System.out.println(s);
        System.out.println(linkedList);

        System.out.println(first(linkedList));
    }

    public static void enqueue(LinkedList<String> list, String s) {
        list.addLast(s);
    }

    public static String dequeue(LinkedList<String> list) {
        String s1e = list.getFirst();
        list.removeFirst();
        return s1e;
    }

    public static String first(LinkedList<String> list) {
        return list.getFirst();
    }

}
