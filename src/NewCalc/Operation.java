package NewCalc;

public class Operation {
    double x;
    double y;
    double a;
    public Operation(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getPlus() {
        a = x+y;
        return a;
    }
    public double getMinus() {
        a = x-y;
        return a;
    }
    public double getUm() {
        a = x*y;
        return a;
    }
    public double getDel() {
        if (y==0){
            System.err.println("Ошибка: делние на ноль!");
            System.exit(0);
        }
        a = x / y;
        return a;

    }
}
