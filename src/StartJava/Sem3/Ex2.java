package StartJava.Sem3;

import java.util.*;
import java.util.stream.Collectors;

// заполнить список названиями планет, в произвольном порядке, с повторениями,
// вывести название каждой планеты и количество повторений в списке

// так-же удалить дубликаты
public class Ex2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        String[] pl = {"Венера", "Меркурий", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун", "Плутон"};
        ArrayList<String> planets = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            planets.add(pl[rnd.nextInt(pl.length - 1)]);
        }
        System.out.println(planets);

        // количество воаторений n1

        HashSet<String> newPl = new HashSet<>(planets);
        for (String s: newPl) {
            System.out.println(s+" "+ Collections.frequency(planets,s));//freq - считает количество планет
        }

         //количесво повторений n2

        Map<String, Integer> nameMap = new TreeMap<>();
        for (String plane : planets) {
            if (nameMap.containsKey(plane)) {     // 2- если встречается такое-же имя
                int count = nameMap.get(plane);  // 3- берем 1(или сколько раз встречется имя)
                nameMap.put(plane, ++count);  // 4 - кладем в мапу с увеличенным значением на ++
            } else {
                nameMap.put(plane, 1);   // 1- кладем все имена со значением 1
            }

        }
        System.out.println(nameMap);

        // удалить дубли планет

        List<String> noDup = planets.stream().distinct().collect(Collectors.toList());

        System.out.println(noDup);

    }
}
