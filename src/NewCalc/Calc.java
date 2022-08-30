package NewCalc;

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
        try {
            switch (o) {
                case "+":
                    answer = x + y;
                    break;
                case "-":
                    answer = x - y;
                    break;
                case "*":
                    answer = x * y;
                    break;
                case "/":
                    try {
                        if (y == 0) {
                            throw new ArithmeticException();
                        }
                        else
                        answer = x / y;
                    } catch (ArithmeticException myErr) {
                        System.err.println("Деление на ноль недоступно");
                        System.exit(1);
                    }
                    break;
                default: throw new Exception();
            }
        } catch (Exception err){
            System.err.println("Неизвестный оператор");
            System.exit(2);
        }

            return answer;
        }

    }

