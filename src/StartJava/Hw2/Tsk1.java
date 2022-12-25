package StartJava.Hw2;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Tsk1 {
    public static void main(String[] args){

        int[] arr1 = new int[]{10, 5, 3, 7, 9, 1, 4};
        System.out.println("До сортировки -> " + Arrays.toString(arr1));
        bblSort(arr1);
        System.out.println("После сортировки -> " + Arrays.toString(arr1));

    }
    public static void bblSort(int[] arr){
        try (FileWriter fr = new FileWriter("bblLog1.txt", true)) {
            boolean sorted = false;
            int chg;
            while (!sorted) {
                sorted = true;
                for (int i = 0; i < arr.length - 1; i++) {
                    if (arr[i] > arr[i + 1]) {
                        sorted = false;
                        chg = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = chg;
                    }
                }
                fr.write(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"))+" Измененый массив -> "+Arrays.toString(arr) + "\n");
                //fr.flush();
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
