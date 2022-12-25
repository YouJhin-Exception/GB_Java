package Sem5;

import java.util.HashMap;
import java.util.Map;

/*Написать метод который вернет тру если строки изоморфны
строки изоморфны, если одну букву в первом солове можно заменить на некоторую
букву во 2м слове, приэтом
1) повторяющиеся буквы одного слова меняются на одну и туже букву с сохранением порядка следования
        (add и egg - изоморфны)
2) буквва может не менятся, а оставаться такой-же (note - code)*/
public class Pr2 {
    public static void main(String[] args) {

        System.out.println(isMorf("paper", "timle"));
        System.out.println(isMorf("foo", "egg"));
        System.out.println(isMorf("foo", "bar"));


    }

    public static boolean isMorf(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        if (s1.equals(s2)) {
            return true;
        }
        Map<Character, Character> sub = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char a = s1.charAt(i);
            char b = s2.charAt(i);
            if (sub.containsKey(a) && b != sub.get(a)) {
                return false;
            } else
                sub.put(a, b);
        }
        return true;
    }
}
