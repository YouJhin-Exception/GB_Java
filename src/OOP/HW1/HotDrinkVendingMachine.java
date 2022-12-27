package OOP.HW1;

public class HotDrinkVendingMachine implements VendingMachine {

//    private List<Product> productList;
//
//    public HotDrinkVendingMachine(List<OOP.HW1.Product> product) {
//        this.productList = product;
//    }


    @Override
    public void getProduct(String name, double volume, int temperature) {
        new HotDrink(name, volume, temperature);
    }

    @Override
    public void getProduct(String name, double volume) {
        new Drink(name, volume);
    }

    @Override
    public void getProduct(String name, Double price, double volume, int temperature) {
        new HotDrink(name, price, volume, temperature);
    }



//    @Override
//    public String toString() {
//        return "HotDrinkVendingMachine{" +
//                "productList=" + this.productList +
//                '}';
//    }
}
