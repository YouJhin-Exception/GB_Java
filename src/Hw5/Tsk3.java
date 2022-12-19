package Hw5;

import java.util.Scanner;

//Реализовать алгоритм пирамидальной сортировки (HeapSort) "куча"
// https://youtu.be/MtQL_ll5KhQ
// https://www.youtube.com/watch?v=DU1uG5310x0
// https://www.youtube.com/watch?v=z7Wkp0-U8kM
// https://www.youtube.com/watch?v=92yCSMwsz88
public class Tsk3 {
    public static void main(String[] args) {
        System.out.print("Введите динну массива -> ");
        Scanner scanner = new Scanner(System.in);
        int arrSize = scanner.nextInt();
        int[] arr = new int[arrSize];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
        heapMaxSort(arr);
        System.out.println();
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }

    private static void heapMaxSort(int[] arr) {
        int size = arr.length;
        for (int i = size / 2 - 1; i >= 0; i--) {
            heapify(arr, i, size);
        }
        for (int i = size - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            heapify(arr, 0, i);
        }
    }

    private static void heapify(int[] arr, int i, int heapSize) {

        int l = i * 2 + 1;
        int r = i * 2 + 2;

        int largest = i;

        if (l < heapSize && arr[l] > arr[largest]) largest = l;
        if (r < heapSize && arr[r] > arr[largest]) largest = r;

        if (i != largest) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, largest, heapSize);
        }
    }


}
