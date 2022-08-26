package Zadanie3sweets;

public class Chocolate extends Sweets {

    private String flavor;

    public Chocolate(String name, double weight, double price, String flavor) {
        super(name, weight, price);
        this.flavor = flavor;
    }
    public String toString() {
        return "Шоколад: [" + super.toString() + ", Вкус: " + flavor + "]";
    }}