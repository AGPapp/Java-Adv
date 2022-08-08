import java.util.Scanner;

/**
 * Created by Java
 * @author Andrey
 */
public class Zadanie1 {public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    // Просим первое число
    System.out.println("Введите число 1: ");
    //Сохраняем в переменную Х
    double x = in.nextDouble();
    // Просим второе число
    System.out.println("Введите число 2: ");
    //Сохраняем в переменную У
    double y = in.nextDouble();
    //Узнаем требуемое действие
    System.out.println("Введите оператор: ");
    // Сохраняем знак в текстовую переменную О
    String o = in.next();
    // Проверяем введенный знак, и в соответствии с ним, выводим результат
    switch (o) {
        case "+":
            System.out.printf("%.4f", x+y);
            break;
        case "-":
            System.out.printf("%.4f",x - y);
            break;
        case "*":
            System.out.printf("%.4f",x * y);
            break;
        case "/":
            System.out.printf("%.4f",x / y);
            break;
            //Если ни один из накомых вариантов не подошел
        default:
            System.out.println("Мне не сосчитать");
    }

}
}
