package StartJava.Hw4;


import java.util.LinkedList;

//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
public class Tsk1 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList.add(i);
        }

        System.out.println(linkedList);
        revList(linkedList); //1
        revListSwap(linkedList); //2
        //Collections.reverse(linkedList); //3

    }

    //обратный проход и добавление в новый list
    public static void revList(LinkedList<Integer> list) {
        LinkedList<Integer> rList = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            rList.add(list.get(i));
        }
        System.out.println(rList + " - 1-Method");
    }

    //проход в половину(n\2) n - длинна изначального листа, и свап
    //крайних элементов
    public static void revListSwap(LinkedList<Integer> list) {
        for (int i = 0; i < list.size() / 2; i++) {
            Integer tmp = list.get(i);
            list.set(i, list.get(list.size() - i - 1));
            list.set(list.size() - i - 1, tmp);
        }
        System.out.println(list + " - 2-Method");
    }

}
