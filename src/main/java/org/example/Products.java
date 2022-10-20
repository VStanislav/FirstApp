package org.example;

public class Products {
    private int id;
    private String name;
    private double cost;

    public Products() {
        this.id ++;
    }

    public Products(int id, String name, double cost) {
        this.name = name;
        this.cost = cost;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cost=" + cost + " $" +
                '}';
    }
}
