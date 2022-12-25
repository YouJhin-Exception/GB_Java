package StartJava.Sem4;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class Pr1 {
    public static void main(String[] args) {
        LinkedList<Integer> lt = new LinkedList<>(); //1
        Deque<Integer> dq = new ArrayDeque<>(); //2
        ArrayList<Integer> al = new ArrayList<>(); //3
        LocalTime timeStart = LocalTime.now();

        for (int i = 0; i < 1000000; i++) {
            al.add(i);

        }
        LocalTime timeEnd = LocalTime.now();
        Duration diff = Duration.between(timeStart, timeEnd);

        System.out.println("Time operation DQ -> " + diff);
    }
}
