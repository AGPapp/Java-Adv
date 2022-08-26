import java.util.Scanner;

public class Zadanie2 { public Zadanie2() {
}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите действие: 1 - Калькулятор, 2 - Поиск максимально длинного слова");
        int vel = in.nextInt();
        if (vel == 1) {
            System.out.println("Введите число 1: ");
            double x = in.nextDouble();
            System.out.println("Введите число 2: ");
            double y = in.nextDouble();
            System.out.println("Введите оператор: ");
            String o = in.next();
            in.close();

            switch (o) {
                case "+":
                    System.out.println(x + y);
                    break;
                case "-":
                    System.out.println(x - y);
                    break;
                case "*":
                    System.out.println(x * y);
                    break;
                case "/":
                    System.out.println(x / y);
                    break;
                default:
                    System.out.println("Мне не сосчитать");
            }
        } else if (vel == 2) {
            System.out.println("Введите количество слов: ");
            int x = in.nextInt();
            String[] myArr = new String[x];

            for(int max = 0; max < myArr.length; ++max) {
                System.out.print("Введите слово " + (max + 1) + ":");
                myArr[max] = in.next();
            }

            in.close();
            String len = myArr[0];

            for(int i = 0; i < myArr.length; ++i) {
                if (len.length() < myArr[i].length()) {
                    len = myArr[i];
                }
            }

            System.out.println("Самое длинное слово: " + len);
        }
        else {
            System.out.println("Не знаю команды");
        }

    }
}
