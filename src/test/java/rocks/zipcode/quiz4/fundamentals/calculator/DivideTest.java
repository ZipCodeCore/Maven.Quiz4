package rocks.zipcode.quiz4.fundamentals.calculator;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quiz4.fundamentals.Calculator;

/**
 * @author leon on 01/01/2019.
 */
public class DivideTest {
    @Test
    public void test1() {
        // given
        test(1.0, 100.0, 100.0);
    }

    @Test
    public void test2() {
        // given
        test(2.0, 100.0, 50.0);
    }

    @Test
    public void test3() {
        // given
        test(4.0, 100.0, 25.0);
    }

    @Test
    public void test4() {
        // given
        test(8.0, 100.0, 12.5);
    }

    @Test
    public void test5() {
        // given
        test(16.0, 100.0, 6.25);
    }

    private void test(Double expected, Double input1, Double input2) {
        // when
        Calculator calculator = new Calculator();
        Double actual = calculator.divide(input1, input2);

        // then
        Assert.assertEquals(expected, actual, 0.01);
    }
}
