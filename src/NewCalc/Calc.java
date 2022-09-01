package NewCalc;

import java.util.InputMismatchException;

public class Calc {
    public static double answer;
    private double x;
    private double y;
    private String o;
    public Calc(double x, double y, String o) {
        this.x = x;
        this.y = y;
        this.o = o;
    }

    public double Calculator() {

        switch (o) {
            case "+" -> answer = x + y;
            case "-" -> answer = x - y;
            case "*" -> answer = x * y;
            case "/" -> {
                if (y == 0) {
                    throw new ArithmeticException();
                }
                answer = x / y;
            }
            default -> throw new InputMismatchException();
        }
        return answer;
    }

    }

