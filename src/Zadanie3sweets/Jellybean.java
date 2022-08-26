package Zadanie3sweets;

public class Jellybean extends Sweets {
    private boolean sour;

    public Jellybean(String name, double weight, double price, boolean sour) {
        super(name, weight, price);
        this.sour = sour;
    }

    public String toString() {
        return "Жевательные конфеты: [" + super.toString() + ", Кислый: " + sour + "]";
    }
}
