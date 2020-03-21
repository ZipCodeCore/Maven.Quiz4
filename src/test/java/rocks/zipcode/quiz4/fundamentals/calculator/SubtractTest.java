package rocks.zipcode.quiz4.fundamentals.calculator;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quiz4.fundamentals.Calculator;

/**
 * @author leon on 01/01/2019.
 */
public class SubtractTest {
    @Test
    public void test1() {
        // given
        test(0.0, 1.0, 1.0);
    }

    @Test
    public void test2() {
        // given
        test(1.0, 2.0, 1.0);
    }

    @Test
    public void test3() {
        // given
        test(1.5, 2.5, 1.0);
    }

    @Test
    public void test4() {
        // given
        test(-1.0, 0.0, 1.0);
    }

    @Test
    public void test5() {
        // given
        test(-1.5, -2.0, -0.5);
    }

    private void test(Double expected, Double input1, Double input2) {
        // when
        Calculator calculator = new Calculator();
        Double actual = calculator.subtract(input1, input2);

        // then
        Assert.assertEquals(expected, actual, 0);
    }
}
