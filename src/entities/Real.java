package entities;

import java.util.Objects;

public class Real extends Product {

    private double size;
    private int weight;

    public Real(String name, double price, double size, int weight) {
        super(name, price);
        this.size = size;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Real real = (Real) o;
        return Double.compare(real.size, size) == 0 && Double.compare(real.weight, weight) == 0
                && Double.compare(real.getPrice(), getPrice()) == 0 && Objects.equals(real.getName(), getName());
    }

    public double getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, weight);
    }

    @Override
    public String toString() {
        return "Real{" +
                "name=" + getName() +
                ", price=" + getPrice() +
                ", size=" + size +
                ", weight=" + weight +
                '}';
    }
}
