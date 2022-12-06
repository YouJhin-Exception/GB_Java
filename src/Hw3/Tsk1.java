package Hw3;
// Реализовать алгоритм сортировки слиянием

//Данный алгоритм разбивает список на две части, каждую из них он разбивает ещё на две и так далее, пока не останутся единичные элементы.
// Массив из одного элемента считается упорядоченным.
// Соседние элементы сравниваются и соединяются вместе.
// Так происходит до тех пор, пока все элементы не будут отсортированы.
// https://habr.com/ru/post/281675/ - хорошее объяснение + https://ru.wikipedia.org/wiki/Сортировка_слиянием - gjf

import java.util.Arrays;
public class Tsk1 {
    public static void mergeSort(int[] sortArr, int st, int end) {
        if (end <= st)
            return;
        int mid = st + (end - st) / 2;
        mergeSort(sortArr, st, mid);
        mergeSort(sortArr, mid + 1, end);

        int[] buf = Arrays.copyOf(sortArr, sortArr.length);

        for (int k = st; k <= end; k++) {
            buf[k] = sortArr[k];
        }

        int i = st, j = mid + 1;
        for (int k = st; k <= end; k++) {

            if (i > mid) {
                sortArr[k] = buf[j];
                j++;
            } else if (j > end) {
                sortArr[k] = buf[i];
                i++;

            } else if (buf[j] < buf[i]) {
                sortArr[k] = buf[j];
                j++;

            } else {
                sortArr[k] = buf[i];
                i++;
            }

        }

    }

//    public static void someMore(int[] a1, int[] a2, int[] a3){                 // менее затратное слияние 2 отсортированных массивов
//        int i=0, j=0, k=0;
//        while(i < a1.length && j < a2.length) {
//            a3[k++] = a1[i] < a2[j] ? a1[i++] : a2[j++];
//        }
//        if(i< a1.length) {
//            arraycopy(a1, i, a3, k, a1.length - i);
//        } else if(j< a2.length) {
//            arraycopy(a2, j, a3, k, a2.length - j);
//        }
//    }

    public static void main(String[] args) {
        int[] t1 = new int[]{66, 54, 34, 89, 1, 41, 9, 2, 7, 88, 90, 27, 99};
        mergeSort(t1, 0, t1.length - 1);
        for (Integer z : t1) {
            System.out.print(z + " ");
        }
//        int[] t2 = new int[]{45,22,58,90,1,2,6,0};
//        int[] t3 = new int[t1.length+t2.length];
//        someMore(t1,t2,t3);
//        for (Integer z : t3) {
//           System.out.print(z + " ");
//        }

    }
}
