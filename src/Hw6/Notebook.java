package Hw6;

import java.util.Objects;

public class Notebook {
    String brand;
    String name;
    String color;
    Integer ram;
    Integer hdCapacity;
    String chip;
    String gpu;

    public Notebook(String brand, String name, String color, Integer ram, Integer hdCapacity, String chip, String gpu) {
        this.brand = brand;
        this.name = name;
        this.color = color;
        this.ram = ram;
        this.hdCapacity = hdCapacity;
        this.chip = chip;
        this.gpu = gpu;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getHdCapacity() {
        return hdCapacity;
    }

    public void setHdCapacity(Integer hdCapacity) {
        this.hdCapacity = hdCapacity;
    }

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Notebook notebook)) return false;
        return Objects.equals(getBrand(), notebook.getBrand()) && Objects.equals(getName(), notebook.getName()) && Objects.equals(getColor(), notebook.getColor()) && Objects.equals(getRam(), notebook.getRam()) && Objects.equals(getHdCapacity(), notebook.getHdCapacity()) && Objects.equals(getChip(), notebook.getChip()) && Objects.equals(getGpu(), notebook.getGpu());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getName(), getColor(), getRam(), getHdCapacity(), getChip(), getGpu());
    }

    @Override
    public String toString() {
        return "\nНоутбук - фирмы " + brand + " название " + name + " c " + ram + " гб памяти, на процессоре " + chip + ", c жеским диском на " + hdCapacity + " гигов, с видеокартой " + gpu + " и " + color + " цветом\n";

    }


}
