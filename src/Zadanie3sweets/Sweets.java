package Zadanie3sweets;

public abstract class Sweets {
    private  String name;
    private  double weight;
    private  double price;

    public Sweets(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return "Название: " + name + ", Цена: " + price + ", Вес: " + weight;
    }
}