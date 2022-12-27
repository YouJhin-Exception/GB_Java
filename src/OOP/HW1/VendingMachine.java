package OOP.HW1;

interface VendingMachine {


    abstract void getProduct(String name, double volume, int temperature);
    abstract void getProduct (String name, double volume);
    abstract void getProduct(String name, Double price, double volume, int temperature);

}

