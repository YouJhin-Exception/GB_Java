package OOP.Sem1;

public class ProductCola extends Product{

    private double obem;

    public ProductCola(String name, Double price, double obem) {
        super(name, price);
        this.obem = obem;
    }

    public double getObem() {
        return obem;
    }

    public void setObem(double obem) {
        this.obem = obem;
    }

    @Override
    public void consume() {
        System.out.println("Cola was consumed");
    }
}
