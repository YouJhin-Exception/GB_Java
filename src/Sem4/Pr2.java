package Sem4;

import java.util.LinkedList;
import java.util.Scanner;

// принимает от полозователя строку вида text~num
// 1. Распилить строку по ~ сохранить техт на позицию num
// 2. Если введено print~num выводит строку из позиции num в связном списке
// и удаляет ее из списка
public class Pr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input string -> ");
        String str = sc.nextLine();
        LinkedList<String> lkls = new LinkedList<>();

        String[] arrS = str.split("~");

        int ind = Integer.parseInt(arrS[1]);
        for (int i = 0; i < ind + 2; i++) {
            lkls.add("String " + i);
        }
        if (arrS[0].equals("print")) {
            System.out.println(lkls.remove(ind));
        } else {
            lkls.add(ind, arrS[0]);
        }
        System.out.println(lkls);


    }
}
