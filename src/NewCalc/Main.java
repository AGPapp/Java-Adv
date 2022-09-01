package NewCalc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double x = 0;
        double y = 0;
        try {
            x = in.nextDouble();

        System.out.println("Введите второе число: ");


        y = in.nextDouble();
                } catch (InputMismatchException e){
                    System.err.println("Ошибка: введено не число!");
                System.exit(2);}

        System.out.println("Введите оператор: +, -, *, / :" );
        String o = in.next();
        in.close();
        try {
            Calc calc = new Calc(x, y, o);
            calc.Calculator();
        } catch(ArithmeticException p){
            System.err.println("Произошло деление на 0, но так как числа не целые, процесс не останавливаем");
          // System.exit(1);
        }
        catch (InputMismatchException l){
            System.err.println("Неизвестный оператор");
            System.exit(1);
        }

        double answer = Calc.answer;
        System.out.println("Результат:" + answer);

    }

}


