package Calc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Ввод чисел
        System.out.println("Введите первое число: ");
        double x = in.nextDouble();
        System.out.println("Введите второе число: ");
        double y = in.nextDouble();
        //оператор
        System.out.println("Укажите оператор: +, -, *, / ");
        String o = in.next();
        in.close();

        switch (o) {
            case "+":
                Sum sum = new Sum(x, y);
                break;
            case "-":
                Minus minus = new Minus(x, y);
                break;
            case "*":
                Multiplication ml = new Multiplication(x, y);
                break;
            case "/":
                Div div = new Div(x, y);
                break;
            default:
                System.out.println("Мне не сосчитать");
        }
    }
}
