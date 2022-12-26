package OOP.Sem1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<VendingMachine> vendingMachineList = new ArrayList<>();
        vendingMachineList.add(new VendingMachine());
        vendingMachineList.add(new VendingCofeMachine());
        for (VendingMachine vm: vendingMachineList) {
            vm.restore();

        }

        System.out.println();

        Product product = new Product("Lm",3.4);
        product.consume();
        Product prodCola = new ProductCola("Cola",5.5,0.5);
        prodCola.consume();

    }
}
