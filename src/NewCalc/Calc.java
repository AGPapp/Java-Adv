package NewCalc;

public class Calc {
    private double x;
    private double y;
    private String o;
    public static double answer;
    public Calc(double x, double y, String o) {
        this.x = x;
        this.y = y;
        this.o = o;
    }

    public double Calculator() {
        switch (o) {
            case "+":
                Operation Plus = new Operation(x,y);
                answer = Plus.getPlus();
                break;
            case "-":
                Operation Minus = new Operation(x,y);
                answer = Minus.getMinus();
                break;
            case "*": Operation Um = new Operation(x,y);
                answer = Um.getUm();
                break;
            case "/": Operation Del = new Operation(x,y);
                answer = Del.getDel();
                break;

        }
        return answer;
    }

    }

