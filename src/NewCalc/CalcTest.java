package NewCalc;

import org.junit.Assert;
import org.junit.Test;

import java.util.InputMismatchException;

public class CalcTest {

    @Test
    public void sum() {
        double answer = new Calc(4.5, 5, "+").Calculator();
        Assert.assertEquals(9, answer, 0.5);
    }

    @Test
    public void minus() {
        double answer = new Calc(4, 5, "-").Calculator();
        Assert.assertEquals(-1, answer, 0);
    }

    @Test
    public void multi() {
        double answer = new Calc(4, 5, "*").Calculator();
        Assert.assertEquals(20, answer, 0);
    }

    @Test
    public void div() {
        double answer = new Calc(20, 5, "/").Calculator();
        Assert.assertEquals(4, answer, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void divOnNull() {
        new Calc(4, 0, "/").Calculator();
    }

    @Test(expected = InputMismatchException.class)
    public void whenNotOperator() {
        new Calc(4, 0, "g").Calculator();
    }



}