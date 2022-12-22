package Hw6;
import java.util.*;

/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
 */
public class Tsk1 {
    public static void main(String[] args) {
        List<Notebook> notebooks = Arrays.asList(
                new Notebook("Samsung", "a52", "black", 8, 500, "intel i3", "intel 750"),
                new Notebook("Samsung", "a65", "blue", 16, 1000, "intel i5", "gtx 1050"),
                new Notebook("HP", "pavilion_g8", "black", 16, 256, "intel i7", "gtx 750"),
                new Notebook("HP", "ProBook", "white", 32, 1500, "intel i7", "gtx 2080"),
                new Notebook("Acer", "Acer_a313", "black", 8, 1500, "intel i3", "intel 750"),
                new Notebook("Acer", "Acer_air", "red", 32, 1000, "intel i5", "intel 950"),
                new Notebook("Asus", "Asus_x515", "blue", 8, 256, "intel i3", "intel 750"),
                new Notebook("Asus", "Asus_x9", "red", 64, 1500, "intel i9", "gtx 3060ti"),
                new Notebook("Lenovo", "lenovo_gtx76", "black", 16, 500, "intel i3", "intel 1500"),
                new Notebook("Lenovo", "lenovo_V15_Gen2", "white", 32, 500, "intel i7", "gtx 1080"));

        GetFilter(notebooks);
    }


    public static void GetFilter(List<Notebook> notebookList) {   // можно поиграть с рекурсией для фильтра в фильтре (как-нибудь)
        System.out.print("Добрый день!\nЯ помогу Вам с выбором ноутбука.\nПокаким критериям будем фильтровать?\n1.Количество оперативной памяти\n2.Объем жеского диска\n3.Процессор\n4.Видео карта\nВведите номер-> ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case (1) -> {
                System.out.println("По памяти можем предложить 8, 16, 32, 64 Gb соответственно ");
                System.out.print("Какие интерисуют -> ");
                int choiceRam = sc.nextInt();
                switch (choiceRam) {
                    case (8) -> {
                        System.out.println("Есть такие варианты: ");
                        List<Notebook> n8 = notebookList.stream().filter(n -> n.getRam().equals(8)).toList();
                        System.out.print(n8);
                    }
                    case (16) -> {
                        System.out.println("Есть такие варианты: ");
                        List<Notebook> n16 = notebookList.stream().filter(n -> n.getRam().equals(16)).toList();
                        System.out.print(n16);
                    }
                    case (32) -> {
                        System.out.println("Есть такие варианты: ");
                        List<Notebook> n32 = notebookList.stream().filter(n -> n.getRam().equals(32)).toList();
                        System.out.print(n32);
                    }
                    case (64) -> {
                        System.out.println("Есть такие варианты: ");
                        List<Notebook> n64 = notebookList.stream().filter(n -> n.getRam().equals(64)).toList();
                        System.out.print(n64);
                    }
                }
            }
            case (2) -> {
                System.out.println("По объему жеского диска есть такие варианты: 256, 500, 1000 и 1500 Gb соответственно ");
                System.out.print("Какие интерисуют -> ");
                int choiceHd = sc.nextInt();
                switch (choiceHd) {
                    case (256) -> {
                        System.out.println("Есть такие варианты: ");
                        List<Notebook> n256 = notebookList.stream().filter(n -> n.getHdCapacity().equals(256)).toList();
                        System.out.print(n256);
                    }
                    case (500) -> {
                        System.out.println("Есть такие варианты: ");
                        List<Notebook> n500 = notebookList.stream().filter(n -> n.getHdCapacity().equals(500)).toList();
                        System.out.print(n500);
                    }
                    case (1000) -> {
                        System.out.println("Есть такие варианты: ");
                        List<Notebook> n1000 = notebookList.stream().filter(n -> n.getHdCapacity().equals(1000)).toList();
                        System.out.print(n1000);
                    }
                    case (1500) -> {
                        System.out.println("Есть такие варианты: ");
                        List<Notebook> n1500 = notebookList.stream().filter(n -> n.getHdCapacity().equals(1500)).toList();
                        System.out.print(n1500);
                    }

                }
            }
            case (3) -> {
                System.out.println("Из процессоров линейка intel: i3, i5, i7 и i9 соответственно ");
                System.out.print("Какие интерисуют -> ");
                String choicePr = sc.next();
                switch (choicePr) {
                    case ("i3") -> {
                        System.out.println("Есть такие варианты: ");
                        List<Notebook> ni3 = notebookList.stream().filter(n -> n.getChip().split(" ")[1].equals("i3")).toList();
                        System.out.print(ni3);
                    }
                    case ("i5") -> {
                        System.out.println("Есть такие варианты: ");
                        List<Notebook> ni5 = notebookList.stream().filter(n -> n.getChip().split(" ")[1].equals("i5")).toList();
                        System.out.print(ni5);
                    }
                    case ("i7") -> {
                        System.out.println("Есть такие варианты: ");
                        List<Notebook> ni7 = notebookList.stream().filter(n -> n.getChip().split(" ")[1].equals("i7")).toList();
                        System.out.print(ni7);
                    }
                    case ("i9") -> {
                        System.out.println("Есть такие варианты: ");
                        List<Notebook> ni9 = notebookList.stream().filter(n -> n.getChip().split(" ")[1].equals("i9")).toList();
                        System.out.print(ni9);
                    }

                }
            }
            case (4) -> {
                System.out.println("Из видеокарт можно выбрать из: intel и gtx ");
                System.out.print("Какие интерисуют -> ");
                String choiceGp = sc.next();
                switch (choiceGp) {
                    case ("intel") -> {
                        System.out.println("Есть такие варианты: ");
                        List<Notebook> nIntel = notebookList.stream().filter(n -> n.getGpu().split(" ")[0].equals("intel")).toList();
                        System.out.print(nIntel);
                    }
                    case ("gtx") -> {
                        System.out.println("Есть такие варианты: ");
                        List<Notebook> nGtx = notebookList.stream().filter(n -> n.getGpu().split(" ")[0].equals("gtx")).toList();
                        System.out.print(nGtx);
                    }

                }
            }
            default -> throw new IllegalStateException("Недопустимое значение " + choice + " (-только пункты меню-): ");

        }

    }
}
