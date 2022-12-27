package OOP.HW1;

public class Drink extends Product{

    private double volume;

    public Drink(String name, Double price, double volume) {
        super(name, price);
        this.volume = volume;
    }

    public Drink(String name, double volume) {
        super(name);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString()+" volume=" + volume+",";
    }
}
