package Zadanie3sweets;

public class main { public static void main(String[] args) {
    Candy candy = new Candy("Петушок", 20, 2.5,"Леденец");
    Chocolate choc1 = new Chocolate("Аленка", 150, 10,"С карамелью");
    Chocolate choc2 = new Chocolate("Сникерс", 100.1, 15.6,"Лесной орех");
    Jellybean jelly = new Jellybean("Skittles", 50.5, 40, true);

    Sweets[] gift = {candy, choc1, choc2, jelly};
    calculate(gift);

}

    static void calculate(Sweets[] sweets){
        double sumPrice = 0;
        double sumWeight = 0;
        System.out.println("Содержимое подарка:");
        for (Sweets s: sweets) {
            sumPrice+=s.getPrice();
            sumWeight+=s.getWeight();
            System.out.println(s.toString());
        }
        System.out.println("Общая стоимость подарка = " + sumPrice);
        System.out.println("Общий вес подарка = " + sumWeight);
    }
}
