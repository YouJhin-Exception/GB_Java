package OOP.P1.HW1;
/*
Создать наследника реализованного класса HotDrink с дополнительным полем int температура.
Создать класс HotDrinkVendingMachine, реализующий интерфейс VendingMachine
и реализовать перегруженный метод getProduct(String name, double volume, double temperature), выдающий продукт соответствующего имени, объема и температуры.
В main проинициализировать несколько экземпляров HotDrink и HotDrinkVendingMachine и воспроизвести логику заложенную в программе
Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> drinks = new ArrayList<>(Arrays.asList(
                new HotDrink("Coffee",5.5,0.5,90),
                new HotDrink("Tea",3.0,0.4,90),
                new HotDrink("Latte",6.0,0.5,90),
                new Drink("Apple juice",3.5,0.5),
                new Drink("Orange juice",3.5,0.5),
                new Drink("Cold Watter",0.5)));


        HotDrinkVendingMachine vm1 = new HotDrinkVendingMachine();
        HotDrinkVendingMachine vm2 = new HotDrinkVendingMachine();


        vm1.getProduct("Green Tea",3.5,0.3,95);
        vm1.getProduct("water",0.5);

        vm2.getProduct("Espresso",5.0,0.3,85);
        vm2.getProduct("Hat Watter",0.3,90);




    }
}
