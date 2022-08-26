package Zadanie3sweets;

public class Candy extends Sweets{private String sort;

    public Candy(String name, double weight, double price, String sort) {
        super(name, weight, price);
        this.sort = sort;
    }
      public String toString() {
        return "Конфеты: [" + super.toString() + ", Вид: " + sort + "]";
    }
}
