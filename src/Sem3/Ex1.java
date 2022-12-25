package Sem3;

import java.util.*;

// задачка 1. задать список заполненный случ числами м отсортировать
public class Ex1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> arlist = new ArrayList<>();
        for (int i = 0; i < 10 ; i++) {
            arlist.add(rnd.nextInt(100));

        }
        System.out.println(arlist);
        Collections.sort(arlist);
        System.out.println(arlist);

    }

//    public static void printArr(ArrayList<Integer> arrayList) {
//        StringBuilder str = new StringBuilder();
//        for (Integer num:arrayList) {
//            str.append(num+", ");
//        }
//        String outT = str.substring(0,str.length()-2);
//        System.out.println(outT);
//
//    }


}
