package StartJava.Hw3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

// Пусть дан произвольный список целых чисел, удалить из него четные числа
public class Tsk2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> someList = new ArrayList<>();
        for (int i = 0; i < 20 ; i++) {
            someList.add(rnd.nextInt(20));
        }
        System.out.println(someList);
        for (Iterator<Integer> iterator = someList.iterator(); iterator.hasNext();){
            Integer num = iterator.next();
            if(num % 2 == 0){
                System.out.println("Удаляю четное-> "+num);
                iterator.remove();
            }
        }
        System.out.println(someList);
    }
}
