package Sem5;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/*взять набор строк, например Мороз и солнце день чудесный Еще ты дремлешь друг любезный Пора красавица проснись
отсортировать с помощью treemap. Сроки с одинаковой длинной не должны потеряться.*/
public class Pr3 {
    public static void main(String[] args) {

    sortTree();

    }
    public static void sortTree(){
        String s = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись";
        Map<String, Integer> treeMap = new TreeMap();
        String[] st = s.split(" ");
        for (int i = 0; i < st.length ; i++) {
            treeMap.put(st[i], st[i].length());
        }
        List<Map.Entry<String,Integer>> list = treeMap.entrySet().stream().sorted((e1,e2) ->
                e1.getValue().compareTo(e2.getValue())).collect(Collectors.toList()); // разбиваем на поток и сравниваем
                                                                                      // 2 елемента пузырьком и потом опбратно запихиваем в list
        System.out.println();                                                         // -e1.getValue() в обратном порядке

        for (var s1 : list) {
            System.out.println(s1.getKey() + " " + s1.getValue());
        }
//        for (var s1 : treeMap.entrySet()) {
//            System.out.println(s1.getKey() + " " + s1.getValue());
//        }

    }
}
