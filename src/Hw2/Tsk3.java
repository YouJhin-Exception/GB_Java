package Hw2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
(НЕОБЯЗАТЕЛЬНО) Дана json строка (можно сохранить в файл и читать из файла)
[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида:
Студент [фамилия] получил [оценка] по предмету [предмет].
 */
public class Tsk3 {


    public static void main(String[] args) {

        try (BufferedReader bfr = new BufferedReader(new FileReader("C:/Users/Len/Desktop/GB_Java/src/Hw2/in.json"))) {
            StringBuilder stringBuilder = new StringBuilder();
            String strIn;

            while ((strIn = bfr.readLine()) != null) {
                stringBuilder.append(strIn);
            }
            stringBuilder.deleteCharAt(stringBuilder.length() - 1).
                    deleteCharAt(stringBuilder.length() - 1).
                    replace(0, 1, " ");

            String newText = stringBuilder.toString();

            newText = newText.replace("}","\n").replace("{","")
                            .replace("фамилия","Студент")
                            .replace("оценка","получил")
                            .replace("предмет","по предмету")
                            .replace(":"," ")
                            .replace(","," ")
                            .replace("\"",""); // эта меняет "

            System.out.println(newText);
            try(FileWriter fr = new FileWriter("src/Hw2/out.txt",false)){
                fr.write(newText);

            }


        } catch (IOException ex) {
            System.out.println("err");
        }

    }
}
