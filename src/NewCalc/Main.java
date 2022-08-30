package NewCalc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double x=0;
        try {
            x = in.nextDouble();
        } catch (InputMismatchException e) {
            System.err.println("Ошибка: введено не число!");
            System.exit(0);
        }
        System.out.println("Введите второе число: ");
        double y = 0;
                try{
                    y = in.nextDouble();
                } catch (InputMismatchException e){
                    System.err.println("Ошибка: введено не число!");
                System.exit(0);}

        System.out.println("Введите оператор: +, -, *, / :" );
        String o = in.next();

        Calc calc = new Calc(x, y, o);
        calc.Calculator();
        in.close();

        double answer = Calc.answer;
        System.out.println("Результат:" + answer);

    }



}


