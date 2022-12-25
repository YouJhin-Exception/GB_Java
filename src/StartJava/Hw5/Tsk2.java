package StartJava.Hw5;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;


// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности
public class Tsk2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/Hw5/workers.txt"));
        List<String> listWork = new ArrayList<>();
        List<String> names = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            listWork.add(line);
        }
        for (String s : listWork) {
            names.add(s.trim().split(" ")[0]);
        }

        Map<String, Integer> nameMap = new TreeMap<>();
        for (String name : names) {
            if (nameMap.containsKey(name)) {     // 2- если встречается такое-же имя
                int count = nameMap.get(name);  // 3- берем 1(или сколько раз встречется имя)
                nameMap.put(name, ++count);  // 4 - кладем в мапу с увеличенным значением на ++
            } else {
                nameMap.put(name, 1);   // 1- кладем все имена со значением 1
            }

        }

        List<Map.Entry<String, Integer>> listOrder = nameMap.entrySet().stream().sorted((e1,e2)-> -e1.getValue().compareTo(e2.getValue())).collect(Collectors.toList());
//        for (var n: listOrder) {
//            System.out.println(n.getKey()+" "+n.getValue());
//        }


//        System.out.println(listWork);
//        System.out.println(names);
//        System.out.println(nameMap);
        System.out.println(listOrder);

    }
}
