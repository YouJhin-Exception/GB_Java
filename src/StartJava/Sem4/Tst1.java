package StartJava.Sem4;
// LinkedList - двухсвязный список, выгоден для добавления\удаления, для считования выгоднее исп массив.
// LL - нужен для небольшого количесива эллементов, в которых операции добавления\удаления встречаются чаще
// чем операции чтения
// Queue - FIFO - первый пришел первый обработан
// PriorityQueue - Наивысший приоритет имеет наименьший элемент
// Deque - поддерживает вставку и удаление на обоих концах
// Stack - FILO устаревшая исп Deque

import java.util.*;
public class Tst1 {
    private static boolean isDigit (String s) throws NumberFormatException{
        try{
            Integer.parseInt(s);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(123);
        priorityQueue.add(4);
        priorityQueue.add(56); // ломается очередь
        priorityQueue.add(12);
        priorityQueue.add(1);
        priorityQueue.add(233);
        System.out.println(priorityQueue);

        //var exp = "1 2 3 * +".split(" "); // 1+2*3 решение в постфиксной форме
        var exp = "20 30 - 10 *".split(" ");
        int res = 0;
        System.out.println(Arrays.toString(exp));
        Stack<Integer> st = new Stack<>();
        for (String s : exp) {

            if (isDigit(s)) {
                st.push(Integer.parseInt(s));

            } else {
                switch (s) {
                    case "+" -> {
                        res = st.pop() + st.pop();
                        st.push(res);
                    }
                    case "-" -> {
                        res = -st.pop() + st.pop();
                        st.push(res);
                    }
                    case "*" -> {
                        res = st.pop() * st.pop();
                        st.push(res);
                    }
                    case "/" -> {
                        res = st.pop() / st.pop();
                        st.push(res);
                    }
                    default -> {
                    }
                }
            }

        }
        System.out.printf("%d\n",st.pop());


    }
}
